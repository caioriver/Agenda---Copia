/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author caio_
 */
public class ContatoComercial extends ContatoBasico
{
  protected String atividade;
  protected String funcionario;
  
  public ContatoComercial(String nome, String atividade, String funcionario)
  {   super(nome);
       this.atividade=atividade;
       this.funcionario=funcionario;
  }
  @Override
   public String getDados()
   {  String s=super.getDados();
       s+=atividade+"\n"+" contato Sr(a): "+funcionario;
       return s;
    }
}
