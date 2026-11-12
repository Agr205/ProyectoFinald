
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class FormularioCliente extends JFrame {

    private JTextField txtNombre;
    private JTextField txtDocumento;
    private JTextField txtTelefono;
    private JTextField txtFecha;

    public FormularioCliente() {

        setTitle("Registro de clientes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        panel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();

        JLabel lblDocumento = new JLabel("Documento:");
        txtDocumento = new JTextField();

        JLabel lblTelefono = new JLabel("Telefono:");
        txtTelefono = new JTextField();

        JLabel lblFecha = new JLabel("Fecha nacimiento:");
        txtFecha = new JTextField();

        JButton btnRegistrar = new JButton("Registrar cliente");

        panel.add(lblNombre);
        panel.add(txtNombre);

        panel.add(lblDocumento);
        panel.add(txtDocumento);

        panel.add(lblTelefono);
        panel.add(txtTelefono);

        panel.add(lblFecha);
        panel.add(txtFecha);

        panel.add(new JLabel());
        panel.add(btnRegistrar);

        add(panel);

        btnRegistrar.addActionListener(e -> registrarCliente());
    }

    private void registrarCliente() {

        try {

            String nombre = txtNombre.getText();
            String documento = txtDocumento.getText();
            String telefono = txtTelefono.getText();

            LocalDate fechaNacimiento =
                    LocalDate.parse(txtFecha.getText());

            Membresia membresia = new Membresia(
                    1,
                    LocalDate.now(),
                    LocalDate.now().plusDays(30),
                    80000
            );

            Cliente cliente = new Cliente(
                    nombre,
                    documento,
                    telefono,
                    fechaNacimiento,
                    101,
                    LocalDate.now(),
                    membresia
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Cliente registrado correctamente:\n"
                            + cliente.getNombre()
            );

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al registrar: " + ex.getMessage()
            );

        }

    }
}
