package questionariojava;

import java.util.ArrayList;

/**
 *
 * @author almei
 */
public class Entrevistados {

    ArrayList<Entrevistados> NumEntrevistados = new ArrayList();
   
public String NumeroDeEntrevistados(){
    
    return NumEntrevistados.size() + " ";
    
}  
}