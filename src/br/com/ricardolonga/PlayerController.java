package br.com.ricardolonga;

/*
 * A tendência desta classe é crescer com a adição de novas ações. 
 * Tente separar as responsabilidades em novas classes.
 */
public class PlayerController {


    public void botaoClicado(String botao) {
        if ("play".equalsIgnoreCase(botao)) {
            play();
        } else if ("pause".equalsIgnoreCase(botao)) {
            pause();
        } else if ("stop".equalsIgnoreCase(botao)) {
            stop();
        } else {
            throw new UnsupportedOperationException("Botão desconhecido.");
        }
    }
    
    private void play() {
        /*
         * Vamos supor que neste método tenhamos muitas linhas de código...
         */
        System.out.println("Tocando a música...");
        /*
         * Vamos supor que neste método tenhamos muitas linhas de código...
         */
    }

    private void pause() {
        /*
         * Vamos supor que neste método tenhamos muitas linhas de código...
         */
        System.out.println("Música pausada...");
        /*
         * Vamos supor que neste método tenhamos muitas linhas de código...
         */
    }

    private void stop() {
        /*
         * Vamos supor que neste método tenhamos muitas linhas de código...
         */
        System.out.println("Música finalizada...");
        /*
         * Vamos supor que neste método tenhamos muitas linhas de código...
         */
    }

}
