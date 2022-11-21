import java.util.Scanner;

public class Main {

    private final static double MULTIPLICACION = 3;
    private static int entrada1;

    public static void main(String[] args) {
        System.out.println("Hola mundo soy danna!");
        Scanner entrada = new Scanner(System.in);
        entrada1 = entrada.nextInt();
        System.out.println("resultado: " + (MULTIPLICACION * entrada1));

    }
}