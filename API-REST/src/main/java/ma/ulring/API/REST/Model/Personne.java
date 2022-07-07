package ma.ulring.API.REST.Model;

import com.sun.istack.NotNull;
import javax.validation.constraints.Pattern;

import javax.persistence.*;

@Entity
@Table(name = "personne")
public class Personne {
    //attribus
    @Id
    //Id auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String prenom;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String nom;
    @NotNull
    @Column(unique = true)//unique par personne
    @Pattern(regexp = "^[\\p{Alnum}]{1,32}$")
    private String cin;

    //constructeur

    public Personne() {}

    public Personne(String cin, String nom, String prenom) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }

//accesseurs get/set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }




}