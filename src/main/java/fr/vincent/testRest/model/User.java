package fr.vincent.testRest.model;

//Import Lombok Generator
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Import tools
import javax.persistence.*;

//Using Lombok generators
@Getter
@Setter
@NoArgsConstructor

//Model User
@Entity
@Table(name = "user_account")
//Rename the table because user cannot work in sql so transform name table
public class User {
//à utiliser le manytomany car la sécurité demandera un ou des rôles
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name= "pokemon_seq", initialValue = 1000, allocationSize = 1)
    private Long id;
    private String firstname;
    private String lastName;
    private int age;
    private String email;
    private String password;
}

