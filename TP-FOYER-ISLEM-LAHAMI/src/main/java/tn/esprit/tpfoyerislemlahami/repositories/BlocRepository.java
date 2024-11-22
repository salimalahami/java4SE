package tn.esprit.tpfoyerislemlahami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.tpfoyerislemlahami.entities.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    List<Bloc> findByNomBloc(String nomBloc);
    List<Bloc> findByCapaciteBloc(long capaciteBloc);
    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc,long capaciteBloc);

    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);
    List<Bloc> findByCapaciteBlocGreaterThan(long capacite);
    List<Bloc> findByNomBlocContaining(String subStrinName);
    //Tri par nomBloc par ordre alphabétique Ascendant (bech yrajaa barcha blocs:findALLBy
    List<Bloc> findAllByOrderByNomBlocAsc();
    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc,long capaciteBloc);
    //Recherche des blocs d'un foyer spécifique
    List<Bloc> findByFoyerId(int foyer);

    //rechercher Blocs d-un foyer pour uen universite donnee(yaani el Foyer lien bin el bloc wel universite)
    List<Bloc> findByFoyerUniversiteId(long idUniversite);

    //JPQL
    @Query("SELECT b FROM Bloc b WHERE b.foyer.id =?1 ")
    List<Bloc>selectJPQL(int id);

    //sql
    @Query(value = "SELECT b.* FROM bloc join foyer f on b.foyer_id =f.id WHERE f.id=: idfoyer ", nativeQuery = true)
    List<Bloc>selectJPQL1(@Param("idfoyer") int idfoyer);





}
