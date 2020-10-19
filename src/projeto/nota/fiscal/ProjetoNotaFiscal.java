/*
 * Classe main
 * @version 8/10/2020
 * @author wesley lima dias ddo vale
 */
package projeto.nota.fiscal;
import javax.swing.*;
public class ProjetoNotaFiscal
{
    public static void main(String[] args) {
        ListadeProdutos l1 = null;
        PilhaNotasFiscais p1 = new PilhaNotasFiscais(5);
        
		 String menu = "Menu de Opções\n1 - Emitir nota\n"+
                 "2 - adicionar produto\n3 - Remover produto inicio\n"+
		 "4 - Remover produto final\n" +
		 "5 - Consultar lista\n"+
                 "6 - Consultar pilha\n7 - Desempilhar\n" +
		 "99 - Sair";
        int op=0;
        String mensagem,nome,naturezaoperaN,nomeProduto,cpf,valor,numero = "";
        int dataemissaoN;
        Produto PProduto;
        NotaFiscal NFiscal;
        
	while (op != 99){
	    op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                        case 1:
                            
                            numero = JOptionPane.showInputDialog("Numero da nota");
                            dataemissaoN = Integer.parseInt(JOptionPane.showInputDialog("Informe a data de emissão: "));
                            naturezaoperaN =JOptionPane.showInputDialog("natureza de operação ?");
                            nome =JOptionPane.showInputDialog("Nome ?");
                            cpf =JOptionPane.showInputDialog("CPF ?");
                                                                                                              
                            l1 = new ListadeProdutos(10);
                            p1.empilha(new NotaFiscal(numero,new Cliente(nome,cpf) ,dataemissaoN,naturezaoperaN));
                            break;
                        case 2:
                            nomeProduto =JOptionPane.showInputDialog("Qual produto ?");
                            valor = JOptionPane.showInputDialog("Qual valor ?");
                            l1.adicionaInicio(new Produto(nomeProduto, valor));
                            break;
                        case 3:
                            PProduto = l1.removeInicio();
                                if (PProduto != null) {
                                    System.out.println("O Produto: " + PProduto.toString() + " Foi removido!");
                                }
                            break;
                            
                       
                        case 4:
                            PProduto = l1.removeFinal();                          
                            JOptionPane.showMessageDialog(null, "produto removido: "+ 
                                    PProduto);
                         
                            break;
                        
                        case 5:
                            
                            mensagem = l1.toString();
                                if (mensagem.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Lista vazia!");
                                } else {
                                    JOptionPane.showMessageDialog(null, mensagem);
                           
                    }
        
                    op = 0;
                            break;
                        case 6:
                              mensagem = p1.toString();
                              if (mensagem.isEmpty()) {
                                  JOptionPane.showMessageDialog(null, "Pilha vazia!");
                              } else {
                                  JOptionPane.showMessageDialog(null, mensagem);
                    }
                            break;
                        case 7:
                              NFiscal = p1.desempilha();
                              if (NFiscal != null) {
                                  System.out.println("A nota Fiscal: \n" + NFiscal.toString() + " Foi removida!");
                    }
                            break;
                
            }
        }
}
}