import java.util.Scanner;
public class Ex033 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
    //Escreva um programa que leia um valor do usuario e calcule o fatorial desse número
        
        System.out.print("Digite um valor: ");
        int x = read.nextInt();
        
        while (x < 0){
            System.out.print("Só é possivel fatorar número positivos\nPor favor, insira um numero maior que 0: ");
            x = read.nextInt(); 
        }

        int f = x;
        int r = x;
        
        while (x > 1){
            f = f * (x - 1);
            x--;    
        }

        System.out.println(r + "! = " + f);
        System.out.print(r + "! = " + r);

        while (r > 1){
            r--;
            System.out.print(" x " + r);
            }

        System.out.print(" = " + f);
        System.out.print(" = " + f);
    }
}