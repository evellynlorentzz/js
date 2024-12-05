
/**
 *
 * @author Evellyn Victoria Sousa Lorentz
 */
public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: "+ nome +". Idade: "+ idade +" anos.");
    }
    public void fazersom(){
        System.out.println("O animal esta fazendo um som");
    }
}