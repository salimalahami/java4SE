package tn.esprit.tpfoyerislemlahami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyerislemlahami.entities.Foyer;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,Integer> {
    List<Foyer> findByBlocId(int idBloc);
    List<Foyer> findByIdAndBlocId(int id , int idBloc);
    List<Foyer> findByBlocBCapacite(long capaciteBloc);
    List<Foyer> findByBlocNomAndUniversiteNom(String nomBloc,String UniversiteName);

    
}
