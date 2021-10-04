import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendedorSopaipillasTest {
    VendedorSopaipillas s;
    @BeforeEach
    void setUp() {
        s = new VendedorSopaipillas(250, 1000);
    }

    @AfterEach
    void tearDown() {
        s = null;
    }

    @Test
    void getPrecioSopaipillas() {
        assertEquals(-1,s.getVuelto(500,10));
    }
    @Test
    void getVuelto() {
        assertEquals(-1,s.getVuelto(300,10000));

    }
    @Test
    void getVuelto2() {
        assertEquals(0,s.getVuelto(30000,10000));

    }
    @Test
    void enStock(){
        assertTrue(s.enStock(500));
    }
    @Test
    void enStock2(){
        assertFalse(s.enStock(1001));
    }


}

