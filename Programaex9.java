public class Programaex9 {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();
        lista.adiciona("Ana");
        System.out.println("lista completa: "+ lista.toString());

        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia.");
        }

        lista.removeDoComeco();
        System.out.println("-----------elemento removido-------------");

        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia.");
        }

    }
}
