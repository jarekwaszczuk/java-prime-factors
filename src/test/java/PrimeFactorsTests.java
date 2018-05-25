import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrimeFactorsTests {
    private List lista;

    @Test
    public void generate1() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(1);

        Assertions.assertTrue(lista.size() == 1); //1
    }

    @Test
    public void generate2() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(2);

        Assertions.assertTrue(lista.size() == 2); //1,2
    }

    @Test
    public void generate3() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(3);

        Assertions.assertTrue(lista.size() == 2); //1,3
    }

    @Test
    public void generate4() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(4);

        Assertions.assertTrue(lista.size() == 2); //1,2
    }

    @Test
    public void generate5() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(5);

        Assertions.assertTrue(lista.size() == 2); //1,5
    }

    @Test
    public void generate6() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(6);

        Assertions.assertTrue(lista.size() == 3); //1,2,3
    }

    @Test
    public void generate7() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(7);

        Assertions.assertTrue(lista.size() == 2); //1,7
    }

    @Test
    public void generate8() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(8);

        Assertions.assertTrue(lista.size() == 2); //1,2
    }

    @Test
    public void generate9() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(9);

        Assertions.assertTrue(lista.size() == 2); //1,3
    }

    @Test
    public void generate10() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(10);

        Assertions.assertTrue(lista.size() == 3); //1,5
    }

    @Test
    public void generate11() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(11);

        Assertions.assertTrue(lista.size() == 2); //1,11
    }

    @Test
    public void generate12() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(12);

        Assertions.assertTrue(lista.size() == 3); //1,2,3
    }

    @Test
    public void generate13() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(13);

        Assertions.assertTrue(lista.size() == 2); //1,13
    }

    @Test
    public void generate14() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(14);

        Assertions.assertTrue(lista.size() == 3); //1,2,7
    }

    @Test
    public void generate41() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(41);

        Assertions.assertTrue(lista.size() == 2); //1,41
    }

    @Test
    public void generate111() {
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(111);

        Assertions.assertTrue(lista.size() == 3); //1,3,37
    }

    @Test
    public void generate2147483647() { //2^31 - 1 = 2 147 483 647
        PrimeFactors prime = new PrimeFactors();

        lista = prime.generate(2147483647);

        Assertions.assertTrue(lista.size() == 2); //1, 2'147'483'647
    }
}
