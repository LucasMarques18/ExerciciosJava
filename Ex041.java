import java.util.Scanner;
public class Ex041 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        System.out.print("Digite o primeiro valor: ");
        int pv = read.nextInt();
        System.out.print("Digite o ultimo valor: ");
        int uv = read.nextInt();
        System.out.print("Digite o incremento: ");
        int in = read.nextInt();
        
        if (pv > uv){
            while (pv >= uv){
                System.out.print(pv + " ");
                pv = pv - in;
            }
        } else {
            while (pv <= uv){
                System.out.print(pv + " ");
                pv = pv + in;
            }
        }
        System.out.println("\nAcabou!");
    }   
}