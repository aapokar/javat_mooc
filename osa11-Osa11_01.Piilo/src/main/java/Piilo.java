/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aapo
 */
public class Piilo<T> {
    
    private T piilossa;
    
    public Piilo() {
        this.piilossa = null;
    }
    
    public void laitaPiiloon(T piilotettava) {
        this.piilossa = piilotettava;
    }
    
    public T otaPiilosta() {
        T toka = this.piilossa;
        this.piilossa=null;
        return toka;
    }
    
    public boolean onkoPiilossa() {
        if (this.piilossa==null) {
            return false;
        }
        return true;
    }
    
}
