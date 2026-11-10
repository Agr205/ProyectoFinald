import java.time.LocalDate;

public class Membresia {
    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private double costo;

    public Membresia(int id, LocalDate fechaInicio,
                     LocalDate fechaVencimiento, double costo) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getCosto() {
        return costo;
    }
    public void renovar(int dias) {
        try {
            if (dias <= 0) {
                throw new IllegalArgumentException(
                        "Los dias de renovacion deben ser mayores a cero."
                );
            }
            LocalDate hoy = LocalDate.now();
            if (fechaVencimiento.isBefore(hoy)) {
                fechaInicio = hoy;
            } else {
                fechaInicio = fechaVencimiento;
            }

            fechaVencimiento = fechaInicio.plusDays(dias);

            System.out.println("Membresia renovada correctamente.");
            System.out.println("Nueva fecha de vencimiento: "
                    + fechaVencimiento);

        } catch (IllegalArgumentException e) {

            System.out.println("Error al renovar: " + e.getMessage());

        } finally {

            System.out.println("Proceso de renovacion finalizado.");

        }
    }

   public boolean verificarEstado(){
        return !fechaVencimiento.isBefore(LocalDate.now());
   }
   public double calcularCosto(){
        return costo;
   }
}

