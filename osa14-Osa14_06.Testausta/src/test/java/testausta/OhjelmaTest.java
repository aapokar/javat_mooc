package testausta;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class OhjelmaTest {
    @Test
    public void testaaYhdellaPullolla() {
        assertTrue(Ohjelma.suorita(new Scanner("1\n-1")).contains("Pulloja: 1"));
    }
    
    @Test
    public void ilmanPullojaKeskiarvoaEiVoiLaskea() {
        assertTrue(Ohjelma.suorita(new Scanner("-4\n-2\n-1")).contains("voida"));
    }
    
    @Test
    public void kahdellaOppilaallaTulostuksessaOppilaitaKaksi() {
        assertEquals(null, "Pulloja: 5\nOppilaita: 2\nKeskiarvo: 2.5", Ohjelma.suorita(new Scanner("2\n3\n-4\n-1")));
    }
    // toteuta tänne testit luokkaa Ohjelma-varten
}
