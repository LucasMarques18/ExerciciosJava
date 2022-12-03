import java.util.Scanner;
public class Ex044 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        //Escreva um programa que leia varios numeros do usuario. Pare somente quando o usuario digitar 0. No final, mostre:
        //1) total dos valores digitados<> 2) total de valores pares<> 3) total de numeros impares<>
        //4) quantos numeros acima de 100 foram digitados<> 5) media de todos os valores digitados

        float media = 0; int cont_geral = 0;
        int cont_cem = 0; int cont_imp = 0;
        int cont_par = 0; int soma = 0;
        int numero;

        do{
            System.out.print("Digite um número (digite 0 para parar): ");
            numero = read.nextInt();

            soma += numero;

            if (numero % 2 == 0 && numero !=0){
                cont_par++;
            } else if (numero != 0){
                cont_imp++;
            }

            if (numero > 100){
                cont_cem++;
            }

            if (numero != 0){
                cont_geral++;
            }
            
        }while (numero != 0);

        media = soma / cont_geral;

        System.out.println("Total dos valores digitados: " + soma);
        System.out.println("Total de valores pares: " + cont_par);
        System.out.println("Total de valores impares: " + cont_imp);
        System.out.println("Numeros de valores acima de 100: " + cont_cem);
        System.out.printf("Media dos valores digitados: %.2f", media);

    }
}