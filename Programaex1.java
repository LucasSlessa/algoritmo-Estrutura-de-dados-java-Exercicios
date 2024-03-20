
import java.util.Scanner;

public class Programaex1 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        // Adiciona elementos
        lista.adiciona("Elemento 1");
        lista.adiciona("Elemento 2");
        lista.adiciona("Elemento 3");
        lista.adiciona("Elemento 4");

      

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nTeste de posição ocupada:\n");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int posicaousuario;
        while (true) {
            System.out.print("Digite a posição (-1 para sair):");
            posicaousuario = scanner.nextInt();
            if (posicaousuario == -1) {
                break;
            }

            if (lista.posicaoOcupada(posicaousuario)) {
                System.out.println("Elemento na posição " + posicaousuario + ": " + lista.pega(posicaousuario));
            } else {
                System.out.println("Posição " + posicaousuario + " não existe.");
            }
        }

        scanner.close();

        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Posição 0 ocupada: " + lista.posicaoOcupada(0));
        System.out.println("Posição 3 ocupada: " + lista.posicaoOcupada(3));
        System.out.println("Posição 11 ocupada: " + lista.posicaoOcupada(11));

      
    }
}
