/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author Aapo
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti>{
//    public 

    @Override
    public int compare(Kortti k1, Kortti k2) {
        if (k1.getMaa() == k2.getMaa()) {
            return k1.getArvo() - k2.getArvo();
        }

        return k1.getMaa().compareTo(k2.getMaa());
    }
    }

//    @Override
//    public Comparator<Kortti> thenComparing(Comparator<? super Kortti> other) {
//        other = 
//        return Comparator.super.thenComparing(other); //To change body of generated methods, choose Tools | Templates.
//    }
