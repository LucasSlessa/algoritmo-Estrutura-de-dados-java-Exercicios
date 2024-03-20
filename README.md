# Lista Ligada

Este repositório contém uma implementação de uma lista encadeada simples em Java. A lista encadeada permite adicionar, remover e acessar elementos de forma eficiente.

Este repositório inclui as seguintes funções:

- `adiciona(int elemento)`: Adiciona um elemento ao final da lista.
- `remove(int elemento)`: Remove o primeiro elemento da lista que é igual ao elemento fornecido.
- `pega(int posicao)`: Retorna o elemento na posição fornecida.
- `posicao(int elemento)`: Retorna a posição do primeiro elemento da lista que é igual ao elemento fornecido.
- `imprime()`: Imprime todos os elementos da lista.
- `isVazia()`: Retorna true se a lista estiver vazia, e false caso contrário.
- `tamanho()`: Retorna o número de elementos na lista.
- `removeNonPrimes()`: Remove todos os elementos da lista que não são primos.
- `copia()`: Cria uma cópia da lista.
- `concatena(ListaLigada lista)`: Concatena a segunda lista ao final da primeira.

## Testando as Funções

Para testar as funções, você pode usar o seguinte código:

```java
public static void main(String[] args) {
    ListaLigada lista = new ListaLigada();

    // Adiciona alguns elementos à lista
    lista.adiciona(1);
    lista.adiciona(2);
    lista.adiciona(3);
    lista.adiciona(4);
    lista.adiciona(5);

    // Imprime a lista
    System.out.println("Lista:");
    lista.imprime();

    // Remove alguns elementos da lista
    lista.remove(2);
    lista.remove(4);

    // Imprime a lista
    System.out.println("\nLista após remover alguns elementos:");
    lista.imprime();

    // Acessa alguns elementos da lista
    System.out.println("\nElemento na posição 0: " + lista.pega(0));
    System.out.println("Elemento na posição 2: " + lista.pega(2));

    // Verifica a posição de alguns elementos
    System.out.println("\nPosição do elemento 1: " + lista.posicao(1));
    System.out.println("Posição do elemento 3: " + lista.posicao(3));

    // Verifica se a lista está vazia
    System.out.println("\nA lista está vazia? " + lista.isVazia());

    // Verifica o tamanho da lista
    System.out.println("Tamanho da lista: " + lista.tamanho());

    // Remove todos os elementos não primos da lista
    lista.removeNonPrimes();
    System.out.println("\nLista após remover elementos não primos:");
    lista.imprime();

    // Cria uma cópia da lista
    ListaLigada copia = lista.copia();
    System.out.println("\nCópia da lista:");
    copia.imprime();

    // Concatena duas listas
    ListaLigada lista2 = new ListaLigada();
    lista2.adiciona(6);
    lista2.adiciona(7);
    lista.concatena(lista2);
    System.out.println("\nLista após concatenar outra lista:");
    lista.imprime();
}
