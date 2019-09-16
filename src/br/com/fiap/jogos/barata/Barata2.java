package br.com.fiap.jogos.barata;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Barata2 extends JFrame{
	
	boolean mousePressionado = false;
	
	ImageIcon iconBarataViva = new ImageIcon(getClass().getResource("BarataViva.gif"));
	ImageIcon iconBarataMorta = new ImageIcon(getClass().getResource("BarataMorta.png"));
	
	JLabel l = new JLabel (iconBarataViva);

	
	public Barata2() {
		editarJanela();
		
		int x = (int) (Math.random()*600);
		int y = (int) (Math.random()*500);
		
		l.setBounds(x, y, 254, 142);
		
		new Mover().start();
		
		l.addMouseListener(new MouseListener() {

			
			public void mouseClicked(MouseEvent e) {
				
				l.setIcon(iconBarataMorta);
				
			}

			
			public void mouseEntered(MouseEvent e) {
			
				
			}

			
			public void mouseExited(MouseEvent e) {
				
				
			}

			
			public void mousePressed(MouseEvent e) {
				
				mousePressionado = true;
				
			}

			
			public void mouseReleased(MouseEvent e) {
				
				mousePressionado = false;
				
			}
			
		});
	}
	
	public class Mover extends Thread{
		public void run () {
			while(true) {
				try {sleep(10);}catch(Exception erro){}
				if(mousePressionado) {
					Point ponto = getMousePosition();
					l.setBounds(ponto.x-122, ponto.y-73, 254, 146);
				}
			}
			
		}
	}
	

	public void editarJanela() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 700);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		add(l);
	}

	public static void main(String[] args) {
		new Barata2();

	}

}
