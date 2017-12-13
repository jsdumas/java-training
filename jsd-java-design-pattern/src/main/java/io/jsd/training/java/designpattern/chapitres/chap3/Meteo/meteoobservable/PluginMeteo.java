﻿package io.jsd.training.java.designpattern.chapitres.chap3.Meteo.meteoobservable;import java.util.Observable;import java.util.Observer;public class PluginMeteo implements Observer {    protected Double temperature;    protected Double vitesseVent;    protected Double tauxHumidite;    public PluginMeteo() {    }    public void update(Observable obs, Object arg) {        temperature = ((DonneesMeteo) obs)                .getTemperature();        vitesseVent = ((DonneesMeteo) obs)                .getVitesseVent();        tauxHumidite = ((DonneesMeteo) obs)                .getTauxHumidite();        affiche();    }    public void affiche() {        System.out                .println("Le Plugin affiche une température de: "                        + temperature                        + ", une vitesse de vent de: "                        + vitesseVent                        + " et un taux d’humidité de:"                        + tauxHumidite);    }}