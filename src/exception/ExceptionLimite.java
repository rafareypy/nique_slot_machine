/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;


public class ExceptionLimite  extends Exception
{
 
private static final long serialVersionUID = 2936768031552325716L;

    private static final String msjpadrao = "Por Favor passe um limite valido";
    
	public ExceptionLimite() {
		super();
		msjConsole("");
	}

	public ExceptionLimite(String arg0, Throwable arg1) {
		super(""+ msjpadrao + "\n" +arg0, arg1);
		
	}

	public ExceptionLimite(String arg0) {
		super(""+ msjpadrao + "\n" +arg0);
		
	}

	public ExceptionLimite(Throwable arg0) {
		super(""+ msjpadrao + "\n",arg0);
		
	}

    private void msjConsole(String msj) 
    {
        System.out.println("  \n "+ msj);
    }    
        
    
}
