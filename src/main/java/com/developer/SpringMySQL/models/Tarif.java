package com.developer.SpringMySQL.models;

import javax.persistence.*;


@Entity
@Table(name = "tarif")
public class Tarif {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "plageHoraire")
    private String plageHoraire;
    @Column(name = "montant")
    private float montant;

    public Tarif() {
    }

    public Tarif(String nom, String plageHoraire, float montant) {
        this.nom = nom;
        this.plageHoraire = plageHoraire;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPlageHoraire() {
        return plageHoraire;
    }

    public void setPlageHoraire(String plageHoraire) {
        this.plageHoraire = plageHoraire;
    }
    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }


}
