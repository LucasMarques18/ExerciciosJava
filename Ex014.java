import java.util.Scanner;
public class Ex014{
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa em que baseado na idade do user, informamos se eles está na faixa de votação opcional.
        // Ou seja, pessoas maiores ou com 16 anos e menores de 18 e também pessoas maiores de 70 anos. 

        System.out.print("Informe o ano que você nasceu: ");
        int ano = read.nextInt();
        int idade = 2022 - ano;

        if (idade >= 16 && idade <18){
            System.out.println("Voto Opcional!");
        } else if (idade >= 70){
            System.out.println("Voto Opcional!");
        } else if (idade < 16){
            System.out.println("Não pode votar!");
        } else {
            System.out.println("Voto obrigatorio!");
        }
    }
}