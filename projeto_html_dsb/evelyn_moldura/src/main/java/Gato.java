
/**
 *
 * @author Evellyn Victoria Sousa Lorentz
 */  
public class Gato extends Animal{

    public Gato(String nome,int idade) {
        super(nome,idade);
    }
    
    @Override
    public void fazersom(){
        System.out.println("Miau");
    }
}