public class Main {

    public static void main(String[] args) {

        BrownieNutella brownieNutella = new BrownieNutella("nutelinha", 23, "nutella");
        BrownieDocedeLeite brownieDocedeLeite = new BrownieDocedeLeite("doce de leite", 17, "doce de leite");
        BrownieCafe brownieCafe = new BrownieCafe("cafe", 14, "cafe");

        brownieNutella.addCarrinhoDeCompras();
        brownieCafe.CalculaValorTotalCompra();
        brownieDocedeLeite.adicionaDocedeLeite();

        brownieCafe.MostraInfo();

        Comprador comprador = new Comprador("Geraldo", 300);

        comprador.efetuarCompra(brownieCafe);
        comprador.efetuarCompra(brownieNutella);
        comprador.efetuarCompra(brownieDocedeLeite);








    }
}
