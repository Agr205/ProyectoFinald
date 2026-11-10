import java.util.ArrayList;

public class Clase {
    private int idClase;
    private String nombre;
    private String horario;
    private int capacidad;
    private Entrenador entrenador;

    private ArrayList<Cliente> clientes;

    public Clase(int idClase, String nombre, String horario,
                 int capacidad, Entrenador entrenador){
        this.idClase= idClase;
        this.nombre = nombre;
        this.horario = horario;
        this.capacidad = capacidad;
        this.entrenador = entrenador;

        clientes = new ArrayList<>();

    }
    public boolean registrarCliente(Cliente cliente){
        if (clientes.size()>capacidad){
            System.out.println("la clase esta llena");
            return false;
        }
        if (clientes.contains(cliente)){
            System.out.println("El cliente ya esta registrado.");
            return false;
        }
        clientes.add(cliente);

        System.out.println("CLiente registrado en la clase:"+nombre );
        return true;

    }
    public int consultarCupos(){
        return capacidad - clientes.size();
    }
    public void cancelarClase(){
        clientes.clear();
        System.out.println("La clase ha sido cancelada");

    }
    public void mostrarClase(){
        System.out.println("INFORMACION DE LA CLASE");
        System.out.println("Nombre:"+ nombre);
        System.out.println("Horario"+horario);
        System.out.println("Entrenador"+ entrenador.getNombre());
        System.out.println("Clientes inscritos:"+ clientes.size() );
        System.out.println("Cupos disponibles:" + consultarCupos());

    }
}
