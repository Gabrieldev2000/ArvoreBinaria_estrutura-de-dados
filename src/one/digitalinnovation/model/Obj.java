package one.digitalinnovation.model;

import java.util.Objects;

/**
 * Classe representando um objeto com valor inteiro para ser usado em uma árvore.
 * Estende ObjArvore para fornecer suporte a árvores.
 */
public class Obj extends ObjArvore<Obj> {

    // Atributo para armazenar o valor inteiro associado a esta instância
    Integer meuValor;

    /**
     * Construtor para inicializar um objeto com um valor inteiro.
     *
     * @param meuValor O valor inteiro a ser associado ao objeto.
     */
    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    /**
     * Verifica se dois objetos são iguais com base no valor inteiro.
     *
     * @param o Objeto a ser comparado.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    /**
     * Gera um código de hash com base no valor inteiro.
     *
     * @return Código de hash gerado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    /**
     * Método erroneamente chamado de hasCode() (deveria ser hashCode()), retorna 0.
     *
     * @return Sempre retorna 0.
     */
    @Override
    public int hasCode() {
        return 0;
    }

    /**
     * Compara dois objetos com base no valor inteiro.
     *
     * @param outro Objeto a ser comparado.
     * @return Um número negativo se este objeto for menor, 0 se igual, um número positivo se maior.
     */
    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        if (this.meuValor > outro.meuValor) {
            i = 1;
        } else if (this.meuValor < outro.meuValor) {
            i = -1;
        }
        return i;
    }

    /**
     * Retorna uma representação em string do objeto usando o valor inteiro.
     *
     * @return Representação em string do objeto.
     */
    @Override
    public String toString() {
        return meuValor.toString();
    }
}
