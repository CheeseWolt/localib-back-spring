package cheesewolt.localib.locataire;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Locataire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String nom;
    @Column(nullable = false)
    String prenom;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_naissance", nullable = false)
    Date date_naissance;
    @Column(nullable = false, unique = true)
    String email;
    @Column(nullable = false, unique = true)
    String telephone;

    public Locataire() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
