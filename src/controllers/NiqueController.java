/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import exception.ExceptionLimite;
import java.util.LinkedList;
import java.util.List;
import models.Ganhador;


public class NiqueController implements controller.interfaces.NiqueControl{

    private service.ServiceNique serviceNique = null ;

    public NiqueController() 
    {
        super();
        serviceNique = factory.Factory.getServiceNique();        
    }
    
    @Override
    public Integer getValor() 
    {
        return serviceNique.getValor();
    }

    @Override
    public List<Ganhador> getGanhadores(Integer limite) throws ExceptionLimite 
    {
     
        List<Ganhador> ganhadores = new LinkedList<Ganhador>() ;
        
        if( limite == null ){
            throw new ExceptionLimite();
        }else{
            
            for (int i = 0; i < limite; i++) 
            {             
                Ganhador g = new Ganhador();
                g.setId(i);
                g.setValor(this.getValor());
                ganhadores.add(g);
                
            }            
            
        }
        
        return ganhadores ;
        
    }

   

    
    
}
