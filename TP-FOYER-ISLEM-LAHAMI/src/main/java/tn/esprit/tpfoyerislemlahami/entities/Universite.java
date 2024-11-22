package tn.esprit.tpfoyerislemlahami.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name = "Universite")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)



public class Universite {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long  idUniversite;
    private String universiteName;
    private String Address;

    @OneToOne
    private Foyer foyer;

}
