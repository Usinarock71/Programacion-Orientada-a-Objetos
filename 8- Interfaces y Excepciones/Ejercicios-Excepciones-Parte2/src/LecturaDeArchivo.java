import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivo {

    public static void main(String[] args) {
        String nombreArchivo = "archivo_que_no_existe.txt";
        BufferedReader br = null; // Declarar fuera del try para que 'finally' lo vea

        try {
            System.out.println("\n--- 3. Lectura de Archivo (con finally) ---");

            // 1. TRY: Se intenta abrir y leer el archivo
            br = new BufferedReader(new FileReader(nombreArchivo));

            System.out.println("Archivo '" + nombreArchivo + "' encontrado. Contenido:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            // 2. CATCH (Específico): Se ejecuta si el archivo no se encuentra
            System.err.println("Error: El archivo '" + nombreArchivo + "' no pudo ser encontrado.");
        } catch (IOException e) {
            // 3. CATCH (Genérico): Captura otros errores de E/S
            System.err.println("Error general de E/S al leer el archivo: " + e.getMessage());
        } finally {
            // 4. FINALLY: Se ejecuta siempre para cerrar el recurso
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el recurso: " + e.getMessage());
            }
        }
    }
}
