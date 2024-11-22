package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Universite;
import tn.esprit.tpfoyerislemlahami.repositories.UniversiteRepository;

import java.util.List;

public class UniversiteService implements IuniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public Universite add(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite update(Universite universite) {
        return null;
    }

    @Override
    public List<Universite> addUniversite(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public List<Universite> updateUniversite(List<Universite> universites) {
        return null;
    }

    @Override
    public void deleteUniversite(Universite universite) {

    }

    @Override
    public void deleteUniversiteById(long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAll(List<Universite> universites) {

    }

    @Override
    public List<Universite> findAll() {
        return null;
    }

    @Override
    public Universite findById(long id) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
