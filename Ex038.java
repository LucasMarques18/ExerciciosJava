import java.util.Scanner;
public class Ex038 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa que pergunte ao usuario um numero inteiro e positivo
        //qualquer e mostre uma contagem ate esse valor 

        System.out.print("Digite um valor: ");
        int x = read.nextInt();
        int y = 1;

        while (x < 0){
            System.out.println("Resposta invalida!");
            System.out.print("Digite um número maior que 0: ");
            x = read.nextInt();
        }

        while (y <= x){
            System.out.print(y + " ");
            y++;
        }
        System.out.print("\nAcabou!");
    }
}