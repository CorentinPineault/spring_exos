package com.example.demo.models;

public class Developer {
    private String nom;
    private int nbAnneesXp;

    public Developer(String nom, int nbAnneesXp) {
        System.out.println("Construction dev debut");
        this.nom = nom;
        this.nbAnneesXp = nbAnneesXp;
        System.out.println("Construction dev fin");
    }

    public Developer() {
        System.out.println("Construction dev debut");
        System.out.println("Construction dev fin");
    }

    public String getNom() {
        System.out.println("getNom");
        return nom;
    }

    public void setNom(String nom) {
        System.out.println("setNom");

        this.nom = nom;
    }

    public int getNbAnneesXp() {
        System.out.println("getNbAnneesXp");
        return nbAnneesXp;
    }

    public void setNbAnneesXp(int nbAnneesXp) {
        System.out.println("setNbAnneesXp");
        this.nbAnneesXp = nbAnneesXp;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "nom='" + nom + '\'' +
                ", nbAnneesXp=" + nbAnneesXp +
                '}';
    }
}
