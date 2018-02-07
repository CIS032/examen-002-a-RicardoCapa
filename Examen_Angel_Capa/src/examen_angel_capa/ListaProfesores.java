/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_angel_capa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Carrion
 */
public class ListaProfesores {

    static ArrayList<Profesor> lista = new ArrayList<>();

    public void agregar(Profesor profe) {
        lista.add(profe);
    }

    public String listar() {
        String out = "";
        for (Profesor profesor : lista) {
            out += profesor + "\n";
        }
        return out;
    }

    public static void grabar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(new File("C:\\Users\\Capa Brothers\\Documents\\NetBeansProjects\\Examen_Angel_Capa/listaDocentes.csv"), true));
            //pw.println("CEDULA;NOMBRES;APELLIDOS;TIPO PROFESOR;HORAS CLASE;HORAS COMPLEMENTARIAS");
            for (Profesor profesor : lista) {
                String out = profesor.getCedula() + ";" + profesor.getNombres() + ";" + profesor.getApellidos() + ";";
                if (profesor instanceof ProfesorTiempoCompleto) {
                    out += "Exclusiva";
                }
                if (profesor instanceof ProfesorMedioTiempo) {
                    out += "Semi Exclusiva";
                }
                if (profesor instanceof ProfesorTiempoParcial) {
                    out += "Tiempo Parcial";
                }
                out += ";" + profesor.getHorasClase() + ";" + profesor.horasComplementarias();
                pw.println(out);
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(ListaProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String leerPofesores() {
      BufferedReader leer = null;
        String lector = "";
        try {
            FileReader f = new FileReader("C:\\Users\\Capa Brothers\\Documents\\NetBeansProjects\\Examen_Angel_Capa/listaDocentes.csv");
            leer = new BufferedReader(f);
            String linea;
            while ((linea = leer.readLine()) != null) {
                String[] registro = linea.split(";");
                if (registro[3].equals("Exclusiva")) {
                    String cedula=registro[0];
                    String nombre=registro[1];
                    String apellido=registro[2];
                    String horario=registro[3];
                    int horasClase=Integer.parseInt(registro[4]);
//                    int horasComplementarias=Integer.parseInt(registro[5]);
                    String carrera=registro[5];
                    ProfesorTiempoCompleto completo = new ProfesorTiempoCompleto(cedula, nombre, apellido, horasClase, carrera);
                    lector += completo.toString() + "\n";
                    lista.add(completo);
                } else if(registro[3].equals("Semi Exclusiva")){
                    String cedula=registro[0];
                    String nombre=registro[1];
                    String apellido=registro[2];
                    String horario=registro[3];
                    int horasClase=Integer.parseInt(registro[4]);
//                    int horasComplementarias=Integer.parseInt(registro[5]);
                    String carrera=registro[5];
                    ProfesorMedioTiempo medioTiempo = new ProfesorMedioTiempo(cedula, nombre, apellido, horasClase, carrera);
                    lector += medioTiempo.toString() + "\n";
                    lista.add(medioTiempo);
                }else if(registro[3].equals("Tiempo Parcial")){
                    String cedula=registro[0];
                    String nombre=registro[1];
                    String apellido=registro[2];
                    String horario=registro[3];
                    int horasClase=Integer.parseInt(registro[4]);
                    int horasComplementarias=Integer.parseInt(registro[5]);
                    String carrera=registro[5];
                    ProfesorTiempoParcial tiempoParcial = new ProfesorTiempoParcial(cedula, nombre, apellido, horasClase, carrera, horasComplementarias);
                    lector += tiempoParcial.toString() + "\n";
                    lista.add(tiempoParcial);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura del archivo");
        }
        return lector;
    }
}
