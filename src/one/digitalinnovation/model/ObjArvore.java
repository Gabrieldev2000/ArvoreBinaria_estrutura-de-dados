package one.digitalinnovation.model;

/**
 * Classe abstrata que fornece uma estrutura base para objetos utilizados em árvores.
 * Implementa a interface Comparable para permitir comparações entre objetos.
 *
 * @param <T> Tipo genérico para a classe.
 */
public abstract class ObjArvore<T> implements Comparable<T> {

    /**
     * Verifica se dois objetos são iguais.
     *
     * @param o Objeto a ser comparado.
     * @return true se os objetos são iguais, false caso contrário.
     */
    public abstract boolean equals(Object o);

    /**
     * Método erroneamente chamado de hasCode() (deveria ser hashCode()).
     *
     * @return Valor do código de hash.
     */
    public abstract int hasCode();

    /**
     * Compara dois objetos.
     *
     * @param outro Objeto a ser comparado.
     * @return Um número negativo se este objeto for menor, 0 se igual, um número positivo se maior.
     */
    public abstract int compareTo(T outro);

    /**
     * Retorna uma representação em string do objeto.
     *
     * @return Representação em string do objeto.
     */
    public abstract String toString();
}
