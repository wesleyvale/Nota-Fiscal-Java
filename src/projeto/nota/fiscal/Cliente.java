
package projeto.nota.fiscal;

/*
 * @version 8/10/2020
 * @author wesley lima dias ddo vale
 */
public class Cliente {
    private String nome;
    private String cpf;
    
/**
 * Construtor
 * @param nome é o nome do cliente
 * @param cpf é a identificação do cliente
 
 */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }
/**
 * Método de acesso ao atributo nome
 * @return nome do Cliente
 */
    public String getNome() {
        return nome;
    }
/**
 * Método modificador do atributo nome
 * @param nome é o novo nome do Cliente
 */
    public void setNome(String nome) {
        this.nome = nome;
    }

 /*
 * Método de acesso ao atributo cpf
 * @return cpf do Cliente
 */
    public String getCpf() {
        return cpf;
    }
/**

 * @param cpf é a identificação do Cliente
 */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    /**
     * @return 
     */
     @Override
    public String toString() {
        return "Nome=" + nome + ", CPF=" + cpf + '\n';
    }
}