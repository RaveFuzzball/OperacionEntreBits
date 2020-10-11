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
    public String realizarOperacion(int OperacionSelecionada,Empleado em){
        switch(OperacionSelecionada){
            case 1:
                return this.verDatosEmpleado(em);
            case 2:
                return this.verInformeTrabajador(em);
            case 3:
                return this.solicitarCambioTienda(em);
            case 4:
                return this.asignarVacaiones(em);
            case 5:
                return this.darAlta(em);
            default:
                return "Operacion Invalida";
        }
    }
    
    public String verDatosEmpleado(Empleado em){
        return "Viendo datos del empleado";
    }
    public String verInformeTrabajador(Empleado em){
        return "Viendo informe del trabajador";
    }
     public String solicitarCambioTienda(Empleado em){
        return "Solicitando cambio de tienda";
    }
      public String asignarVacaiones(Empleado em){
        return "Asignando vacaciones";
    }
       public String darAlta(Empleado em){
        return "Dando de alta";
    }
}
