import java.util.Scanner;
public class Ex043 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

    //Escreva um programa que leia varios numeros do usuario. Pare apenas quando o usuario nao quiser mais proseguir e sem seguida
    //mostre a soma de todos os números digitados pelo usuario.
            
       int x;
       String i;

        do{
            System.out.print("Digite um número: ");
            x = read.nextInt();

            x += x;

            System.out.print("Diseja adicionar mais um número (s/n)? ");
            i = read.next();

            if (i != "s" | i != "n"){
                System.out.println("Operação invalida!");
                i = "s";
                
            } 
        
        } while (i.equals("s"));
        System.out.print("\nSoma = " + x);
    }   
}