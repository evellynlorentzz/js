
/**
 *
 * @author Evellyn Victoria Sousa Lorentz
 */
public class Cachorro extends Animal{

    public Cachorro(String nome,int idade) {
        super(nome,idade);
    }
    
    @Override
    public void fazersom(){
        System.out.println("Au!");
    }
}