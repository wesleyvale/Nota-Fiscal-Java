
package projeto.nota.fiscal;

/*
 * @version 8/10/2020
 * @author wesley lima dias ddo vale
 */
public class NotaFiscal {
    
    private String numero;
    private Cliente nome;
    private int dataemissaoN;
    private String naturezaoperaN;
/*
construtor
 */
    public NotaFiscal(String numero, Cliente nome, int dataemissaoN, String naturezaoperaN) {
        this.numero = numero;
        this.nome = nome;
        this.dataemissaoN = dataemissaoN;
        this.naturezaoperaN = naturezaoperaN;
    }
    

/**
 * Metodo acesso a ao numero NF
 * @return numero da NF
 */
    public String getNumero() {
        return numero;
    }
/**
 
 * @param numero é o numero da NF
 */
    public void setNumero(String numero) {
        this.numero = numero;
    }
/**
 * Metodo acesso a classe cliente e ao atributo nome
 * @return nome do cliente
 */
    public Cliente getNome() {
        return nome;
    }
/**
 
 * @param nome é a identificação do Cliente
 */
    public void setNome(Cliente nome) {
        this.nome = nome;
    }

/**
 * Metodo acesso ao atributo dataemissaoN
 * @return dataemissaoN da nota
 */
    public int getDataemissaoN() {
        return dataemissaoN;
    }

    /**
     * @param dataemissaoN the dataemissao to set
     */
    public void setDataemissaoN(int dataemissaoN) {
        this.dataemissaoN = dataemissaoN;
    }
      
    /**
     * @return the naturezaopera
     * Metodo acesso ao atributo naturezaoperaN
     */
    public String getNaturezaoperaN() {
        return naturezaoperaN;
    }

    /**
     * @param naturezaoperaN the naturezaopera to set
     */
    public void setNaturezaoperaN(String naturezaoperaN) {
        this.naturezaoperaN = naturezaoperaN;
    
}


 /**
 * Método que retorna valor de todos atributos
 * @return string com o valor de todos atributos
 */
    
     @Override
    public String toString() {
        return "Numero=" + numero + " Cliente=" + nome + " Data de Emissão=" + dataemissaoN +'\n';
}
}