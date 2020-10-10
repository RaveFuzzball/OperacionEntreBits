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
public class Operador extends Empleado {

    static int numOperadores;

    static void incNumOperadores() {
        numOperadores++;
    }

    public Operador(String nombre, String apellidos,Calendar fechaNacimiento, String genero, String escolaridad, String direccion, float salario, String puesto, String telefono, String nombreUsuario, String constraseña,Identificador id) {
        super(nombre, apellidos,fechaNacimiento, genero, escolaridad, direccion, salario, puesto, telefono, nombreUsuario, constraseña, id);
    }

    @Override
    public void mostrarMenu() {
        int opcionSeleccionada;
        do {
            System.out.println("¿Que desea hacaer?");
            System.out.println("1.Ver Informe de Trabajador \n2.Ver datos del empleado \n3.Solicitar Cambio de Tienda \n4.Asignar Vacaciones \n5.Dar de alta \n6.Regresar");
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
                    this.solicitarCambioDeTieda();
                    break;
                case 4:
                    this.asignarVacaciones();
                    break;
                case 5:
                    this.darAlta();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
        } while (opcionSeleccionada !=6 );
    }
    private void verInformeTrabajador(){
        System.out.println("Esta viendo el informe del trabajador");
    }
    private void verDatosEmpleado(){
        System.out.println("Esta viendo los datos del empleado");
    }
    private void solicitarCambioDeTieda(){
        System.out.println("Esta solicitando un cambio de tienda");
    }
    private void asignarVacaciones(){
        System.out.println("Esta asignando vacaciones");
    }
    private void darAlta(){
        System.out.println("Esta dando de alta");
    }
}
