public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println( "Brownie adiconado ao carrinho");
    }
    public void CalculaValorTotalCompra(){
        System.out.println(nome + " preco: " + preco);

    }
    public void MostraInfo(){
        System.out.println("nome: " + nome);
        System.out.println("sabor: " + sabor);
        System.out.println("preco: " + preco);
    }

}
