package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Bloc;
import tn.esprit.tpfoyerislemlahami.entities.Chambre;

import java.util.List;

public interface IchambreService {
    Chambre add(Chambre chambre);
    Chambre update(Chambre chambre);
    List<Chambre> addChambre (List<Chambre> chambres);

    List<Chambre> updateChambre (List<Chambre> chambres);
    void deleteChambre(Chambre chambre);
    void deleteChambreById(long id);
    void deleteAll();
    void deleteAll(List<Chambre> chambres);
    List<Chambre> findAll();
    Chambre findById (long id);
    long count();

    boolean existById(long id);
}
