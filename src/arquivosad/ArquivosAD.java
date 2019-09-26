
package arquivosad;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArquivosAD {

   
    public static void main(String[] args) throws IOException {
    //1º
        //permite crear un directorio pasandole
        //la ruta completa
        
        //con el condicional se comprueba si existe o no
        //en caso de que no se crea, y si sale si no se crea
        File arquivosdir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");

        if (arquivosdir.exists() == false) {

            arquivosdir.mkdir();
        } else {
            System.out.println("Directorio arquivosdir existente");
        }

        //2º
       //Mediante la ruta completa de nuestro  directorio
        //Podemos crear un fichero en nuestro directorio
        File productos1 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/productos1");

        if (productos1.exists() == false) {

            try {
                productos1.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ArquivosAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            System.out.println("Archivo productos existente");

        }

        //3º
        //Permite comprobar la ruta completa de nuestro directorio
        File comprobar = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");

        System.out.println("Ruta:" + comprobar.getAbsolutePath());

        //comprobamos si existe mediante el objeto anterior
        if (productos1.exists() == false) {

            System.out.println("Archivo NO existente");

        } else {

            System.out.println("Archivo productos1 existente");

        }
        //5º
       //SE emplea un array que recoja todos los subdirectorios y 
        //archivos que hay en la ruta especificada
        String[]contenido1 = comprobar.list();
        
        if(contenido1==null){
            
            System.out.println("No hay contenido en este directorio");
            
        }else{
            
            for(int i=0;i<contenido1.length;i++){
                
                System.out.println(contenido1[i]);
                
            }
            
            
        }
        
        
        //4º
        //Creamos un subdirectorio dentro de nuestro primer directorio
        //Al igual que con el primero, comprobamos si existe previamente
        File subdir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");

        if (subdir.exists() == false) {

            subdir.mkdir();

        } else {

            System.out.println("Directorio  subdir ya existente");

        }
//5º
        //Creamos un nuevo fichero denntro del subdirectorio antes creado
        //Se comnprueba si ya existe uno con el mismo nombre
        File productos2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2");

        if (productos2.exists() == false) {

            try {
                productos2.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ArquivosAD.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            System.out.println("Archivo Products2 ya existe");

        }
        //6
        //Nos muestra la ruta completa del primer directorio creado
        File amosar2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");

        System.out.println(amosar2.getAbsolutePath());

        //7
        //Nos muestra el nombre, ruta completa y los priivilegios
        //que este fichero posee(lectura y escritura) 
        //y la longitud de lo que haya escrito en el
        System.out.println("Nome:" + productos1.getName());
        System.out.println("Nome:" + productos1.getAbsolutePath());

        if (productos1.canWrite() == true) {

            System.out.println("Es posible escribir en él");

        } else {

            System.out.println("No es posible escribir en él");

        }

        if (productos1.canRead() == true) {

            System.out.println("Es posible leer en él");

        } else {

            System.out.println("No es posible leer en él");

        }

        System.out.println("Longitud en bytes:" + productos1.length());

        //8
        //Le quitamos el privilegio de escritura
        productos1.setReadOnly();

        //9
        //Devolvemos el derecho de escritura
        productos1.setWritable(true);

        //10
//        productos1.delete();

        
}
}
    
    
     
   
    

    
    

