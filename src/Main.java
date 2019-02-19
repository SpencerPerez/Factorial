public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial");
        System.out.println(String.format("Factorial de 1 es %d", Factorial(1)) );
        System.out.println(String.format("Factorial de 2 es %d", Factorial(2)) );
        System.out.println(String.format("Factorial de 3 es %d", Factorial(3)) );
        System.out.println(String.format("Factorial de 20 es %d", Factorial(20)) );
        System.out.println(String.format("Factorial de 101 es %d", Factorial(101)) );
        System.out.println(String.format("Factorial de -1 es %d", Factorial(-1)) );

    }

    private static long Factorial(long n){
        if(n < 0 || n > 100){
            System.out.println("Numero invalido");
            return -1;
        }
        long result = 1;
        for (int i = 1; i < n; i++) {
            result += i * result;
        }
        return result;
    }
}
