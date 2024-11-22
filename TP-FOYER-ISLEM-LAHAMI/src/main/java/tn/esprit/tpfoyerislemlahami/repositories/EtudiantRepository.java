package tn.esprit.tpfoyerislemlahami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyerislemlahami.entities.Etudiant;
import tn.esprit.tpfoyerislemlahami.entities.Universite;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    List<Etudiant> findAllByNomAndPrenom(String nomEt,String PrenomEt);
    List<Etudiant> findAllByNomOrPrenom(String n,String P);
    //select * from Etudiant WHERE cin<
    List<Etudiant> findAllByCinLessThan(Long cin);
    List<Etudiant> findAllByCinGreaterThan(Long cin);
    List<Etudiant> findAllByCinBetween(Long min, Long max);
    //select max from user where cin=
    List<Etudiant> findNomByCin(Long cin);
        // select * from user where nom like avec 3methodes
    List<Etudiant>findByNomEtLike(String nom);
    List<Etudiant>findByNomEtContains(String nom);
    List<Etudiant>findByNomEtContaining(String nom);
    List<Etudiant>findByNomEtNotNull(String nom);
    List<Etudiant>findByNomEtNull(String nom);
    //recuperer la liste des etudiant de luniversite dont son nom passe en parametre



    List<Etudiant> findByEtudiantsResevationsChambresBlocsFoyer(String  nomEt);
}
