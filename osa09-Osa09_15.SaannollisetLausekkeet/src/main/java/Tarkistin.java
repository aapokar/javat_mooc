

public class Tarkistin {
    
    private String lyhenne;
    
    public Tarkistin (String sana) {
        this.lyhenne=sana;
    }
    
    public Tarkistin () {
        
    }
    
    public boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("(ma|ti|ke|to|pe|la|su)")) {
            return true;
        }
        return false;
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("(a|e|i|o|u|y|ä|ö)*")) {
            return true;
        }
        return false;
    }
    
    public boolean kellonaika(String merkkijono) {
        String[] luvut = merkkijono.split(":");
        if (luvut.length == 3) {
            if (luvut[0].matches("(0|1|2)[0-9]*")&&Integer.valueOf(luvut[0])<24&&luvut[1].matches("[012345][0-9]*")&&luvut[2].matches("[012345][0-9]*")) {
                return true;
            }
        }
        return false;
    }

}
