package org.acaps.controlmanagement.criteres;

import lombok.RequiredArgsConstructor;
import org.acaps.controlmanagement.exception.ItemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CriteriaResource {


    private final CriteriaService criteriaService;

    @GetMapping("/criteria")
    public ResponseEntity<List<CriteriaDTO>> getAllCriteria(){
        return new ResponseEntity<>(this.criteriaService.getAllCriteria(), HttpStatus.OK);
    }

    @GetMapping("/findActiveCriteriaByIndicator/{indicatorID}")
    public ResponseEntity<List<CriteriaDTO>> findActiveCriteriaByIndicator(@PathVariable Long indicatorID){
        return new ResponseEntity<>(this.criteriaService.findActiveCriteriaByIndicator(indicatorID), HttpStatus.OK);
    }
    @PostMapping("/criteria/{identifiant}")
    public ResponseEntity<CriteriaDTO> createCriteria(@PathVariable Long identifiant, @RequestBody CriteriaDTO criteriaDTO) throws ItemNotFoundException {
        return new ResponseEntity<>(this.criteriaService.createCriteria(identifiant,criteriaDTO), HttpStatus.CREATED);
    }

    @PutMapping("/criteria/{identifiantCriteria}/{identifiantIndicator}")
    public ResponseEntity<CriteriaDTO> updateCriteria(
            @PathVariable Long identifiantCriteria,@PathVariable Long identifiantIndicator,
            @RequestBody CriteriaDTO criteriaDTO) throws ItemNotFoundException {
        return new ResponseEntity<>(this.criteriaService.updateCriteria(identifiantCriteria,identifiantIndicator,criteriaDTO), HttpStatus.CREATED);
    }

    @PutMapping("/changeCriteriaStatus/{identifiantCriteria}/{identifiantIndicator}")
    public ResponseEntity<CriteriaDTO> changeCriteriaStatus(
            @PathVariable Long identifiantCriteria,@PathVariable Long identifiantIndicator,
            @RequestBody CriteriaDTO criteriaDTO) throws ItemNotFoundException {
        return new ResponseEntity<>(this.criteriaService.changeCriteriaStatus(identifiantCriteria,identifiantIndicator,criteriaDTO), HttpStatus.CREATED);
    }

}
