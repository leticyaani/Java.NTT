//tabuada de acordo com o número digitado pelo usuário
import java.util.Scanner;

        public class Atividade3 {
    public static void main(String args []) {
        var scanner = new Scanner(System.in);

        System.out.print("digite um numero de 0 a 10:\n");
        int number = scanner.nextInt();

        for (var i = 0; i <= 10; i++)
            System.out.printf(" %d * %d = %d\n", number, i, number * i);
        scanner.close();
    }
}
