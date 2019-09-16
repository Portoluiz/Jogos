package br.com.fiap.jogos.spider;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Spider extends JFrame {
	
	ImageIcon iconParede = new ImageIcon (getClass().getResource("parede.png"));
	ImageIcon iconSpiderMexendo = new ImageIcon (getClass().getResource("spiderAn.gif"));
	ImageIcon iconSpiderPaarado = new ImageIcon (getClass().getResource("spiderPa.png"));
	
	JLabel lParede = new JLabel(iconParede);
	JLabel lSpider = new JLabel(iconSpiderPaarado);
	
	int posSpiderX = (int)(Math.random()*600);
	int posSpiderY = (int)(Math.random()*500);
	
	public Spider() {
		editarJanela();
		editarComponentes ();
		addMovimento();
	}
	
	public void addMovimento() {
		
		addKeyListener(new KeyListener() {

			
			public void keyPressed(KeyEvent e) { //Tecla precionada
				lSpider.setIcon(iconSpiderMexendo);
				//System.out.println(e.getKeyCode()); // Utilisar o metodo "e.getKeyCode" para saber a numeração das teclas do teclado
				if(e.getKeyCode() == 38) {
					posSpiderY -= 5;
				}
				if(e.getKeyCode() == 40) {
					posSpiderY += 5;
				}
				if(e.getKeyCode() == 37) {
					posSpiderX -= 5;
				}
				if(e.getKeyCode() == 39) {
					posSpiderX += 5;
				}
				lSpider.setBounds(posSpiderX, posSpiderY, 103, 202);
				
			}

			
			public void keyReleased(KeyEvent e) { //tecla parada
				lSpider.setIcon(iconSpiderPaarado);
				
			}

			
			public void keyTyped(KeyEvent e) {
			
				
			}
			
		});
			

		
	}
	
	public void editarComponentes () {
		lParede.setBounds(0, 0, 800, 624);
		lSpider.setBounds(posSpiderX, posSpiderY,103, 202);
	}
	
	
	
	public void editarJanela() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 624);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		add(lSpider);
		add(lParede);
		
	}

	public static void main(String[] args) {
		
		new Spider();
			}

}