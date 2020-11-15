/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Aapo
 */
public class MaksimipainollinenLaatikko extends Laatikko {
    private ArrayList<Tavara> tavarat;
    private int maksimipaino;
//    private int saldo;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
//        this.saldo=0;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Tavara tavara) {
        int saldo = 0;
        
        for (Tavara tava: tavarat) {
            saldo += tava.getPaino();
        }
        
        
        if (saldo+tavara.getPaino() <= this.maksimipaino) {
            this.tavarat.add(tavara);
//            this.saldo+=tavara.getPaino();
        }
    }
    
    public boolean onkoLaatikossa(Tavara tavara) {
        if (this.tavarat.contains(tavara)){
            return true;
        }
        return false;
    }
    
}
