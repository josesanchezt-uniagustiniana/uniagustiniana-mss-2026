package entrega;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class TallerCorreccion {


    Logger logger = Logger.getLogger("TallerCorreccion");
    public void readDataFromFile(String filePath) throws IOException {
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            // Simulación de lectura de datos
            byte[] buffer = new byte[1024];
            while (fis.read(buffer) != -1) {
                System.out.println("Arreglo");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String generatePasswordToken() {

        SecureRandom random = new SecureRandom();

        long base = random.nextLong();
        return Constante.TEMP_TOKEN + base;
    }

    // 3. Code Smell (MAJOR): Complejidad Ciclomática Alta (S138)
    // Este método es excesivamente complejo y tiene demasiados puntos de decisión anidados.
    public String checkUserAccessLevel(String username, int roleId, boolean isActive, boolean isTrial, int loginAttempts) {

        /****
         *
         *
         * Uniagustiniana 2026
         *
         */
        String uniagustiana = "";
        String accessStatus = "";

        int opcion = 0;
        HashMap<Integer, String> opciones = new HashMap<>();
        //opciones.put(1,UtilitarioAccesos.validarAccesoAdministrador(loginAttempts) );
        opciones.put(2,UtilitarioAccesos.validarAccesoManager(username, isTrial) );
        //accessStatus = opciones.get(roleId);
        System.out.println("hola");
        //logger.info("Imprimir con printns en Java");
        String variable = "asdfffffasdfasdsadaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";

        if (isActive) {
            if(opcion == 1){
                if (loginAttempts < 5) {
                    accessStatus = "FULL_ADMIN_ACCESS";
                } else {
                    accessStatus = "LOCKED_OUT";

                }
            }

            if(opcion ==2 ){

            }

        } else {
            accessStatus = "ACCOUNT_INACTIVE";
        }

        return accessStatus;
    }

    // 4. Code Smell (MINOR): Verificación de Colecciones Ineficiente (S1155)
    public boolean checkEmptyList(List<String> items) {
        // 🔥 CODE SMELL: Collection.isEmpty() should be used to test for emptiness (S1155)

        return items.size() == 0;

        // Solución: Usar el Quick-Fix de SonarLint para reemplazar items.size() == 0 por items.isEmpty().
    }

    public boolean validateCredentials(String user, String pass) {

        return user == null || user.isEmpty() || pass == null || pass.isEmpty();

     }
}