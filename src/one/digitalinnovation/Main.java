package one.digitalinnovation;

import one.digitalinnovation.ArvoreBinaria;
import one.digitalinnovation.model.Obj;

/**
 * Classe principal que contém o método main para testar a implementação da árvore binária.
 */
public class Main {

    public static void main(String[] args) {

        // Criando uma instância da árvore binária com objetos da classe Obj
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        // Inserindo objetos na árvore
        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        // Exibindo a árvore em diferentes ordens
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }
}
