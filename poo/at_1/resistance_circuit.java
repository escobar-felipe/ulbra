import java.util.Scanner;

public class ResistanceCircuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Insira a resistência " + (i + 1) + ":");
            resistencias[i] = scanner.nextDouble();
        }

        double resistencia_total = 0;
        double resistencia_minima = resistencias[0];
        double resistencia_maxima = resistencias[0];
        for (double resistencia : resistencias) {
            resistencia_total += resistencia;
            if (resistencia < resistencia_minima) resistencia_minima = resistencia;
            if (resistencia > resistencia_maxima) resistencia_maxima = resistencia;
        }

        System.out.println("Resistência total: " + resistencia_total);
        System.out.println("Resistência mínima: " + resistencia_minima);
        System.out.println("Resistência máxima: " + resistencia_maxima);
        scanner.close();
    }
}
