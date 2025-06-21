import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        var Scanner = new Scanner(System.in);

        System.out.print ("pessoa 1 informe seu nome:");
        String name1 = Scanner.next();

        System.out.print ("pessoa 2 informe seu nome:");
        String name2 = Scanner.next();

        System.out.print ("pessoa 1 informe sua idade:");
        String age1 = Scanner.next();

        System.out.print ("pessoa 2 informe sua idade:");
        String age2 = Scanner.next();

        System.out.printf("%s - %s = %s",age1,age2);

    }
}