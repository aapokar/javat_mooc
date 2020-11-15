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
public class YhdenTavaranLaatikko extends Laatikko {

    private ArrayList<Tavara> tavara;

    public YhdenTavaranLaatikko() {
        this.tavara = new ArrayList<>();
    }
    
    public void lisaa(Tavara tavara) {
        if (this.tavara.isEmpty()) {
            this.tavara.add(tavara);
        }
    }
    
    public boolean onkoLaatikossa(Tavara tavara) {
        if (this.tavara.contains(tavara)) {
            return true;
        }
        return false;
    }
    
    

    
}
