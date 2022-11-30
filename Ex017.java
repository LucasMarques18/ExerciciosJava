import java.util.Scanner;
public class Ex017 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa em que leia o ano em que usuário nasceu e retorne se ele é maior de idade ou menor de idade. 
        //(Considere maioridade +18)

        System.out.print("Informe o ano de seu nascimento: ");
        int ano = read.nextInt();
        int idade = 2022 - ano;

        if (idade >= 18){
            System.out.println("Você atingiu a maioridade!");
        } else {
            System.out.println("Você ainda não atingiu a maioridade!");
        }
    }
}