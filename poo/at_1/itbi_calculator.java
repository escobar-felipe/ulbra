import javax.swing.*;

public class itbiCalculator {
    public static void main(String[] args) {
        String transaction_value_input = JOptionPane.showInputDialog("Informe o valor da transação:");
        double transaction_value = Double.parseDouble(transaction_value_input);
        
        String venal_value_input = JOptionPane.showInputDialog("Informe o valor venal:");
        double venal_value = Double.parseDouble(venal_value_input);
        
        String tax_rate_input = JOptionPane.showInputDialog("Informe a porcentagem do imposto ITBI:");
        double tax_rate = Double.parseDouble(tax_rate_input);

        double base_value = Math.max(transaction_value, venal_value);
        double tax = base_value * (tax_rate / 100);

        JOptionPane.showMessageDialog(null, "Imposto ITBI:" + tax);
    }
}