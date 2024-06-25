import javax.swing.*;

public class EvaluationSystem {
    public static void main(String[] args) {
        String first_grade_input = JOptionPane.showInputDialog("Informe a nota do primeiro exame:");
        double first_grade = Double.parseDouble(first_grade_input);

        String second_grade_input = JOptionPane.showInputDialog("Informe a nota do segundo exame:");
        double second_grade = Double.parseDouble(second_grade_input);

        String work_grade_input = JOptionPane.showInputDialog("Informe a nota do trabalho:");
        double work_grade = Double.parseDouble(work_grade_input);

        double average = (first_grade + second_grade + work_grade) / 3;

        String status = (average >= 6) ? "Aprovado" : "Reprovado";
        JOptionPane.showMessageDialog(null, "Média: " + average + "\nStatus: " + status);
    }
}
