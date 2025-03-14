import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AdministracionUsuarios extends JFrame {

    private List<String> usuarios = new ArrayList<>();
    private JTextField txtNombreUsuario, txtIdUsuario;
    private JTextArea areaResultado;
    private JButton btnAgregar, btnEliminar, btnModificar;
    private JLabel lblTitulo, lblNombreUsuario, lblIdUsuario;

    public AdministracionUsuarios() {
        setTitle("Administracion de Usuarios  Merks and Spen");
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

        // Título del módulo
        lblTitulo = new JLabel("Administracion de Usuarios");
        lblTitulo.setFont(new Font(" ", Font.BOLD, 24));
        lblTitulo.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(lblTitulo, gbc);

        lblNombreUsuario = new JLabel(" nombre de Usuario:");
        lblNombreUsuario.setFont(new Font(" ", Font.PLAIN, 14));
        lblNombreUsuario.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblNombreUsuario, gbc);

        txtNombreUsuario = new JTextField(20);
        txtNombreUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtNombreUsuario.setPreferredSize(new Dimension(200, 30));
        txtNombreUsuario.setBackground(Color.WHITE);
        txtNombreUsuario.setForeground(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtNombreUsuario, gbc);

        lblIdUsuario = new JLabel("Id de Usuario:");
        lblIdUsuario.setFont(new Font(" ", Font.PLAIN, 14));
        lblIdUsuario.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblIdUsuario, gbc);

        txtIdUsuario = new JTextField(20);
        txtIdUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtIdUsuario.setPreferredSize(new Dimension(200, 30));
        txtIdUsuario.setBackground(Color.WHITE);
        txtIdUsuario.setForeground(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtIdUsuario, gbc);

        btnAgregar = new JButton("Agrega Usuario");
        btnAgregar.setFont(new Font(" ", Font.BOLD, 14));
        btnAgregar.setBackground(Color.BLACK);
        btnAgregar.setForeground(Color.WHITE);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnAgregar, gbc);

        btnEliminar = new JButton("Eliminar Usuario");
        btnEliminar.setFont(new Font(" ", Font.BOLD, 14));
        btnEliminar.setBackground(Color.BLACK);
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnEliminar, gbc);

        btnModificar = new JButton("Modificarr Usuario");
        btnModificar.setFont(new Font(" ", Font.BOLD, 14));
        btnModificar.setBackground(Color.BLACK); // Fondo negro
        btnModificar.setForeground(Color.WHITE); // Texto blanco
        btnModificar.setFocusPainted(false);
        btnModificar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnModificar, gbc);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font(" ", Font.PLAIN, 14));
        areaResultado.setBackground(Color.WHITE);
        areaResultado.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(areaResultado);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel.add(scrollPane, gbc);

        add(panel);
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarUsuario();
            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarUsuario();
            }
        });
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarUsuario();
            }
        });
    }

    private void agregarUsuario() {
        String nombre = txtNombreUsuario.getText().trim();
        String id = txtIdUsuario.getText().trim();

        if (nombre.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        usuarios.add(nombre + " (ID  " + id + ")");
        areaResultado.setText("Usuario agregado " + nombre + " (ID " + id + ")\n" + areaResultado.getText());
        limpiarCampos();
    }
    private void eliminarUsuario() {
        String nombre = txtNombreUsuario.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del usuario ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (usuarios.removeIf(u -> u.contains(nombre))) {
            areaResultado.setText("Usuario eliminado " + nombre + "\n" + areaResultado.getText());
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no existe ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarCampos();
    }
    private void modificarUsuario() {
        String nombre = txtNombreUsuario.getText().trim();
        String id = txtIdUsuario.getText().trim();

        if (nombre.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).contains(nombre)) {
                usuarios.set(i, nombre + " (ID: " + id + ")");
                areaResultado.setText("Usuario modificado " + nombre + " (ID " + id + ")\n" + areaResultado.getText());
                limpiarCampos();
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "El usuario no existe ", "Error", JOptionPane.ERROR_MESSAGE);
    }
    private void limpiarCampos() {
        txtNombreUsuario.setText("");
        txtIdUsuario.setText("");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdministracionUsuarios().setVisible(true);
            }
        });
    }
}