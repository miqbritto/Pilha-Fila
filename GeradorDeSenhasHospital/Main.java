public class Main {
    public static void main(String[] args) {
        GeradorDeSenhas fila = new GeradorDeSenhas();

        fila.geraSenha();
        fila.geraSenha();
        fila.chamarProximo();
        fila.geraSenha();
        fila.geraSenha();
        fila.chamarProximo();
        fila.emitirHistorico();
        fila.reiniciarContagem();
        fila.geraSenha();

        System.out.println();
    }
}