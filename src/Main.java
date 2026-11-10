import java.time.LocalDate;

public static void main(String[] args) {
    Membresia membresia = new Membresia(
            1,
            LocalDate.now(),
            LocalDate.now().plusDays(30),
            80000
    );

    Cliente cliente = new Cliente(
            "Alejandro",
            "1011089607",
            "3006008948",
            LocalDate.of(2005, 5, 15),
            101,
            LocalDate.now(),
            membresia
    );
    Entrenador entrenador = new Entrenador(
            "Marco",
            "5555555",
            "666666666666",
            LocalDate.of(1990,3,10),
            "Musculacion",
            250000,
            "Certificacion deportiva"
    );
    Clase clase = new Clase(
            1,
            "entrenamiento funcional",
            "Lunes 8:00Am",
            10,
            entrenador
    );
    cliente.mostrarInformacion();
    System.out.println();
    entrenador.mostrarInformacion();
    System.out.println();
    cliente.reservarClase(clase);
    System.out.println();
    clase.mostrarClase();
    System.out.println();

    Persona[] personas = {cliente, entrenador};

    System.out.println("Polimorfismo");

    for (Persona persona : personas) {
        persona.mostrarInformacion();
        System.out.println();
    }
}
