import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {

    public PrimeFactors() {
    }

    public static List<Integer> generate(int number) {
        List<Integer> lista = new LinkedList();

        lista.add(1);
        if (checkPrime(number) & number != 1) {
            lista.add(number);
        } else {
            //warunek sprawdzania liczb 1 < p < number / 2
            int p = number / 2;
            for (int i = 2; i <= p; i++) {
                if (number % i == 0 & !lista.contains(i) & checkPrime(i)) {
                    lista.add(i);
                }
            }
        }
        //System.out.println(Arrays.toString(lista.toArray()));
        return lista;
    }

    private static boolean checkPrime(int number) {
        int check = 0;
        int p = (int) Math.sqrt(number);
        for (int i = 2; i <= p; i++) {
            if (number % i == 0) check += 1;
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }
}
