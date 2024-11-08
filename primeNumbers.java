import java.util.List;
import java.util.ArrayList;

public class primeNumbers {
    public static void main(String[] args) {
        System.out.println(primesNumbersRecursive(10));
        System.out.println(primesNumbersLinear(10));
    }

    public static List<Integer> primesNumbersRecursive(int n) {
        if (n < 2) {
            return new ArrayList<>();
        }
        // Aqui eu fa;o a recursvidade construir a lista de numeros primos
        // cada chamada calcula os numeros primos para um valor menor q n
        // ate chegar ao teste n < 2
        List<Integer> primes = primesNumbersRecursive(n - 1);
        if (isPrime(n, primes)) {
            primes.add(n);
        }
        return primes;
    }

    public static List<Integer> primesNumbersLinear(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 2) {
            return new ArrayList<>();
        }
        // aqui eu uso o for para verificar cada numero menor que n
        // para saber quais são os numeros primos
        for (int i = 2; i <= n; i++) {
            if (isPrime(i, primes)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // funcao simples que calcula se o resto de uma divisao e 0 para verificar se o
    // numero e primo
    public static boolean isPrime(int n, List<Integer> primes) {
        if (n <= 1) {
            throw new IllegalArgumentException("Apenas numero maior que 1 sao permitidos");
        }
        // for each para verificar se no array contem numeros primos
        for (int prime : primes) {
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }
}