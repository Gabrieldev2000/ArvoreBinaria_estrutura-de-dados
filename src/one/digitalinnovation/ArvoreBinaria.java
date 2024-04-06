package one.digitalinnovation;

/**
 * Classe que representa uma árvore binária genérica.
 *
 * @param <T> Tipo genérico que deve ser comparável.
 */
public class ArvoreBinaria<T extends Comparable<T>> {

    // Raiz da árvore
    private BinNo<T> raiz;

    /**
     * Construtor padrão que inicializa a raiz como nula.
     */
    public ArvoreBinaria() {
        this.raiz = null;
    }

    /**
     * Método para inserir um novo conteúdo na árvore.
     *
     * @param conteudo Conteúdo a ser inserido.
     */
    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    // Método privado auxiliar para inserção
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    /**
     * Método para exibir a árvore em ordem.
     */
    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    // Método privado auxiliar para exibição em ordem
    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    /**
     * Método para exibir a árvore em pós-ordem.
     */
    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    // Método privado auxiliar para exibição em pós-ordem
    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    /**
     * Método para exibir a árvore em pré-ordem.
     */
    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    // Método privado auxiliar para exibição em pré-ordem
    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    /**
     * Método para remover um conteúdo da árvore.
     *
     * @param conteudo Conteúdo a ser removido.
     */
    public void remover(T conteudo) {
        try {
            // Lógica de remoção
            // ...
        } catch (NullPointerException erro) {
            System.out.println("Conteúdo não encontrado. Bloco catch");
        }
    }
}
