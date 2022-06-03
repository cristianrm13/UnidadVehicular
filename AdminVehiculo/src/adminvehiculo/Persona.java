
package adminvehiculo;

public class Persona {
    //private short id;
    private String nombre;
    private int edad;
    private Vehiculo[] listaVehiculos;

    public Persona(byte numeroVehiculos){
        listaVehiculos = new Vehiculo[numeroVehiculos];
    }

 /*   public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
