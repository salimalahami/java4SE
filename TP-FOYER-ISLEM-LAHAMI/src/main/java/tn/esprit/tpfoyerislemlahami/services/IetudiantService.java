package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Chambre;
import tn.esprit.tpfoyerislemlahami.entities.Etudiant;

import java.util.List;

public interface IetudiantService {
    Etudiant add(Etudiant etudiant);
    Etudiant update(Etudiant etudiant);
    List<Etudiant> addEtudiant (List<Etudiant> etudiants);

    List<Etudiant> updateEtudiant (List<Etudiant> etudiants);
    void deleteEtudiant(Etudiant etudiant);
    void deleteEtudiantById(long id);
    void deleteAll();
    void deleteAll(List<Etudiant> etudiants);
    List<Etudiant> findAll();
    Etudiant findById (long id);
    long count();
}
