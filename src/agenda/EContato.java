/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Calendar;
  
public class EContato extends Contato {
    protected String email,homepage;
    
    public EContato(String nome, Calendar dtnasc, String email, String hp) {
        super (nome, dtnasc);
        this.email=email;
        homepage=hp;
    }
    @Override
    public String getDados() {
      return super.getDados() + "email: "+email + "\nhomepage:" + homepage + "\nIdade: ";
    }
    public String getEmail() {
      return email;
    }
    public String getHomepage() {
       return homepage;
    }
}