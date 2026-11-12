

import javax.swing.SwingUtilities;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new FormularioCliente().setVisible(true);
        });

        // Crear membresias
        Membresia membresia1 = new Membresia(
                1,
                LocalDate.now(),
                LocalDate.now().plusDays(30),
                80000
        );

        Membresia membresia2 = new Membresia(
                2,
                LocalDate.now(),
                LocalDate.now().plusDays(30),
                80000
        );

        // Crear primer cliente
        Cliente cliente1 = new Cliente(
                "Alejandro",
                "1011089607",
                "3006008948",
                LocalDate.of(2005, 5, 15),
                101,
                LocalDate.now(),
                membresia1
        );

        // Crear segundo cliente
        Cliente cliente2 = new Cliente(
                "Carlos",
                "1011000007",
                "3006008128",
                LocalDate.of(2000, 5, 15),
                102,
                LocalDate.now(),
                membresia2
        );

        // Crear entrenador
        Entrenador entrenador = new Entrenador(
                "Marco",
                "5555555",
                "666666666",
                LocalDate.of(1990, 3, 10),
                "Musculacion",
                250000,
                "Certificacion deportiva"
        );
        Entrenador entrenador2 = new Entrenador(
                "Carlos Pérez",
                "123456789",
                "3001234567",
                LocalDate.of(1990, 5, 15),
                "Muay Thai",
                2500000,
                "Certificación de Kickboxing"
        );

        // Crear clase grupal
        Clase clase = new Clase(
                1,
                "Entrenamiento funcional",
                "Lunes 8:00 AM",
                10,
                entrenador
        );

        cliente1.mostrarInformacion();

        System.out.println();

        cliente2.mostrarInformacion();

        System.out.println();

        entrenador.mostrarInformacion();

        System.out.println();

        cliente1.reservarClase(clase);
        cliente2.reservarClase(clase);

        System.out.println();

        // Mostrar clase
        clase.mostrarClase();

        System.out.println();

        Persona[] personas = {
                cliente1,
                cliente2,
                entrenador,
                entrenador2
        };

        System.out.println("=== POLIMORFISMO ===");

        for (Persona persona : personas) {
            persona.mostrarInformacion();
            System.out.println();
        }
    }
}
