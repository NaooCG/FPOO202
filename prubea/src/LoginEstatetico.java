import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEstatetico extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnLogin, btnReset;
    private JLabel lblTitulo, lblUsuario, lblContrasena;

    public LoginEstatetico() {
        // Configuración de la ventana
        setTitle("Login  Merks and Spen");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.RED);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        lblTitulo = new JLabel(" Merks and Spen ");
        lblTitulo.setFont(new Font("", Font.BOLD, 24));
        lblTitulo.setForeground(Color.WHITE); // Texto blanco
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(lblTitulo, gbc);

        lblUsuario = new JLabel(" Usuario : ");
        lblUsuario.setFont(new Font("", Font.PLAIN, 14));
        lblUsuario.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblUsuario, gbc);

        txtUsuario = new JTextField(20);
        txtUsuario.setFont(new Font("", Font.PLAIN, 14));
        txtUsuario.setPreferredSize(new Dimension(200, 30));
        txtUsuario.setBackground(Color.WHITE);
        txtUsuario.setForeground(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtUsuario, gbc);

        lblContrasena = new JLabel(" contraseña : ");
        lblContrasena.setFont(new Font("", Font.PLAIN, 14));
        lblContrasena.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblContrasena, gbc);

        txtContrasena = new JPasswordField(20);
        txtContrasena.setFont(new Font("", Font.PLAIN, 14));
        txtContrasena.setPreferredSize(new Dimension(200, 30));
        txtContrasena.setBackground(Color.WHITE);
        txtContrasena.setForeground(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtContrasena, gbc);

        // Botón de Login
        btnLogin = new JButton(" iniciar sesion ");
        btnLogin.setFont(new Font("", Font.BOLD, 14));
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        btnLogin.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnLogin, gbc);

        // Botón de Reset
        btnReset = new JButton(" restablecer ");
        btnReset.setFont(new Font("", Font.PLAIN, 12));
        btnReset.setForeground(Color.WHITE);
        btnReset.setBackground(Color.BLACK);
        btnReset.setBorderPainted(false);
        btnReset.setFocusPainted(false);
        btnReset.setContentAreaFilled(false);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnReset, gbc);

        add(panel);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    private void validarLogin() {
        String usuario = txtUsuario.getText().trim();
        String contrasena = new String(txtContrasena.getPassword()).trim();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, " todos los campos son obligatorios ", " error ", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (usuario.equals("admin") && contrasena.equals("admin123")) {
            JOptionPane.showMessageDialog(this, " Bienvenido " + usuario + " ", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, " Usuario o contraseña incorrectos ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void limpiarCampos() {
        txtUsuario.setText("");
        txtContrasena.setText("");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginEstatetico().setVisible(true);
            }
        });
    }
}
