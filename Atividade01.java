import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[8];
        double media1Bimestre, media2Bimestre, media3Bimestre, media4Bimestre;
        double media1Semestre, media2Semestre, mediaFinal;

        // Leitura das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        // Médias bimestrais
        media1Bimestre = (notas[0] + notas[1]) / 2;
        media2Bimestre = (notas[2] + notas[3]) / 2;
        media3Bimestre = (notas[4] + notas[5]) / 2;
        media4Bimestre = (notas[6] + notas[7]) / 2;

        // Médias semestrais
        media1Semestre = (media1Bimestre + media2Bimestre) / 2;
        media2Semestre = (media3Bimestre + media4Bimestre) / 2;

        // Média final
        mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Exibição dos resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("1º Bimestre: " + media1Bimestre);
        System.out.println("2º Bimestre: " + media2Bimestre);
        System.out.println("1º Semestre: " + media1Semestre);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + media3Bimestre);
        System.out.println("4º Bimestre: " + media4Bimestre);
        System.out.println("2º Semestre: " + media2Semestre);
        System.out.println("----------------------");
        System.out.println("Média Final: " + mediaFinal);

        input.close();
    }
}