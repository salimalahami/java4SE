package tn.esprit.tpfoyerislemlahami.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpfoyerislemlahami.entities.Chambre;
import tn.esprit.tpfoyerislemlahami.repositories.ChambreRepository;

import java.util.List;
@Service
public class ChamreService implements IchambreService{
    ChambreRepository chambreRepository;
    @Override
    public Chambre add(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre update(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> addChambre(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> updateChambre(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public void deleteChambre(Chambre chambre) {
        chambreRepository.delete(chambre);

    }

    @Override
    public void deleteChambreById(long id) {
        chambreRepository.deleteById(id);

    }

    @Override
    public void deleteAll() {
        chambreRepository.deleteAll();

    }

    @Override
    public void deleteAll(List<Chambre> chambres) {
        chambreRepository.deleteAll(chambres);

    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public long count() {
        return chambreRepository.count();
    }
    @Override
    public boolean existById(long id) {
        return chambreRepository.existsById(id);
    }
}
