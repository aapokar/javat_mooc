/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Aapo
 */
public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        esitteleKomennot();
        while (true) {
            System.out.print("Komento: ");
            String sana = this.lukija.nextLine();
            if (sana.equals("lopeta")) {
                break;
            }
            if (sana.equals("lisaa")) {
                lisaa();
            }
            if (sana.equals("kaanna")) {
                kaanna();
            }
            System.out.println("Tuntematon komento.");
        }
    }
    
    public void lisaa() {
        System.out.print("Suomeksi: ");
        String eka = this.lukija.nextLine();
        System.out.print("Käännös: ");
        String toka = this.lukija.nextLine();
        this.sanakirja.lisaa(eka, toka);
        System.out.println("");
    }
    
    public void kaanna() {
        System.out.println("Anna sana: ");
        String eka = this.lukija.nextLine();
        System.out.println("Käännös: " + this.sanakirja.kaanna(eka));
    }
    
    public void esitteleKomennot() {
        System.out.println("Komennot: ");
        System.out.println("lisaa - lisää sanaparin sanakirjaan");
        System.out.println("kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("lopeta - poistuu käyttöliittymästä");
    }
    
}
