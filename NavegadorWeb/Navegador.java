public class Navegador{

    // Pilha para armazenar o histórico de navegação (páginas visitadas anteriormente)
   private StackUNA<String> historico;
    // Pilha para armazenar páginas futuras (quando o usuário volta e pode avançar novamente)
   private StackUNA<String> futuro;
   private String paginaAtual;

    public Navegador() {
        this.paginaAtual = "Página Inicial"; // Define a página inicial ao abrir o navegador
        this.futuro = new StackUNA<>();
        this.historico = new StackUNA<>();
    }

    public void digitarEndereço(String link){
        if(paginaAtual != null){
            historico.push(paginaAtual); // Salva a página atual na memória antes de trocar
        }
        paginaAtual = link; // Atualiza a página atual
        System.out.println("Acessando: " + paginaAtual);
        futuro.toEmpty(); // Limpa a pilha de avanço, pois um novo caminho foi iniciado
    }

    public void voltar(){
        if(!historico.verifyIfIsEmpty()){
            futuro.push(paginaAtual); // Salva a página atual na pilha de futuro
            paginaAtual = historico.pop().getValue(); // Retorna à última página visitada e remove a atual da pilha do histórico
            System.out.println("Voltando para: " + paginaAtual);
        }else {
            System.out.println("Não há paginas para voltar");
        }
    }

    public void avançar(){
        if (!futuro.verifyIfIsEmpty()){
            historico.push(paginaAtual); // Salva a página atual na pilha de histórico
            paginaAtual = futuro.pop().getValue(); // Avança para a próxima página armazenada e remove a atual da pilha de futuro
            System.out.println("Avançando para: " + paginaAtual);
        }else {
            System.out.println("Não há paginas para avançar");
        }

    }

    public String getPaginaAtual() {
        return paginaAtual;
    }
}
