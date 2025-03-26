public class GeradorDeSenhas {

    // Fila que armazena as senhas aguardando atendimento
    private QueueUNA<Integer> filaDeSenhas;
    // Histórico de todas as senhas chamadas
    private QueueUNA<Integer> historicoSenhas;
    // Número da próxima senha a ser gerada
    private int senhaAtual;

    public GeradorDeSenhas() {
        this.filaDeSenhas = new QueueUNA<>();
        this.historicoSenhas = new QueueUNA<>();
        this.senhaAtual = 1;
    }

    // Gera uma nova senha e a adiciona à fila de atendimento.
    public void geraSenha(){
        filaDeSenhas.enqueue(senhaAtual);
        System.out.println("Sua senha é: " + senhaAtual);
        senhaAtual++;
    }

    /**
     * Chama a próxima senha na fila e a adiciona ao histórico.
     * Se a fila estiver vazia, exibe uma mensagem informando que não há senhas para chamar.
     */
    public void chamarProximo(){
        if (!filaDeSenhas.verifyIfIsEmpty()){
            int senhaChamada = filaDeSenhas.dequeue().getValue();
            historicoSenhas.enqueue(senhaChamada);
            System.out.println("Chamando senha: " + senhaChamada);
        }else{
            System.out.println("Não há senhas a serem chamadas");
        }
    }

    // Exibe o histórico de todas as senhas chamadas.
    public void emitirHistorico(){
        System.out.println("Histórico de senhas chamadas: " + historicoSenhas);
    }

    // Reinicia a contagem de senhas, voltando ao número 1.
    public void reiniciarContagem() {
        this.senhaAtual = 1;
        System.out.println("Contagem de senhas reiniciada.");
    }
}