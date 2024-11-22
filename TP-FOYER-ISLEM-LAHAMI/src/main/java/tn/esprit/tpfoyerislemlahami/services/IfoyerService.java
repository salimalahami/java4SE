package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Etudiant;
import tn.esprit.tpfoyerislemlahami.entities.Foyer;

import java.util.List;

public interface IfoyerService {
    Foyer add(Foyer foyer);
    Foyer update(Foyer foyer);
    List<Foyer> addFoyer (List<Foyer> foyers);

    List<Foyer> updateFoyer (List<Foyer> foyers);
    void deleteFoyer(Foyer foyer);
    void deleteFoyerById(long id);
    void deleteAll();
    void deleteAll(List<Foyer> foyers);
    List<Foyer> findAll();
    Foyer findById (long id);
    long count();
}
