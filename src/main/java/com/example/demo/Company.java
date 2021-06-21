package com.example.demo;

public class Company {
    private String nom;
    private Developer cp;
    private Developer dev;

    public Company(String nom, Developer cp, Developer dev) {
        System.out.println("Construction comp debut");
        this.nom = nom;
        this.cp = cp;
        this.dev = dev;
        System.out.println("Construction comp fin");
    }

    public Company() {
        System.out.println("Construction comp debut");
        System.out.println("Construction comp fin");
    }

    public String getNom() {
        System.out.println("getNom");
        return nom;
    }

    public void setNom(String nom) {
        System.out.println("setNom");
        this.nom = nom;
    }

    public Developer getCp() {
        System.out.println("getCp");
        return cp;
    }

    public void setCp(Developer cp) {
        System.out.println("setCp");
        this.cp = cp;
    }

    public Developer getDev() {
        System.out.println("getDev");
        return dev;
    }

    public void setDev(Developer dev) {
        System.out.println("setDev");
        this.dev = dev;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nom='" + nom + '\'' +
                ", cp=" + cp +
                ", dev=" + dev +
                '}';
    }
}
