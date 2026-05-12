import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto = 1;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;
        int invalido = 0;
        int total;
        double pc1, pc2, pc3;

        while (voto != 0) {
            System.out.println("[1] candidato 1\n " +
                    "[2] candidato 2\n" +
                    " [3] candidato3\n" +
                    "[0] finalizar");
            voto = sc.nextInt();

            if (voto == 0 ){
                break;
            }

            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;

            } else {
                invalido++;
            }
            System.out.println("candidato 1 =" + candidato1);
            System.out.println("candidato 2 =" + candidato2);
            System.out.println("candidato 3 =" + candidato3);
            // calcular o total de votos
            total = candidato1 + candidato2 + candidato3;
            pc1 = candidato1 / total * 100;
            pc2 = candidato2 / total * 100;
            pc3 = candidato3 / total * 100;

            System.out.println();
            System.out.println("total de votos =");
            System.out.println("porcentagem do candidato 1 =" + pc1);
            System.out.println("porcentagem do candidato 2 =" + pc2);
            System.out.println("porcentagem do candidato 3 =" + pc3);

            if (candidato1 > candidato2 && candidato1 > candidato3){
                System.out.println( "vencendor --> candidato 1");
            } else if ( candidato2 > candidato3) {

            }
            else {
                System.out.println("vencendor -- candidato 2");
            }

        }
    }
}