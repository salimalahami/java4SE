package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Etudiant;
import tn.esprit.tpfoyerislemlahami.repositories.EtudiantRepository;

import java.util.List;

public class EtudiantService implements IetudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant add(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant update(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> addEtudiant(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public List<Etudiant> updateEtudiant(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public void deleteEtudiant(Etudiant etudiant) {
        etudiantRepository.delete(etudiant);

    }

    @Override
    public void deleteEtudiantById(long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public void deleteAll() {
        etudiantRepository.deleteAll();

    }

    @Override
    public void deleteAll(List<Etudiant> etudiants) {
        etudiantRepository.deleteAll(etudiants);

    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public long count() {
        return 0;
    }
}
