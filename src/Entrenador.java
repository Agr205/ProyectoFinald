import java.time.LocalDate;

public class Entrenador extends Persona {

    private String especialidad;
    private double salario;
    private String certificaciones;

    public Entrenador(String nombre, String documento,
                      String telefono, LocalDate fechaNacimiento,
                      String especialidad, double salario,
                      String certificaciones) {

        super(nombre, documento, telefono, fechaNacimiento);

        this.especialidad = especialidad;
        this.salario = salario;
        this.certificaciones = certificaciones;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void dirigirClase(){
        System.out.println("el entrenador" + getNombre()+ "esta dirigiendo una clase");

    }
    @Override
    public void mostrarInformacion(){
        System.out.println("INFORMACION DEL ENTRENADOR");
        System.out.println("Nombre:"+ getNombre());
        System.out.println("Documento:"+ getDocumento());
        System.out.println("Especialidad:" + especialidad);
        System.out.println("Salario;" + salario);
        System.out.println("Certificaciones:" + certificaciones);

    }
}