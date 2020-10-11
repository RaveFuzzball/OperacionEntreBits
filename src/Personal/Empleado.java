/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *
 * @author Usuario
 */
import java.util.Calendar;

public abstract class Empleado extends Usuario {

    protected String nombre;
    protected String apellidos;
    protected Calendar fechaNacimiento;
    protected String genero;
    protected String escolaridad;
    protected String direccion;
    protected float salario;
    protected String puesto;
    protected String telefono;

    public Empleado(String nombre, String apellidos,Calendar fechaNacimiento,
            String genero, String escolaridad, String direccion, float salario,
            String puesto, String telefono, String nombreUsuario, String constraseña, Identificador id) {

        super(nombreUsuario, constraseña,id);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.escolaridad = escolaridad;
        this.direccion = direccion;
        this.salario = salario;
        this.puesto = puesto;
        this.telefono = telefono;
    }
    
    public String obtenerMenu(EnumTipoEmpleado TipoEmpleado){
        switch(TipoEmpleado){
            case EMPLEADO_ORDINARIO:
                return "Operaciones Disponibles: \n1.Solicitar Vacaciones \n2.Solicitar cambio de datos personales";
            case OPERADOR:
                return "Operaciones Disponibles: \n1.Ver datos del empleado \n2.Ver informe del trabajador \n3.Solicitar cambio de tienda \n4.Asignar vacaciones \n5.Dar alta";
            case ADMIN_ESTATAL:
                return "Operaciones Disponibles: \n1.Dar alta \n2.Eliminar Empleado \n3.Modificar Empleado \n4.Ver datos empleado \n5.Ver informe Empleado \n6.Cambiar Tienda Empleado \n7.Asignar Vacaiones Empleado";
            case ADMIN_PRINCIPAL:
                return "Operaciones Disponibles: \n1.Dar alta \n2.Eliminar Empleado \n3.Modificar Empleado \n4.Ver datos empleado \n5.Ver informe Empleado \n6.Cambiar Tienda Empleado \n7.Asignar Vacaiones Empleado";
            default:
                return "Operacion Invalida";
        }
    }
  
    public abstract String realizarOperacion(int operacionSeleccionada);
}
