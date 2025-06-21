//Tabela imc
import java.util.Scanner;

    public class Atividade4 {
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);

            System.out.print("Digite sua altura:\n");
            double height = scanner.nextDouble();

            System.out.print("Digite seu peso:\n");
            double weight = scanner.nextDouble();

            double imc = weight / (height * height);

            if (imc <= 18.5) {
                System.out.print("Abaixo do peso");
            }
            if (imc >= 18.6 && imc <= 24.9) {
                System.out.print("peso ideal");
            }
            if (imc >= 25.0 && imc <= 29.9) {
                System.out.print("Levemente acima do peso");
            }
            if (imc >= 30.0 && imc <= 34.9) {
                System.out.print("Obesidade grau I");
            }
            if (imc >= 35.0 && imc <= 39.9) {
                System.out.print("Obesidade grau II (Severa");
            }
            if (imc >= 40)
                System.out.println("Obesidade III (Mórbida");
            }
            
        }

