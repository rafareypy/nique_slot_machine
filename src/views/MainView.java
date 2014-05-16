package views;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;


import java.util.ArrayList;


public class MainView {
	
	private JFrame frame ;
	private Container container ;
	private ArrayList<Object> elements = new ArrayList<>();
	
	public MainView(){
		frame = new JFrame("Primeira Janela");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		
		ImageIcon image = new ImageIcon("chris.png");
		JLabel l1 = new JLabel(image);
		l1.setPreferredSize(null);
		panel1.add(l1);
		panel1.add(new JLabel(image));
		panel1.add(new JLabel(image));
		
		JScrollPane scrollPane = new JScrollPane(panel1);
		scrollPane.setPreferredSize(new Dimension(500, 500));

		
		frame.getContentPane().add(scrollPane);
		
		
		frame.setLocationRelativeTo(null);
		// aasas
		JSlider slider = new JSlider(JSlider.VERTICAL);
		slider.setMinimum(1);
		slider.setMaximum(12);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(3);
		slider.setPaintTicks(false);
		slider.setPaintLabels(true);
		panel1.add(slider);
				
		
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	
}
