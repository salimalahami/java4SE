package tn.esprit.tpfoyerislemlahami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.tpfoyerislemlahami.entities.Chambre;
import tn.esprit.tpfoyerislemlahami.entities.Typechambre;

import java.time.LocalDate;
import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
  List<Chambre> findByNumeroChambre(long numeroChambre);
  List<Chambre> findByTypechambre(Typechambre typechambre);
  List<Chambre>findByBlocId(int idBloc);
  List<Chambre> findByBlocIdAndTypechambre(int idBloc,Typechambre typechambre);
  List<Chambre> findByNumeroChambreAndTypechambre(long numeroChambre,Typechambre typechambre);
  List<Chambre> findByFoyerUniversiteNomAndReservationAnneeAndResrvationEtudiantNomAndNumeroChambre(String nomUniversite, LocalDate anneUniversitaire, String nomEt, long numeroChambre);

//@Query("SELECT COUNT(c) FROM Chambre c WHERE c.typeChambre = :typeChambre AND c.foyer.nom = :foyerNom")
//int countByTypeChambreAndFoyerNom(String typeChambre, String foyerNom);

}
