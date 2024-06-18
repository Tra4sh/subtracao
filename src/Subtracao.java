import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();

        int resultado = 0;

        if (valor1 > valor2){
            resultado = valor1 - valor2;
        } else {
            resultado = valor2 - valor1;

    }
}
