package org.acaps.controlmanagement.utils;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class DeleteFile {

    public void delete(File file){
        file.setWritable(true);
        if (file.delete()) {
        } else {
        }
    }
}