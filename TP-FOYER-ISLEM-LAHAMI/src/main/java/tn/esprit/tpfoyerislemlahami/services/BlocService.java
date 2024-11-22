package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Bloc;
import tn.esprit.tpfoyerislemlahami.repositories.BlocRepository;

import java.util.List;

public class BlocService implements IblocService{
    BlocRepository blocRepository;

    @Override
    public Bloc add(Bloc bloc) {
        return blocRepository.save(bloc) ;
    }

    @Override
    public Bloc update(Bloc bloc) {
        return blocRepository.save(bloc);
    }


    @Override
    public List<Bloc> addBloc(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public List<Bloc> updateBloc(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public void deleteBloc(Bloc bloc) {
        blocRepository.delete(bloc);

    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);

    }

    @Override
    public void deleteAll() {
        blocRepository.deleteAll();

    }

    @Override
    public void deleteAll(List<Bloc> blocs) {
        blocRepository.deleteAll(blocs);

    }

    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long id) {
        //blocRepository.findById(id).orElse(...);
        Bloc bloc= new Bloc();
        bloc.setIdBloc(0);
        bloc.setNomBloc("tt");
        bloc.setCapaciteBloc(0);

        return blocRepository.findById(id).get();

    }

    @Override
    public long count() {
        return blocRepository.count();
    }

    @Override
    public boolean existById(long id) {
        return blocRepository.existsById(id);
    }
}
