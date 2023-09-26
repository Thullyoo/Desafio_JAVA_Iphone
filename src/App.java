import Entidade.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        // Ligar o celular
        iphone.ligarCelular();

        // Testar os métodos
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.trocarMusica();
        iphone.novaPagina();
        iphone.fecharPagina();
        iphone.ligarNumero("123-456-7890");
        iphone.desligarLigacao();
        iphone.desligarCelular();
    }
}
