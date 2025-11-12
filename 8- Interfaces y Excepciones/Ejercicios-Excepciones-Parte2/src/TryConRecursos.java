import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryConRecursos {

    public static void main(String[] args) {
        // (crear este archivo en la raíz del proyecto para que la prueba funcione)
        String nombreArchivo = "archivo_para_leer.txt";

        System.out.println("\n--- 5. Lectura de Archivo (Try-With-Resources) ---");

        // 1. TRY-WITH-RESOURCES:
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            // 2. Se usa el recurso
            System.out.println("Leyendo archivo '" + nombreArchivo + "':");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            // 3. NO SE NECESITA FINALLY.
            // Java llama a br.close() automáticamente al salir del bloque try,
            // tanto si hubo éxito como si hubo error.

        } catch (IOException e) {
            // 4. CATCH: Captura errores (si no existe o no se puede leer)
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
