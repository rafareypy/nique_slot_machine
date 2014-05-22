
package views;

import controller.interfaces.NiqueControl;
import exception.ExceptionLimite;
import factory.Factory;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import models.Ganhador;


public class View  extends JFrame implements ActionListener {
                
	
        private Factory factory = new Factory();
        private List<Ganhador> ganhadores = null ;       
        private NiqueControl niqueControl ;
	private JButton  btn = null ;
        private ImageIcon image = null ;
	private JScrollPane scrollPane = null;
	private JLabel l1 = null ;
        private JPanel panel1 = null;
        
        
        public View(){
		
                view();
		
//		JSlider slider = new JSlider(JSlider.VERTICAL);
//		slider.setMinimum(1);
//		slider.setMaximum(12);
//		slider.setMinorTickSpacing(1);
//		slider.setMajorTickSpacing(3);
//		slider.setPaintTicks(false);
//		slider.setPaintLabels(true);
//		panel1.add(slider);
		
	}        
        
        

        private void view()
        {            
            
            construtores();
            
            setTitle("Caça Niquel");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        
            l1.setPreferredSize(null);
            l1.setIcon(image);
            
            
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));            
            panel1.add(l1);
            
            
            scrollPane.setPreferredSize(new Dimension(800, 800));
            getContentPane().add(scrollPane);
            setLocationRelativeTo(null);
            
            
            btn.addActionListener(this);
            panel1.add(btn);
            
            this.pack();

        }
	
	


	@Override
	public void actionPerformed(ActionEvent e) 
        {
		
            if(e.getSource() == btn)
            {
                sou("Clicado botao para jogar");

                try 
                {
                    jogar(3);    
                }
                catch (ExceptionLimite erroLimite) 
                {
                    jop("Numero de limite resultados invalido, por favor insira um numero valido!\nCodigo Erro.. " + erroLimite);
                }
                

            }
		
		
	}
	
        
        private void jogar( Integer limite ) throws ExceptionLimite
        {
            
            ganhadores = niqueControl.getGanhadores(limite);
                                    
            girar(ganhadores);
            
            imprimirGanhadores(ganhadores);
            
        }
	
	
        private void girar(List<Ganhador> ganhadores)
        {
        
            for (int i = 0; i <= 302; i++) 
            {            
                trocarImagem(i, ganhadores);                                
            }                        
            
        }

    private void trocarImagem(Integer x, List<Ganhador> ganhadores ) 
    {
        
        if( x <= 100)
        {        
            //Espera um tempo
            trocaImg1( niqueControl.getValor() );
            //Espera um tempo
            trocaImg2( niqueControl.getValor());
            //Espera um tempo
            trocaImg3( niqueControl.getValor());
            
        }
        else if( x <= 200  )
        {
            trocaImg1(ganhadores.get(0).getValor());
            trocaImg2( niqueControl.getValor());
            trocaImg3( niqueControl.getValor());            
        }
        else if( x < 300)
        {
            trocaImg1(ganhadores.get(0).getValor());
            trocaImg2(ganhadores.get(1).getValor());
            trocaImg3( niqueControl.getValor());            
        }
        else if( x >= 300 )
        {
            trocaImg1(ganhadores.get(0).getValor());
            trocaImg2(ganhadores.get(1).getValor());            
            trocaImg3(ganhadores.get(2).getValor());
        }
        
        
    }

    

    private void trocaImg1(int valor) 
    {
        System.out.print(" | " + valor );
    }
        
        
    private void trocaImg2(int valor) 
    {
        System.out.print(" | " + valor );
    }

    
    private void trocaImg3(int valor) 
    {
        System.out.print(" | " + valor );
        System.out.println("\n-------------------------");
    }

    private void construtores() 
    {    
        niqueControl = factory.getNiqueControl();
        ganhadores  = new LinkedList();
        btn = factory.getButton("Button");
        panel1 =  factory.JPanel();
        image = factory.ImageIcon("images/chris.png");
        l1 = factory.JLabel();
        scrollPane = new JScrollPane(panel1);
        
        
    }

    private void sou(String msg) {
        System.out.println("\n" + msg);
    }

    private void jop(String msg) 
    {
        JOptionPane.showMessageDialog(null, "View\n" + msg );
    }

    private void imprimirGanhadores(List<Ganhador> ganhadores) 
    {
    
        for (Ganhador ganhador : ganhadores) 
        {
            sou("---------");
            sou("\n " + ganhador.getId() + " Valor = " + ganhador.getValor() );
            sou("---------");
        }        
        
    }


        
	
	
}
