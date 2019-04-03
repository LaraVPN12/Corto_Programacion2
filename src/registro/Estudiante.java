/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;


public class Estudiante implements Comparable<Estudiante> {

String Nombre;
String Apellido;
String Grado;
String Carnet;

    
public Estudiante() {

        Nombre = "";
        Apellido = "";
        Grado = "";
        Carnet= "";
}
 public Estudiante(String n, String a, String g, String c) {

        Nombre = n;
        Apellido = a;
        Grado = g;
        Carnet = c;
}

public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
}

    @Override
    public int compareTo(Estudiante t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}