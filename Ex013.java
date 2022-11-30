import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //screva um programa em que o user informe o seu ano em que ele nasceu e diga se ele é maior ou menor de idade. 
        
        System.out.print("Informe o ano de seu nascimento: ");
        int ano = read.nextInt();
        int idade = 2022 - ano;

        if (idade >=18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}