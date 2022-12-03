public class Ex036 {
    public static void main(String[] args) {

        //Escreva um programa que mostre na teal a seguinte contagem 0 3 6 9 12 15 18

        int x = 0;
        int y = 1;
        while (x < 19){
            System.out.print(x + " ");
            x = y * 3;
            y++;

        }
    }   
}