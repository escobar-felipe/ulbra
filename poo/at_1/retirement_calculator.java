import javax.swing.*;

public class RetirementCalculator {
    public static void main(String[] args) {
        String age_input = JOptionPane.showInputDialog("Informe sua idade:");
        int age = Integer.parseInt(age_input);

        String gender_input = JOptionPane.showInputDialog("Informe seu gênero (M/F):");
        char gender = gender_input.charAt(0);

        String contribution_years_input = JOptionPane.showInputDialog("Informe os anos de contribuição:");
        int contribution_years = Integer.parseInt(contribution_years_input);

        boolean can_retire = false;

        if ((gender == 'M' && age >= 65 && contribution_years >= 20) || (gender == 'F' && age >= 60 && contribution_years >= 15)) {
            can_retire = true;
        }

        String message = can_retire ? "Você já pode se aposentar." : "Você ainda não pode se aposentar.";
        JOptionPane.showMessageDialog(null, message);
    }
}
