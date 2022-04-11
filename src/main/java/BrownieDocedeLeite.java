public class BrownieDocedeLeite extends Brownie{

    public BrownieDocedeLeite (String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaDocedeLeite(){
        System.out.println("Brownie de doce de leite adicionado");
    }
    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de doce de leite adicionado ao carrinho");
    }
}
