

class ListaLigada {
    private Celula primeira;
    private Celula ultima;
    private int total;

    public ListaLigada() {
        this.primeira = null;
        this.ultima = null;
        this.total = 0;
    }

    public void adiciona(Object elemento) {
        Celula nova = new Celula(elemento);
        if (total == 0) {
            primeira = nova;
        } else {
            ultima.setProxima(nova);
        }
        ultima = nova;
        total++;
    }

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento);
        nova.setProxima(primeira);
        primeira = nova;
        if (total == 0) {
            ultima = primeira;
        }
        total++;
    }

    public int tamanho() {
        return total;
    }


    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        return atual;
    }

    public void removeDoComeco() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        primeira = primeira.getProxima();
        total--;

        if (total == 0) {
            ultima = null;
        }
    }

            //checagem de é primo
        public static boolean isPrimo(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public void removeNaoPrimos() {
            Celula atual = this.primeira; 
            Celula anterior = null; 
            while (atual != null) { 
                if (!isPrimo((int) atual.getElemento())) { 
                    if (anterior == null) {
                        this.primeira = atual.getProxima(); 
                    } else {
                        anterior.setProxima(atual.getProxima());
                    }
                    this.total--; 
                } else {
                    anterior = atual; 
                }
                atual = atual.getProxima(); 
            }
        
            this.ultima = this.achaUltima(); 
        }
        
    
    private Celula achaUltima() {
        Celula atual = this.primeira;
        while (atual.getProxima() != null) {
            atual = atual.getProxima();
        }
        return atual;
    }

    //copia  os elementos da lista para listaencadeada
    public ListaLigada copia() {
        ListaLigada copia = new ListaLigada();
        Celula atual = this.primeira;
        while (atual != null) {
            copia.adiciona(atual.getElemento());
            atual = atual.getProxima();
        }
        return copia;
    }

    //concatena listas

    public ListaLigada concatena(ListaLigada lista) {
        if (this.ultima != null) {
            this.ultima.setProxima(lista.primeira);
            this.ultima = lista.ultima;
        } else {
            this.primeira = lista.primeira;
            this.ultima = lista.ultima;
        }
        this.total += lista.total;
        lista.primeira = null;
        lista.ultima = null;
        lista.total = 0;
        return this;
    }

    //buscasequncia de elementos

    public int buscaSequencial(Object elemento) {
        Celula atual = this.primeira;
        int posicao = 0;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return posicao;
            }
            atual = atual.getProxima();
            posicao++;
        }
        return -1;
    }


    //verificar se a lista esta vazia 
    public boolean isEmpty() {
        return this.primeira == null;
    }


    @Override
    public String toString() {
        if (total == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        while (atual != null) {
            builder.append(atual.getElemento());
            if (atual.getProxima() != null) {
                builder.append(", ");
            }
            atual = atual.getProxima();
        }
        builder.append("]");
        return builder.toString();
    }
}
