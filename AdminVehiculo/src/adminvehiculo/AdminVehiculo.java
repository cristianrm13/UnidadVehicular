package adminvehiculo;

import java.util.Scanner;

public class AdminVehiculo {

   private static Persona[] listaPersonas = new Persona[5];
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        byte opcion;

        do {
            System.out.println("Administrador de unidades vehiculares");
            System.out.println("1. Agregar Chofer");
            System.out.println("2. Agregar vehículo");
            System.out.println("3. Asignacion registros");
            System.out.println("4. imprimir ganacias");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = teclado.nextByte();
            switch (opcion){
                case 1: addPersona(); break;
                case 2: addVehiculo(); break;
                case 3: imprimirPersonas(); break;
                case 4: /*ganancias()*/; break;
            }
        } while (opcion <4);

    }

    public static void addPersona() {
        String nombre;
        int edad;
        byte numeroVehiculos;
        Persona persona;


        System.out.print("Ingresa el nombre del chofer: ");
        nombre = teclado.next();
        System.out.print("Ingresa edad del chofer: ");
        edad = teclado.nextInt();
        System.out.print("Vehículo a asignar: ");
        numeroVehiculos = teclado.nextByte();

        // Sección para almacenar datos
        persona = new Persona(numeroVehiculos);
        persona.setNombre(nombre);
        persona.setEdad(edad);

        System.out.println("Valor de persona: " + persona);
        byte indice = 0;
        while (listaPersonas[indice] != null)
            indice++;
        listaPersonas[indice] = persona;

    }
    public static void addVehiculo() {
        String Modelo;
        String Marca;
        String Placa;
        Vehiculo vehiculo;
        
        System.out.println("Ingrese el modelo");
        Modelo = teclado.next();
        System.out.println("ingrese la marca");
        Marca = teclado.next();
        System.out.println("ingrese la placa");
        Placa = teclado.next();
    }
    public static void imprimirPersonas() {}
}

