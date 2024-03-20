import java.util.Scanner;

public class Programaex5 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        Scanner scanner = new Scanner(System.in);
        int usuario;
        while (true) {
            System.out.print("Digite a entrada(-1 para sair):");
            usuario = scanner.nextInt();
            if (usuario == -1) {
                break;
            } else {
                lista.adiciona(usuario);
            }
        }
        ListaLigada copia = lista.copia();

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista Completa: " + lista);
        System.out.println(
            "--------------------------------------------------------------------------------------------------------------------------------");


        
        lista.removeNaoPrimos();

        scanner.close();

        // Mostra o conteúdo da lista
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista sem os nao primos: " + lista);
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");

        
        System.out.println("Lista Copiada: " + copia);

    }
}
