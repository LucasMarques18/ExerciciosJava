import java.util.Scanner;
public class Ex016 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa em que recebemos duas notas do usuário e, caso a média entre essas duas notas seja maior ou igual à 9, 
        //escreva na tela “Parabéns!”.

        System.out.print("Digite a primeira nota: ");
        float n1 = read.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = read.nextFloat();
        float media;

        media = (n1 + n2)/2;

        if (media >= 9){
            System.out.println("Parabéns!!!");
        } else {
            System.out.println("Não foi dessa vez");
        }
    }    
}