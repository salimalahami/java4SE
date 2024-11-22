package tn.esprit.tpfoyerislemlahami.services;

import org.apache.catalina.User;
import tn.esprit.tpfoyerislemlahami.entities.Bloc;

import java.util.List;

public interface IblocService {
    Bloc add(Bloc bloc);
    Bloc update(Bloc bloc);
    List<Bloc> addBloc (List<Bloc> blocs);

    List<Bloc> updateBloc (List<Bloc> blocs);
    void deleteBloc(Bloc bloc);
    void deleteBlocById(long id);
    void deleteAll();
    void deleteAll(List<Bloc> blocs);
    List<Bloc> findAll();
    Bloc findById (long id);
    long count();

    boolean existById(long id);
}
