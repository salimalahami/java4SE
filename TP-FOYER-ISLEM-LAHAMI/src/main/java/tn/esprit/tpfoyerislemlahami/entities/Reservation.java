package tn.esprit.tpfoyerislemlahami.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "Reservation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    private String reservationId;
    private LocalDate anneUniversitaire;
    private Boolean estValide;
    @ManyToMany

    List<Etudiant> etudiants;
    @ManyToOne
    private Chambre chambre;


}
