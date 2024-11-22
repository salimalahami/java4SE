package tn.esprit.tpfoyerislemlahami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyerislemlahami.entities.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {

    //Rechercher la liste des universités dont la capacité de leur foyer est inférieure à la valeur passée en paramètre, en tenant compte de la liaison entre le foyer et l'université
    List<Universite> findByFoyerCapaciteFoyerLessThan( Long capaciteFoyer);
}
