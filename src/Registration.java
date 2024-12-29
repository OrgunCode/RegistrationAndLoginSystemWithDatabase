import javax.swing.*;
import java.awt.*;

public class Registration extends JDialog {
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAdress;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPassword;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPanel registerPanel;

    public Registration(JFrame parent) {
        super(parent);
        setTitle("Create a new account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);

    }

    public static void main(String[] args) {
        Registration myForm = new Registration(null);
    }
}
