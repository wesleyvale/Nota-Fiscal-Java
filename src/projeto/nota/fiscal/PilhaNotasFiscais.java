
package projeto.nota.fiscal;

/*
 * @version 8/10/2020
 * @author wesley lima dias ddo vale
 */
public class PilhaNotasFiscais {
    private NotaFiscal dados[];
    private int topo;
    /**
     * Construtor
     * @param capMax capacidade máxima da pilha 
     */
    public PilhaNotasFiscais(int capMax){
        dados = new NotaFiscal[capMax];
        topo = -1;
    }
    /**
     * Método que adiciona nova nota fiscal no topo da pilha
     * @param e é a nova nota
     */
    public void empilha(NotaFiscal e){
        if (topo+1 == dados.length){
            System.out.println("ERRO! Pilha Cheia");
        } else {
            dados[++topo]=e;
            
        }
    }
    /**
     * Método que desempilha uma nota
     * @return NotaFiscal removido da pilha
     */
    public NotaFiscal desempilha(){
        NotaFiscal r = null;
        if(topo == -1){
            System.out.println("ERRO! Pilha Vazia");
        }else {
            r = dados[topo--];
        }
        return r;
    }
    /**
     * Método que retorna todos os elementos da Pilha
     * @return String com todos os elementos da Pilha
     */
    public String toString(){
        String s="";
        for (int i=topo;i>=0;i--)
            s = s + " " + dados[i].toString();
        return s;
    }
}
