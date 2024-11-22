package tn.esprit.tpfoyerislemlahami.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Table(name = "Chambre")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Chambre {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long idChambre;
    private long numeroChambre;
    private   Typechambre Typechambre;
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    List<Reservation>reservations;



}
