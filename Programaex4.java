import java.util.Scanner;

public class Programaex4 {
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
     

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista Completa: " + lista);
        System.out.println(
            "--------------------------------------------------------------------------------------------------------------------------------");


        // Remove non-prime elements from the list
        lista.removeNaoPrimos();

        scanner.close();

        // Mostra o conteúdo da lista
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista sem os nao primos: " + lista);
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");

        
     

    }
}
