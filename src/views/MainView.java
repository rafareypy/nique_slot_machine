package views;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controllers.MainController;



import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;


public class MainView implements ActionListener {
	
	private JFrame frame ;
	private Container container ;
	private ArrayList<Object> elements = new ArrayList<>();
	private JButton  btn ;
	private JScrollPane scrollPane ;
	private JLabel l1;
	
	public MainView(){
		
		
		btn = new JButton("Button");
		
		frame = new JFrame("Caça Niquel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		
		ImageIcon image = new ImageIcon("images/chris.png");
		
		l1 = new JLabel(image);
		l1.setPreferredSize(null);
		
		panel1.add(l1);
		//panel1.add(new JLabel(image));
		//panel1.add(new JLabel(image));
		
		scrollPane = new JScrollPane(panel1);
		scrollPane.setPreferredSize(new Dimension(800, 800));
		
		
		
		frame.getContentPane().add(scrollPane);
		
		
		frame.setLocationRelativeTo(null);
		
//		JSlider slider = new JSlider(JSlider.VERTICAL);
//		slider.setMinimum(1);
//		slider.setMaximum(12);
//		slider.setMinorTickSpacing(1);
//		slider.setMajorTickSpacing(3);
//		slider.setPaintTicks(false);
//		slider.setPaintLabels(true);
//		panel1.add(slider);
		
		btn.addActionListener(this);
		panel1.add(btn);
		
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn){
			 
			Random gerador1 = new Random();
			Random gerador2 = new Random();
			Random gerador3 = new Random();
			
			
			ImageIcon img1 = new ImageIcon("images/image1.jpg");
			ImageIcon img2 = new ImageIcon("images/image2.jpg");
			ImageIcon img3 = new ImageIcon("images/image3.jpg");
			ImageIcon img4 = new ImageIcon("images/image4.jpg");
			
			ImageIcon[] images = new ImageIcon[4];
			images[0] = img1 ;
			images[1] = img2 ;
			images[2] = img3 ;
			images[3] = img4 ;
			
			Time t = new Time(gerador1.nextLong());
			System.out.println(t.getTime() % 100);
			
			for(ImageIcon image: images){				
				l1.setIcon(image);
			}
			
			 
		}
		
		
	}
	
	
	
	
	
}
