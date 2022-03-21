package org.acaps.controlmanagement.indicateur;

import lombok.RequiredArgsConstructor;
import org.acaps.controlmanagement.indicateur.dtos.IndicatorDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class IndicatorResource {


    private final IndicatorService indicatorService;

    /*@GetMapping("/indicators")
    public ResponseEntity<Page<IndicatorDTO>> getAllIndicator(@RequestParam(value = "page",defaultValue = "0") int page,@RequestParam(value = "size",defaultValue = "0") int size){
        return new ResponseEntity<>(this.indicatorService.getAllIndicator(page,size), HttpStatus.OK);
    }*/
    @GetMapping("/indicators")
    public ResponseEntity<List<IndicatorDTO>> getAllIndicator(){
        return new ResponseEntity<>(this.indicatorService.getAllIndicator(), HttpStatus.OK);

    }


    @PostMapping("/indicators")
    public ResponseEntity<IndicatorDTO> createIndicator(@RequestBody IndicatorDTO indicatorDTO){
        return new ResponseEntity<>(this.indicatorService.createIndicator(indicatorDTO),HttpStatus.CREATED);
    }

    @PutMapping("/indicators/{identifiant}")
    public ResponseEntity<Indicator> update(@PathVariable("identifiant") Long identifiant, @RequestBody Indicator indicator) {
        Indicator updateIndicator = this.indicatorService.update(identifiant, indicator);
        return new ResponseEntity<>(updateIndicator, HttpStatus.CREATED);
    }

    @PutMapping("/changeIndicatorStatus/{identifiant}")
    public ResponseEntity<IndicatorDTO> changeIndicatorStatus(@PathVariable("identifiant") Long identifiant, @RequestBody IndicatorDTO indicatorDTO) {
        return new ResponseEntity<>(this.indicatorService.changeIndicatorStatus(identifiant, indicatorDTO), HttpStatus.CREATED);

    }
    }
