package one.digitalinnovation;

/**
 * Classe que representa um nó em uma árvore binária genérica.
 *
 * @param <T> Tipo genérico que deve ser comparável.
 */
public class BinNo<T extends Comparable<T>> {

    // Conteúdo do nó
    private T conteudo;

    // Referência para o nó à esquerda
    private BinNo<T> noEsq;

    // Referência para o nó à direita
    private BinNo<T> noDir;

    /**
     * Construtor que inicializa o nó com um conteúdo específico.
     *
     * @param conteudo Conteúdo a ser associado ao nó.
     */
    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    /**
     * Construtor vazio.
     */
    public BinNo() {

    }

    /**
     * Obtém o conteúdo do nó.
     *
     * @return Conteúdo do nó.
     */
    public T getConteudo() {
        return conteudo;
    }

    /**
     * Define o conteúdo do nó.
     *
     * @param conteudo Conteúdo a ser associado ao nó.
     */
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Obtém a referência para o nó à esquerda.
     *
     * @return Nó à esquerda.
     */
    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    /**
     * Define a referência para o nó à esquerda.
     *
     * @param noEsq Nó à esquerda a ser associado.
     */
    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    /**
     * Obtém a referência para o nó à direita.
     *
     * @return Nó à direita.
     */
    public BinNo<T> getNoDir() {
        return noDir;
    }

    /**
     * Define a referência para o nó à direita.
     *
     * @param noDir Nó à direita a ser associado.
     */
    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    /**
     * Representação em string do nó.
     *
     * @return String representando o nó.
     */
    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
