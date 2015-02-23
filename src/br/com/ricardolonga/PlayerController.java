package br.com.ricardolonga;

/*
 * A classe Aplicacao quer executar o comando Record. Muitos if's como no método botaoClicado não é bom.
 * Precisamos melhorar isso para evitarmos a necessidade de voltar a modificar esta classe.
 */
public class PlayerController {

    public void botaoClicado(String botao) {
        if ("play".equalsIgnoreCase(botao)) {
            new PlayCommand().executar();
        } else if ("pause".equalsIgnoreCase(botao)) {
            new PauseCommand().executar();
        } else if ("stop".equalsIgnoreCase(botao)) {
            new StopCommand().executar();
        } else {
            throw new UnsupportedOperationException("Botão desconhecido.");
        }
    }

}
