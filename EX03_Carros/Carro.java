

package EX03_Carros;

/**
 *
 * @author Aluno
 */
public class Carro {
    
    String marca;
    String modelo;
    int ano;
    boolean ligado;
    
    void ligar(){
        
        if(ligado){
            ligado = false;
            System.out.println("O carro está desligado.\n Ligar o carro? (s/n)");
        }else{
            System.out.println("O carro está ligado.");
        }
        
    }
    
    void desligar(){
        if(ligado){
            ligado = true;
            System.out.println("O carro está ligado. \n Desligar o carro? (s/n).");
            
        }else{
            System.out.println("O carro está desligado.");
        }
        
        
    }
    
}
