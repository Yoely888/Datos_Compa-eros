/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datperscompañeros;

/**
 *
 * @author 14-cf2074
 */
public class DatPersCompañeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        String[][] compañeros =  {
            {"Arnold", "Aguliar", "Ingeniería Electrica", "Egresado de infop"},
            {"Diana", "Selva", "Ingeniería En Computación", "Ingenieria Civil"},
            {"Yolany", "Chirino", "Ingeniería en Producción Industrial", "control de calidad"},
            {"Carlos", "Portillo", "Ingeniería en computación", "Empresa Tecnicom"},
            {"Francisco", "Tabora", "Ingeniería Electrica", "Tecnico electrico en Gildan"}
        };

        // Imprimir los datos de cada compañero
        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Nombre: " + compañeros[i]);
            System.out.println("Apellido: " + compañeros[i]);
            System.out.println("Carrera: " + compañeros[i]);
            System.out.println("Lugar de Trabajo: " + compañeros[i]);
            System.out.println();
        }
    }
}