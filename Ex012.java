import java.util.Scanner;
public class Ex012 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa que receba dois valores do user. Caso o primeiro seja maior que o segundo, 
        //faça o primeiro menos o segundo. Caso contrário, some os valores.
        
        System.out.print("Digite o primeiro valor: ");
        int v1 = read.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = read.nextInt();
        int x;

        if (v1 > v2){
            x = v1 - v2;
        } else {
            x = v1 + v2;
        }
        System.out.println("= " + x);
    }   
}