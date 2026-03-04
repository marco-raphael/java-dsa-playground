package algoritmos;

public class Recursao {

    public static void main(String[] args){

        System.out.println(recursaoFatorialSemCalda(5));
        System.out.println(recursaoFatorialComCalda(5, 1));

    }

    public static int recursaoFatorialSemCalda(int n) {
        if (n <= 1) return 1;
        return n * recursaoFatorialSemCalda(n - 1);
    }

    public static int recursaoFatorialComCalda(int n, int acumulador) {
        if (n <= 1) return acumulador;
        return recursaoFatorialComCalda(n - 1, n * acumulador);
    }

}
