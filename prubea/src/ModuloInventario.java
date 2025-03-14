import javax.swing.*;
import java.awt.*;

public class ModuloInventario {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Inventario());
    }
}

class Inventario extends JFrame {
    public Inventario() {
        setTitle("Módulo de Inventario");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JPanel PanelSuperior = new JPanel(new BorderLayout());
        PanelSuperior.setBackground(Color.RED);
        PanelSuperior  .setPreferredSize(new Dimension(900, 80));

        JLabel Logo = new JLabel("   MERKS AND SPEN");
        Logo.setForeground(Color.WHITE);
        Logo.setFont(new Font("Tahoma", Font.BOLD, 16));
        PanelSuperior.add(Logo, BorderLayout.WEST);

        JLabel Usuario = new JLabel("Nombre_Usuario  ", SwingConstants.RIGHT);
        Usuario.setForeground(Color.WHITE);
        Usuario.setFont(new Font("Tahoma", Font.BOLD, 14));
        PanelSuperior.add(Usuario, BorderLayout.EAST);
        add(PanelSuperior, BorderLayout.NORTH);

        JPanel PanelIzquierdo = new JPanel();
        PanelIzquierdo.setBackground(new Color(255, 255, 255));
        PanelIzquierdo.setPreferredSize(new Dimension(200, 500));
        PanelIzquierdo.setLayout(new BoxLayout(PanelIzquierdo, BoxLayout.Y_AXIS));

        JLabel Menu = new JLabel("Modulo de inventario");
        Menu.setFont(new Font("Tahoma", Font.BOLD, 14));
        Menu.setOpaque(true);
        Menu.setBackground(Color.WHITE);
        Menu.setForeground(Color.BLACK);
        Menu.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton PDF = new JButton("Generación de PDF");
        JButton Graphics = new JButton("Activar graficos");
        JButton Datos = new JButton("Consulta de datos");

        PanelIzquierdo.add(Menu);
        PanelIzquierdo.add(Box.createVerticalStrut(10));
        PanelIzquierdo.add(PDF);
        PanelIzquierdo.add(Graphics);
        PanelIzquierdo.add(Datos);

        add(PanelIzquierdo, BorderLayout.WEST);

        JPanel PanelCentro = new JPanel();
        PanelCentro.setLayout(new BorderLayout());

        JPanel PanelBusqueda = new JPanel();
        PanelBusqueda.setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextField Busqueda = new JTextField(20);
        JButton BotonBusqueda = new JButton("🔍");
        PanelBusqueda.add(Busqueda);
        PanelBusqueda.add(BotonBusqueda);

        PanelCentro.add(PanelBusqueda, BorderLayout.NORTH);

        JPanel PanelProducto = new JPanel();
        PanelProducto.setLayout(new GridLayout(1, 4, 10, 10));

        for (int i = 0; i < 4; i++) {
            JPanel Producto = new JPanel();
            Producto.setLayout(new BoxLayout(Producto, BoxLayout.Y_AXIS));
            Producto.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            JLabel imageLabel = new JLabel("[Imagen_Prodcuto]");
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel nameLabel = new JLabel("Nombre_Producto");
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel qtyLabel = new JLabel("#Cantidad");
            qtyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            Producto.add(imageLabel);
            Producto.add(nameLabel);
            Producto.add(qtyLabel);

            PanelProducto.add(Producto);
        }

        PanelCentro.add(PanelProducto,BorderLayout.CENTER);

        add(PanelCentro,BorderLayout.CENTER);

        setVisible(true);
    }
}