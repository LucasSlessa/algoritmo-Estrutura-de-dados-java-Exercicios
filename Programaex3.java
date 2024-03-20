

public class Programaex3 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        // Adiciona elementos
        lista.adiciona("Elemento 1");
        lista.adiciona("Elemento 2");
        lista.adiciona("Elemento 3");
        lista.adiciona("Elemento 4");

        // Mostra o conteúdo da lista
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista: " + lista);
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");

        // Adiciona no começo
        lista.adicionaNoComeco("Elemento 0");

        // Mostra o conteúdo da lista novamente
        System.out.println("Lista após adicionar no começo: " + lista);
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
     
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nTeste de remoção do início:\n");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------------");
        lista.removeDoComeco();
        System.out.println("Lista após remoção do primeiro elemento: " + lista);
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
