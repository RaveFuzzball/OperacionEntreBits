/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EmpleadoOrdinario extends Empleado{
     static int numEmpleados;

    public EmpleadoOrdinario(String nombre, String apellidos,Calendar fechaNacimiento, String genero, String escolaridad, String direccion, float salario, String puesto, String telefono, String nombreUsuario, String constraseña,Identificador id) {
       super(nombre, apellidos,fechaNacimiento, genero, escolaridad, direccion, salario, puesto, telefono, nombreUsuario, constraseña, id);
        numEmpleados++;
    }

    @Override
    public void mostrarMenu() {
        int opcionSeleccionada;
        do {
            System.out.println("¿Que desea hacaer?");
            System.out.println("1.Solicitar cambio de datos personales \n2.Solicitar vacaciones \n3.Regresar");
            System.out.println("Opcion seleccionada: ");
            Scanner opcion = new Scanner(System.in);
            opcionSeleccionada = opcion.nextInt();
            switch (opcionSeleccionada) {
                case 1:
                    this.verInformeTrabajador();
                    break;
                case 2:
                    this.verDatosEmpleado();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
        } while (opcionSeleccionada != 3 );
    }
    private void verInformeTrabajador(){
        System.out.println("Solicitud en proceso");
    }
    private void verDatosEmpleado(){
        System.out.println("Solicitud en proceso");
    }
}
