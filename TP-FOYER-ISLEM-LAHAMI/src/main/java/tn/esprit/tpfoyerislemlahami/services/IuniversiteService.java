package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Reservation;
import tn.esprit.tpfoyerislemlahami.entities.Universite;

import java.util.List;

public interface IuniversiteService {
    Universite add(Universite universite);
    Universite update(Universite universite);
    List<Universite> addUniversite(List<Universite> universites);

    List<Universite> updateUniversite (List<Universite> universites);
    void deleteUniversite(Universite universite);
    void deleteUniversiteById(long id);
    void deleteAll();
    void deleteAll(List<Universite> universites);
    List<Universite> findAll();
    Universite findById (long id);
    long count();
}
