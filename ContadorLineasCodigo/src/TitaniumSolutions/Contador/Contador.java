package TitaniumSolutions.Contador;
import java.io.*;
import java.util.regex.*;


public class Contador {

    //Creamos una varible para almacenar la direccion instanciada del objeto en el main
    private String dA;

    //Set
    public void setdA(String dA) {
        this.dA = dA;
    }

    //Get
    public String getdA() {
        return this.dA;
    }

    //Metodo para mostras Lineas
    public void mostrarLineas() {
        //Creamos un objeto de la clase File para poder importar y leer un archivo
        File archivo = null;
        FileReader leerArchivo = null;
        BufferedReader br = null;
        //Variable para guardar el número del lineas de código
        int numLineas = 0;


        //Leemos nuestro archivo con su direccion de localización
        try {
            archivo = new File(dA);
            leerArchivo = new FileReader(archivo);
            br = new BufferedReader(leerArchivo);

            //String para gurdar la linea leida
            String linea;
            //Bucle para poder leer lineas mientras sea diferente de nulo
            while ((linea = br.readLine()) != null){
                System.out.println(linea);

                //Creamos un objeto de la clase Pattern para poder comparar este contenido de String
                Pattern comp = Pattern.compile("^import");
                //Hace la comparacion con "linea"
                Matcher mat = comp.matcher(linea);

                //Creamos un objeto de la clase Pattern para poder comparar este contenido de String
                Pattern comp2 = Pattern.compile("^package");
                //Hace la comparacion con "linea"
                Matcher mat2 = comp2.matcher(linea);

                //Creamos un objeto de la clase Pattern para poder comparar este contenido de String
                Pattern comp3 = Pattern.compile("^//");
                //Hace la comparacion con "linea"
                Matcher mat3 = comp3.matcher(linea);

                //Creamos un objeto de la clase Pattern para poder comparar este contenido de String
                Pattern comp4 = Pattern.compile("^");
                //Hace la comparacion con "linea"
                Matcher mat4 = comp4.matcher(linea);


                //Comparamos si la linea tiene un import, package, comentarios o espacio en blanco
                if (mat.matches() || mat2.matches() || mat3.matches() || mat4.matches()){
                    //Siendo asi numLineas no cambia
                    numLineas = numLineas;
                }else {
                    //Incrementamos cada linea leida en 1 si no se cumple alguna condicion de lo anterior
                    numLineas++;
                }
            }
                //Mostramos número de lineas leidas
                System.out.println();
                System.out.println("El número de lineas leidas de código en el archivo es de: " + numLineas);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
