import java.util.Scanner;

public class imprimirDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Digitos digito = new Digitos();

        System.out.println("Impressor de digitos.");
        System.out.println("digite seu numero desejado.");

        digito.setDigito(scanner.nextInt());
        digito.getDigitos();

        scanner.close();

    
    }
    
}
