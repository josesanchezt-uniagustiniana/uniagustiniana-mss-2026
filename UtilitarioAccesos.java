package entrega;

public class UtilitarioAccesos {

    private UtilitarioAccesos(){

    }

    public static String validarAccesoAdministrador(int loginAttempts){

        String accessStatus = "";

        if (loginAttempts < 5) {
            accessStatus = "FULL_ADMIN_ACCESS";
        } else {
            accessStatus = "LOCKED_OUT";
        
        }
            
        return accessStatus;
    }

    public static String validarAccesoManager(String username, boolean isTrial){
        
        String accessStatus = "";

        if (username.contains("special_")) {
            if (!isTrial) {
                accessStatus = "MANAGER_SPECIAL_ACCESS";
            } else {
                accessStatus = "MANAGER_TRIAL_ACCESS";
            }
        } else {
            accessStatus = "MANAGER_BASIC_ACCESS";
        }

        if(accessStatus == ""0){

        }

        return accessStatus;
            
    }
    
}
