/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Calendar;

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
    public String realizarOperacion(int OperacionSelecionada){
        switch(OperacionSelecionada){
            case 1:
                return "Solicitando vacaciones";
            case 2:
                return "Solicitando cambio de datos personales";
            default:
                return "Operacion Invalida";
        }
    }
}
