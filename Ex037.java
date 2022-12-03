public class Ex037 {
    public static void main(String[] args) { 

        //Escreva um programa que mostre na tela a segunte contagem 100 95 90 85 80... 0 acabou!

        int x = 100;
        while (x >= 0){
            System.out.print(x + " ");
            x = x - 5;
        }
        System.out.print("\nAcabou!");
    }
}