package questionariojava;
/**
 *
 * @author almei
 */
public class Perguntas {

    static void add(String numperg) {
        throw new UnsupportedOperationException("Not supported yet.");   //To change body of generated methods, choose Tools | Templates.
    }
    
    private String Pergunta;


    public String getPergunta(){
        return Pergunta;
    }

    public Perguntas(String Pergunta) {
        this.Pergunta = Pergunta;
    }

    @Override
    public String toString() {
        return Pergunta; 
    }
    
}
