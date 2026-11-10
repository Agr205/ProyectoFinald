import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String documento;
    private String telefono;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String documento, String telefono, LocalDate fechaNacimiento){

        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombre() {
            return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate setFechaNacimiento() {
        return fechaNacimiento;
    }

    public void registrarIngreso(){
        System.out.println(nombre + "ha ingresado al Gym");
    }
    public void registrarEgreso(){
        System.out.println(nombre + "ha salido del Gym");
    }

    public abstract void mostrarInformacion();
}
