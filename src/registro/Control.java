/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import javax.swing.JOptionPane;
/**
 *
 * @author rossy
 */
public class Control {
    //Creación de ArrayList
    List<Estudiante> alumno = new ArrayList();

    String Nombre = "";
    String Apellido = "";
    String Carnet = "";
    String Grado = "";
    int correlativo = 0;
    String DUE;
    int i;
    String BDatos="";

//Método para rear Carnet
    public String Carnet(String Nombre, String Apellido, int correlativo) {

        char Primera = Nombre.charAt(0);
        char Segunda = Apellido.charAt(0);
        if (correlativo <= 9) {
            Carnet = String.valueOf(Primera) + String.valueOf(Segunda) + "000" + correlativo;
        } else if (correlativo >= 10 && correlativo <= 99) {
            Carnet = String.valueOf(Primera) + String.valueOf(Segunda) + "00" + correlativo;
        } else if (correlativo >= 100 && correlativo <= 999) {
            Carnet = String.valueOf(Primera) + String.valueOf(Segunda) + "0" + correlativo;
        } else if (correlativo >= 1000 && correlativo <= 9999) {
            Carnet = String.valueOf(Primera) + String.valueOf(Segunda) + correlativo;
        }
        return Carnet;
    }
// Método Agregar

    public void Agregar(String txtNombre, String txtApellido, String grado) {
        correlativo++;
        Nombre = txtNombre;
        Apellido = txtApellido;
        DUE = Carnet(Nombre, Apellido, correlativo);
        Grado = grado;
        alumno.add(new Estudiante(Nombre, Apellido, Grado, DUE));
        
    }
    //Se concatena los datos para poderlos mostrar en Jlist
    public String Datos(int x){
    String oracion[]= new String[7];
        oracion[0]= alumno.get(x).getNombre();
        oracion[1]= " ";
        oracion[2]= alumno.get(x).getApellido();
        oracion[3]= " ";
        oracion[4]=alumno.get(x).getCarnet();
        oracion[5]=" ";
        oracion[6]=alumno.get(x).getGrado();
        StringBuilder string = new StringBuilder();
        string.append(oracion[0]);
        string.append(oracion[1]);
        string.append(oracion[2]);
        string.append(oracion[3]);
        string.append(oracion[4]);
        string.append(oracion[5]);
        string.append(oracion[6]);
        String resultado = string.toString();
        return resultado;    
    }
    
    String buscar(String DUE)
    {
        String BDUE = DUE;
        int contador=0;
        for (int i = 0; i < alumno.size(); i++) {
            
            if(alumno.get(i).getCarnet().compareToIgnoreCase(BDUE)==0){
                BDatos = Datos(i);
                
                }// obtener datos del alumn
                else{
                 contador++;
                 
            }if(contador==alumno.size()){
              BDatos="No se encontro ningún alumno";       
                    }
        }
      return BDatos;
        
    }
    String eliminar(String DUE)
    {
        String BDUE = DUE;
        int contador=0;
        for (int i = 0; i < alumno.size(); i++) {
            
            if(alumno.get(i).getCarnet().compareToIgnoreCase(BDUE)==0){
                BDatos= "El estudiante fue eliminado.";
                alumno.remove(i);
                break;
                }// eliminar datos del alumn
                else{
                 contador++;
            }if(contador==alumno.size()){
              BDatos="No se encontro ningún alumno a eliminar";       
                    }
        }
      return BDatos;
        
    }
    int Tamaño(){
    return alumno.size();    
    }
    void editar(String DUE)
    {
        String EDUE=DUE;
        int contador=0;
        for (int j = 0; j < alumno.size(); j++) {
            if(alumno.get(j).getCarnet().compareToIgnoreCase(EDUE)==0)
            {
                String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                String apellido = JOptionPane.showInputDialog("Ingrese apellido");
                alumno.get(j).setNombre(nombre);
                alumno.get(j).setApellido(apellido);
            }
        }
    }
   
}
