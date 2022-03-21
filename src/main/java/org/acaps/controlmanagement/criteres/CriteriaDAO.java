package org.acaps.controlmanagement.criteres;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CriteriaDAO extends JpaRepository<Criteria,Long> {

    Criteria findCriteriaByIdentifiant(Long identifiant);


    @Query("SELECT c FROM Criteria c WHERE c.actif = 'O' AND  c.indicator.identifiant =:indicatorID")
    List<Criteria> findActiveCriteriaByIndicator(@Param("indicatorID") Long indicatorID);


}
