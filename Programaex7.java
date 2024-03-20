
public class Programaex7 {
    
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        ListaLigada lista2 = new ListaLigada();
    
       
        lista1.adiciona(1);
        lista1.adiciona(2);
        lista1.adiciona(3);
        System.out.println(lista1);
    
        lista2.adiciona(4);
        lista2.adiciona(5);
        lista2.adiciona(6);
        System.out.println(lista2);
    
        
        lista1.concatena(lista2);
    
        
        System.out.println("Concatenated list:");
        System.out.println(lista1);
    }
}
