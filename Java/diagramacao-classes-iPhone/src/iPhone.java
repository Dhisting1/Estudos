public class iPhone implements AparelhoTelefonico, Navegador, ReprodutorMusical{

    @Override
    public void selecinarMusica(String escolherMusica) {
        System.out.println("Escolha uma musica: "+escolherMusica);
    }

    @Override
    public void tocar() {
        System.out.println("Play");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(" + ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Refresh");
    }

    @Override
    public void ligar(String numero) {
        System.out.println(numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println(numero);
    }

    @Override
    public void iniciarCorreioVoz(String numero, String numeroDiscado) {
        System.out.println(numero);
        System.out.println(numeroDiscado);
    }
}
