package org.acaps.controlmanagement.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ConverterHelper {
    private final Base64.Encoder encoder = Base64.getEncoder();
    private final  Base64.Decoder decoder = Base64.getDecoder();
    private final ObjectMapper mapper = new ObjectMapper();

    public  String convertJava2Json(Object object) {
        String resultJson = "";
        try {

            resultJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ConverterHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultJson;
    }

    public  <T> T convertJson2Java(String jsonString, Class<T> cls) {
        T result = null;
        try {
            result = mapper.readValue(jsonString, cls);

        } catch (IOException ex) {
            Logger.getLogger(ConverterHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public  String encoder(String str) {
        return encoder.encodeToString(str.getBytes());
    }
    public  String decoder(String str) {
        return new String(decoder.decode(str));
    }



}
