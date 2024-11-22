package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Foyer;
import tn.esprit.tpfoyerislemlahami.repositories.FoyerRepository;

import java.util.List;

public class FoyerService implements IfoyerService{
    FoyerRepository foyerRepository;
    @Override
    public Foyer add(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer update(Foyer foyer) {
        return null;
    }

    @Override
    public List<Foyer> addFoyer(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public List<Foyer> updateFoyer(List<Foyer> foyers) {
        return null;
    }

    @Override
    public void deleteFoyer(Foyer foyer) {

    }

    @Override
    public void deleteFoyerById(long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAll(List<Foyer> foyers) {

    }

    @Override
    public List<Foyer> findAll() {
        return null;
    }

    @Override
    public Foyer findById(long id) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
