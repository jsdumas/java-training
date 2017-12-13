﻿package io.jsd.training.java.designpattern.chapitres.chap3.Meteo.meteo;public class PluginMeteo implements Observateur {    protected DonneesMeteo donneesMeteo;    protected Double temperature;    protected Double vitesseVent;    protected Double tauxHumidite;    public PluginMeteo(DonneesMeteo donneesMeteo) {        this.donneesMeteo = donneesMeteo;        donneesMeteo.ajoute(this);        this.actualise();    }    public void actualise() {        temperature = donneesMeteo.getTemperature();        vitesseVent = donneesMeteo.getVitesseVent();        tauxHumidite = donneesMeteo.getTauxHumidite();        affiche();    }    public void affiche() {        System.out                .println("Le Plugin affiche une température de: "                        + temperature                        + ", une vitesse de vent de: "                        + vitesseVent                        + " et un taux d’humidité de:"                        + tauxHumidite);    }}