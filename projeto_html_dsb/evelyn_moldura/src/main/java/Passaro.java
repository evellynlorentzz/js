
/**
 *
 * @author Evellyn Victoria Sousa Lorentz
 */
public class Passaro extends Animal{

    public Passaro(String nome,int idade) {
        super(nome,idade);
    }

    @Override
    public void fazersom(){
        System.out.println("piu!");
    }
}