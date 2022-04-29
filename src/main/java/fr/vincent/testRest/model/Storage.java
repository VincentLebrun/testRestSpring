package fr.vincent.testRest.model;

//Import Lombok Generator
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//Using Lombok generators
@Getter
@Setter
@NoArgsConstructor

//Model Storage
@Entity
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "storage_seq")
    @SequenceGenerator(name= "storage_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String name;
    private String tel;
    private String email;
}
