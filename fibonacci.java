public class fibonacci {
    public static int fiboRecursive(int n) {
        // Aqui eu testo para ver se o argumento N é valido
        if (n < 0) {
            throw new IllegalArgumentException("Numero deve maior ou igual a zero.");
        }
        // Como no Fibonacci se N for 0 ou 1 ele é igual
        // a 0 ou 1 respectivamente
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        }
        // Como é uma função recursiva estou chamando elas
        // Passando um N inteiro menos 1
        // Somando com um N inteiro menos 2 dele e retornando
        return fiboRecursive(n - 1) + fiboRecursive(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fiboRecursive(5));
        System.out.println(fiboLinear(5));
    }

    public static int fiboLinear(int n) {
        // Aqui eu testo para ver se o argumento N é valido
        if (n < 0) {
            throw new IllegalArgumentException("Numero deve ser maior ou igual a zero.");
        }
        // Como no Fibonacci se N for 0 ou 1 ele é igual
        // a 0 ou 1 respectivamente
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        }
        int term1 = 0, term2 = 1;
        // Estou iterando sobre N inteiro, guardando o valor do proximo
        // Termo em nextTerm com a soma dos dos dois ultimos termos
        // assim fazendo a troca de valores em cada iteração
        // term1 recebendo term2 e term2 recebendo o nextTerm
        for (int i = 2; i <= n; i++) {
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
        return term2;
    }
}
