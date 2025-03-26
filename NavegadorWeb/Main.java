public class Main {
    public static void main(String[] args) {

        Navegador mozilla = new Navegador();

        mozilla.digitarEndereço("google");
        mozilla.voltar();
        mozilla.voltar();
        mozilla.digitarEndereço("google");
        mozilla.digitarEndereço("facebook");
        mozilla.voltar();
        mozilla.voltar();

        System.out.println();
    }
}