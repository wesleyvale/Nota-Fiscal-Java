
package projeto.nota.fiscal;
/*
 * @version 8/10/2020
 * @author wesley lima dias ddo vale
 */
public class ListadeProdutos {
    private Produto dados[ ];
    private int tamanho;
    /**
     * Construtor
     * @param capMax capacidade máxima da lista 
     */
    public ListadeProdutos (int capMax){
        dados = new Produto[capMax];
    }
   /**
    * Método que adiciona novo produto no início da lista
    * @param e é o novo produto
    */ 
   public void adicionaInicio(Produto e){
       if (dados.length != tamanho) {
           for (int i = tamanho; i>=1; i--){
               dados[i] = dados[i-1];
           }
           dados[0]=e;
           tamanho++;
       }else{
           System.out.println(" Lista Cheia");
       }
   }
    /**
     * Método que remove o produto do início da lista
     * @return produto removido
     */
    public Produto removeInicio(){
       Produto r = null; 
       if (tamanho !=0) {
           r = dados[0];
           for (int i = tamanho; i>=1; i--){
               dados[i] = dados[i+1];
           }
           tamanho--;
       }else{
           System.out.println("ERRO! Lista Cheia");
       }
       return r;
   }
    /**
     * Método que adiciona novo produto no final da lista
     * @param e é o novo produto
     */
   public void adicionaFinal (Produto e){
        if (dados.length != tamanho) {
            // não está cheia
            dados[tamanho] = e;
            tamanho = tamanho + 1;
        } else {
            //sim está cheia
            System.out.println("ERRO! Lista Cheia");
        }
    }
    /**
     * Método que remove o produto do final da lista
     * @return     
     */
   public Produto removeFinal (){
        Produto r = null;
        if (tamanho != 0) {
            // não está vazia
            r = dados[tamanho-1] ;
            tamanho = tamanho - 1;
        } else {
            //sim está vazia
            System.out.println("ERRO! Lista Vazia");
        }
        return r;
    }
    /**
     * Método que retorna o valor dos atributos da classe
     * @return String com o valor dos atributos
     */    
    @Override
    public String toString(){
        String r = "";
        for (int i=0;i<tamanho;i++){
            r = r + dados[i].toString() + " ";
        }
        r = r + "\nTotal de elementos: "+tamanho;
        return r;
    }
}

