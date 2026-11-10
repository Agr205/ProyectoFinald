
import java.time.LocalDate;

public class Cliente extends Persona {

    private int idSocio;
    private LocalDate fechaRegistro;
    private Membresia membresia;
    public Cliente(String nombre, String documento,
                   String telefono, LocalDate fechaNacimiento,
                   int idSocio, LocalDate fechaRegistro,
                   Membresia membresia) {

        super(nombre, documento, telefono, fechaNacimiento);

        this.idSocio = idSocio;
        this.fechaRegistro = fechaRegistro;
        this.membresia = membresia;
    }
    public int getIdSocio() {
        return idSocio;
    }
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    public Membresia getMembresia() {
        return membresia;
    }
    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
    public boolean reservarClase(Clase clase) {

        if (membresia == null || !membresia.verificarEstado()) {

            System.out.println("El cliente no tiene una membresia activa.");
            return false;
        }
        return clase.registrarCliente(this);
    }
    @Override
    public void mostrarInformacion() {

        System.out.println("=== INFORMACION DEL CLIENTE ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Fecha de registro: " + getFechaRegistro());

        if (membresia != null) {

            System.out.println("Membresia activa: "
                    + membresia.verificarEstado());
        }
    }
}
