
package projeto.nota.fiscal;

/*
 * @version 8/10/2020
 * @author wesley lima dias ddo vale
 */
public class Produto {
    private String nomeProduto;
    private String valor;
/**
 * Construtor
 * @param nomeProduto é o nome do Produto
 * @param valor é o preço do produto
 */
    public Produto(String nomeProduto, String valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }
/**
 * Método de acesso ao atributo nomeProduto
 * @return nome do Produto
 */
    public String getNomeProduto() {
        return nomeProduto;
    }
/**
 * Método modificador do atributo nome
 * @param nomeProduto é o novo nome do produto
 */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
 /**
 * Método de acesso ao atributo valor
 * @return valor do Produto
 */
    public String getValor() {
        return valor;
    }
/**
 * Método modificador do registro acadêmico
 * @param valor é o preço do produto
 */
    public void setValor(String valor) {
        this.valor = valor;
    }
/**
 * Método que retorna valor de todos atributos
 * @return string com o valor de todos atributos
 */
    @Override
    public String toString() {
        return "Nome do produto: =" + nomeProduto + ", preço do produto=" + valor + '\n';
    }
}