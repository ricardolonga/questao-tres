package br.com.ricardolonga;

public class Aplicacao {
    
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        
        playerController.botaoClicado("play");
        playerController.botaoClicado("pause");
        playerController.botaoClicado("stop");
    }
    
}
