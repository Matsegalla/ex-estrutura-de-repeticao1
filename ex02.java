/*prova para imprimir no video os numeros dentro de um
 intervalo fornecido pelo usuario*/

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, contador, fim;

        System.out.println("inicio do intervalo -->");
        inicio = sc.nextInt();
        System.out.println("fim do intervalo -->");
        fim = sc.nextInt();
        contador = inicio;
        while (contador <= fim){
            contador = contador +1;
            System.out.println(contador + " ");
        }


    }
}
