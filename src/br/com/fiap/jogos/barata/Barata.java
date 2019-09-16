package br.com.fiap.jogos.barata;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Barata extends JFrame{
	
	ImageIcon iconBarataViva = new ImageIcon(getClass().getResource("BarataViva.gif"));
	ImageIcon iconBarataMorta = new ImageIcon(getClass().getResource("BarataMorta.png"));
	
	JLabel l = new JLabel (iconBarataViva);

	
	public Barata() {
		editarJanela();
		
		int x = (int) (Math.random()*600);
		int y = (int) (Math.random()*500);
		
		l.setBounds(x, y, 254, 142);
		
		l.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				l.setIcon(iconBarataMorta);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
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
		new Barata();

	}

}
