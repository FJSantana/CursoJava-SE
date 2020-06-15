package Titanium.CLC;
import java.io.*;
import java.lang.String;


public class CLC {

    //Creamos objetos de la clase File
    File archivo = null;
    FileReader leer = null;
    BufferedReader br = null;
    String dA = "";

        //Set de asignar Direccion de Archivo
        public void setDA (String dA){
            this.dA = dA;
        }

        //Get de asignar Direccion de Archivo
        public String getSA (){
            return this.dA;
        }

        //Pasamos el archivo a FileReader
        leer = new FileReader(dA);
        //Pasamos el archivo leido a BufferedReader
        br = new BufferedReader(leer);

        //Lectura

        //Para guardar cada linea leida en un String
        String lineas;
        //Para guardar el numero de lineas
        int numeroLineas = 0;
        //Ciclo para leer lineas hasta que este vacio
        while((lineas = br.readLine())!= null){
            System.out.println(lineas);
            numeroLineas = numeroLineas + 1;
        }
        System.out.println("Total de lineas de código: " + numeroLineas);

}
