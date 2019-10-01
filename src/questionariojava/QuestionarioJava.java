package questionariojava;

import java.util.ArrayList;
/**
 *
 * @author almei
 */
public class QuestionarioJava {

    public static void main(String[] args) {

        ArrayList<String> Perguntas = new ArrayList();

        Perguntas.add("1 ) Qual seu nível de satisfação em relação ao atual desenvolvimento da cidade?");
        Perguntas.add("2 ) Como você considera o trânsito da cidade?");
        Perguntas.add("3 ) Em relação aos inventimentos com saúde sua opinião é?");
        Perguntas.add("4 ) Qual seu grau de satisfação em relação infraestrutura da cidade?");
        Perguntas.add("5 ) Sua opinião em relação a educação pública é?");
        Perguntas.add("6 ) Como você considera a conservação dos patrimônios públicos de nossa cidade?");
        Perguntas.add("7 ) Quanto a disponibilidade de vagas de empregos qual sua opinião?");
        Perguntas.add("8 ) Em relação ao comércio, considerando a variedade e qualidade de produtos, qual seu nível de satisfação?");
        Perguntas.add("9 ) Considerando o entretenimento qual seu nível de satisfação?");
        Perguntas.add("10 ) Como você considera a segurança pública de nossa cidade?");

        System.out.println(Perguntas.get(0));
        System.out.println(Perguntas.get(1));
        System.out.println(Perguntas.get(2));
        System.out.println(Perguntas.get(3));
        System.out.println(Perguntas.get(4));
        System.out.println(Perguntas.get(5));
        System.out.println(Perguntas.get(6));
        System.out.println(Perguntas.get(7));
        System.out.println(Perguntas.get(8));
        System.out.println(Perguntas.get(9));

        ArrayList<Entrevistados> NumEntrevistados = new ArrayList();

        new Entrada().setVisible(true);    //Instanciando a janela de entrada da pesquisa
    }
}