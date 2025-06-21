import java.time.OffsetDateTime;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var Baseyear = OffsetDateTime.now().getYear();
        System.out.print ("informe seu nome:\n");
        String name = scanner.next();

        System.out.print ("infome seu ano de nascimento\n");
        int year = scanner.nextInt();
        var age = Baseyear - year;
        System.out.printf("Seu nome é %s e sua idade é %s", name,age);


        }
        }