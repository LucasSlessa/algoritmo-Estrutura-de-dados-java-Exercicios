public class Programaex8 {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Ana");
        lista.adiciona("Bia");
        lista.adiciona("Carlos");
        lista.adiciona("Daniel");
    
        System.out.println(lista.buscaSequencial("Bia"));
        System.out.println(lista.buscaSequencial("Eduardo"));
        System.out.println(lista.buscaSequencial("Daniel"));
    }
    
}
