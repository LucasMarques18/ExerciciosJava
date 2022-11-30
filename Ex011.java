import java.util.Scanner;
public class Ex011{
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa que receba do user dois valores e depois informe qual deles é o maior.

        System.out.print("Digite o primeiro valor: ");
        int v1 = read.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = read.nextInt();

        if (v1 > v2){
            System.out.println("O maior valor é o primeiro!");
        } else {
            System.out.println("O maior valor é o segundo!");
        }
    }
}