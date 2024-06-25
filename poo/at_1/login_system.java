import javax.swing.*;

public class LoginSystem {
    public static void main(String[] args) {
        final String VALID_USERNAME = "ulbra";
        final String VALID_PASSWORD = "ads2023";
        int tentativas = 0;

        while (tentativas < 3) {
            String username = JOptionPane.showInputDialog("Insira seu nome de usuário:");
            String password = JOptionPane.showInputDialog("Insira sua senha:");

            if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Acesso concedido.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Credenciais inválidas. Tente novamente.");
                tentativas++;
            }
        }

        if (tentativas == 3) {
            JOptionPane.showMessageDialog(null, "Acesso negado.");
        }
    }
}
