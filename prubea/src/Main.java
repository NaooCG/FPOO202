import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    // Componentes de la interfaz
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnLogin, btnReset;
    private JLabel lblTitulo, lblUsuario, lblContrasena;

    public Main() {
        // Configuración de la ventana
        setTitle("Login - Merks and Spen");
        setSize(500, 400); // Aumentamos el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Panel principal con un diseño de borde y color de fondo
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.RED); // Fondo rojo
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Restricciones para el diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes

        // Título del login
        lblTitulo = new JLabel("Merks and Spen");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblTitulo.setForeground(Color.WHITE); // Texto blanco
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(lblTitulo, gbc);

        // Etiqueta y campo de texto para el usuario
        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblUsuario.setForeground(Color.WHITE); // Texto blanco
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblUsuario, gbc);

        txtUsuario = new JTextField(20); // Aumentamos el tamaño del campo de texto
        txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtUsuario.setPreferredSize(new Dimension(200, 30)); // Tamaño personalizado
        txtUsuario.setBackground(Color.WHITE); // Fondo blanco
        txtUsuario.setForeground(Color.BLACK); // Texto negro
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtUsuario, gbc);

        // Etiqueta y campo de texto para la contraseña
        lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblContrasena.setForeground(Color.WHITE); // Texto blanco
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblContrasena, gbc);

        txtContrasena = new JPasswordField(20); // Aumentamos el tamaño del campo de texto
        txtContrasena.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtContrasena.setPreferredSize(new Dimension(200, 30)); // Tamaño personalizado
        txtContrasena.setBackground(Color.WHITE); // Fondo blanco
        txtContrasena.setForeground(Color.BLACK); // Texto negro
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtContrasena, gbc);

        // Botón de Login
        btnLogin = new JButton("Iniciar Sesión");
        btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnLogin.setBackground(Color.BLACK); // Fondo negro
        btnLogin.setForeground(Color.WHITE); // Texto blanco
        btnLogin.setFocusPainted(false);
        btnLogin.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnLogin, gbc);

        // Botón de Reset
        btnReset = new JButton("Restablecer");
        btnReset.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnReset.setForeground(Color.WHITE); // Texto blanco
        btnReset.setBackground(Color.BLACK); // Fondo negro
        btnReset.setBorderPainted(false);
        btnReset.setFocusPainted(false);
        btnReset.setContentAreaFilled(false);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnReset, gbc);

        // Agregar panel a la ventana
        add(panel);

        // Listeners para los botones
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

    // Método para validar el login
    private void validarLogin() {
        String usuario = txtUsuario.getText().trim();
        String contrasena = new String(txtContrasena.getPassword()).trim();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Simulación de credenciales válidas
        if (usuario.equals("admin") && contrasena.equals("admin123")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, " + usuario + "!", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
            // Aquí podrías abrir la siguiente ventana del sistema
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para limpiar los campos de texto
    private void limpiarCampos() {
        txtUsuario.setText("");
        txtContrasena.setText("");
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}