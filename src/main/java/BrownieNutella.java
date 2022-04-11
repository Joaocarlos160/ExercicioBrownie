public class BrownieNutella extends Brownie{

    public BrownieNutella (String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Brownie de nutella adicionado");
    }
    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de nutella adicionado ao carrinho");
    }
}
