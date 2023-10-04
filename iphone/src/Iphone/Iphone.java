package Iphone;

public class Iphone {
    private String marca = "Apple";
    private String modelo = "10";

    public static void main(String[] args) {

        NavegadorInternet web = new NavegadorInternet();
        web.adicionarNovaAba();
        web.atualizarPagina();
        web.exibirPagina();
    }
}