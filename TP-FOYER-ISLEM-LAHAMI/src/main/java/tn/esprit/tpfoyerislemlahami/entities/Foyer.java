package tn.esprit.tpfoyerislemlahami.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Table(name = "Foyer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;
    private String nomFoyer ;
    private long capaciteFoyer;
    @ManyToOne
    private Universite universite;
    @OneToMany
    private List<Bloc> blocs;

}
