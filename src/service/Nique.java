/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


public class Nique implements ServiceNique
{

    @Override
    public Integer getValor() 
    {
        return 5 + (int)( 6 * Math.random() ) ;
    }
    
    
    
}
