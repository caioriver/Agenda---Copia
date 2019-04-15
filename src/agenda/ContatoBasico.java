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
import java.util.ArrayList;
  
abstract public class ContatoBasico {   
    
    protected String nome;
    ArrayList<Telefone>telefones;

    public ContatoBasico() {
        nome="";
        telefones=new ArrayList();
    }
    
    public ContatoBasico(String nome) { 
        this.nome = nome;
        telefones=new ArrayList();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) { this.nome = nome;}
    
    public void setTelefone (Telefone tf) {
        telefones.add(tf);
    }
    
    public String getDados() {
        String s=nome+"\n";
        for(Telefone t:telefones) {
            s+=t.getTelefone()+"\n";
        }
        return s;
    }
}