import java.util.Scanner;
public class Ex015 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa em o computador pense em número entre 1 e 5 e o usuário precisa dar um palpite. 
        //Se ele acertar o valor, o user venceu. Caso contrário, informe qula foi o valor pensando pelo computador.

        double n = Math.random()*(6-1);
        int computador = (int)n;
        System.out.print("Diga seu palpite: ");
        int user = read.nextInt();

        if (computador == user){
            System.out.println("Você acertou!!");
        } else {
            System.out.println("Você errou!!");
        }
    }   
}