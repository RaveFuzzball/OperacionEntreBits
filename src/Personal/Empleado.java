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

    public abstract void mostrarMenu();

    public void verInformacionPersonal() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Genero: " + genero + "  Escolaridad: " + escolaridad);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento.get(Calendar.DATE) + "/" + fechaNacimiento.get(Calendar.MONTH) + "/" + fechaNacimiento.get(Calendar.YEAR) + "  Direccion: " + direccion);
        System.out.println("Puesto: " + puesto + "  Salario: " + salario);
        System.out.println("Telefono: " + telefono);
    }
}
