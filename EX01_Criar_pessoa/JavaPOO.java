package EX01_Criar_pessoa;

/**
 *
 * @author Aluno
 */
public class JavaPOO {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Vitor";
        p1.idade = 23;
        p1.altura = 1.72;
        
        p1.apresentar();

    }

}
