import java.util.Scanner;
public class Ex018 {   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa em que o usuário informe um valor e o programa retorne se esse valor é PAR ou IMPAR.

        System.out.print("Digite um valor: ");
        int valor = read.nextInt();

        if (valor % 2 ==0){
            System.out.println("Seu número é par!");
        } else {
            System.out.println("Seu número é impar!");
        }
    } 
}