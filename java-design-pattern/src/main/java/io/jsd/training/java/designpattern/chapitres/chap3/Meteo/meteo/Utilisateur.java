﻿package io.jsd.training.java.designpattern.chapitres.chap3.Meteo.meteo;public class Utilisateur {	public static void main(String[] args) {		DonneesMeteo donneesMeteo = new DonneesMeteo();		donneesMeteo.setTemperature(24.00);		donneesMeteo.setVitesseVent(10.00);		donneesMeteo.setTauxHumidite(8.20);		WidgetMeteo widgetMeteo = new WidgetMeteo(donneesMeteo);		PluginMeteo pluginMeteo = new PluginMeteo(donneesMeteo);		donneesMeteo.setTemperature(25.00);		donneesMeteo.setTauxHumidite(7.00);	}}