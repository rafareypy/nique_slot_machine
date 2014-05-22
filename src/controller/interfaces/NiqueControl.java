/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import exception.ExceptionLimite;
import java.util.List;
import models.Ganhador;


public interface NiqueControl 
{
    public Integer getValor();

    public List<Ganhador> getGanhadores( Integer limite ) throws ExceptionLimite;
}
