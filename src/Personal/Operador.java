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
public class Operador extends Empleado {

    public static int numOperadores;

    public Operador(String nombre, String apellidos,Calendar fechaNacimiento, String genero, String escolaridad, String direccion, float salario, String puesto, String telefono, String nombreUsuario, String constraseña,Identificador id) {
        super(nombre, apellidos,fechaNacimiento, genero, escolaridad, direccion, salario, puesto, telefono, nombreUsuario, constraseña, id);
        numOperadores++;
    }

    @Override
    public String realizarOperacion(int OperacionSelecionada){
        switch(OperacionSelecionada){
            case 1:
                return "Viendo datos del empleado";
            case 2:
                return "Viendo informe del trabajador";
            case 3:
                return "Solicitando cambio de tienda";
            case 4:
                return "Asignando vacaciones";
            case 5:
                return "Dando de alta";
            default:
                return "Operacion Invalida";
        }
    }
}
