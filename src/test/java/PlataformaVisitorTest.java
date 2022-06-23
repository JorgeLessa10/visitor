import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
** created by: jorge.lessa
*/
class PlataformaVisitorTest {

    @Test
    void deveExibirComputadorSemPlacaDeVideo()
    {
        Computador computador = new Computador("Asus prime B450M", "DDR4 16GB",
                "Intel Core i5", "SSD 500GB", "Corsair CV550");

        PlataformaVisitor visitor = new PlataformaVisitor();
        assertEquals("Computador{placaMae='Asus prime B450M', memoriaRam='DDR4 16GB', processador='Intel Core i5', armazenamento='SSD 500GB', fonte='Corsair CV550', placaDeVideo='Sem placa de vídeo'}", visitor.exibir(computador));
    }

    @Test
    void deveExibirComputadorComPlacaDeVideo()
    {
        Computador computador = new Computador("Asus prime B450M", "DDR4 16GB",
                "Intel Core i7", "SSD 500GB", "Corsair CV550");
        computador.setPlacaDeVideo("NVIDIA GeForce RTX 2060");
        PlataformaVisitor visitor = new PlataformaVisitor();
        assertEquals("Computador{placaMae='Asus prime B450M', memoriaRam='DDR4 16GB', processador='Intel Core i7', armazenamento='SSD 500GB', fonte='Corsair CV550', placaDeVideo='NVIDIA GeForce RTX 2060'}", visitor.exibir(computador));
    }

    @Test
    void deveExibirPs4()
    {
        Ps4 ps4 = new Ps4("Ps4 Pro", "1TB");
        PlataformaVisitor visitor = new PlataformaVisitor();
        assertEquals("Ps4{modelo='Ps4 Pro', capacidadeArmazenamento=1TB}", visitor.exibir(ps4));
    }

    @Test
    void deveExibirXboxOne()
    {
        XboxOne xboxOne = new XboxOne("Xbox One X", "1TB");
        PlataformaVisitor visitor = new PlataformaVisitor();
        assertEquals("XboxOne{modelo='Xbox One X', capacidadeArmazenamento=1TB}", visitor.exibir(xboxOne));
    }
}