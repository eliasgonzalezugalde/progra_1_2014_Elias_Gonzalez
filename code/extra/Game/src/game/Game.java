/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {

	Ball ball = new Ball(this);
	Racquet racquet = new Racquet(this);
        int speed=1;
        int score=0;
        
        private int getScore() {
            return score;
        }

	public Game() { //clase abstracta que implementa la interfaz listener
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) { //le informamos a racket que alguien ha apretado una tecla
				racquet.keyReleased(e); //Este se activa cuando alguien presiona una tecla
			}

			@Override
			public void keyPressed(KeyEvent e) {
				racquet.keyPressed(e);
			}
		});
		setFocusable(true); //este game(que es un JPanel) se convierte en focusable para que pueda capturar eventos
                Sound.BACK.loop();
	}
	
	private void move() {
		ball.move(); //le decimos a la bola que se mueva
		racquet.move(); //le decimos a la raqueta que se mueva
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g); //limpiar el fondo (comentar para ver efecto)
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, //suavisar bola
				RenderingHints.VALUE_ANTIALIAS_ON); //suavisar bola
                
                g.setColor( new Color(0x18, 0x74, 0xCD) );
                if (score>5) {
                    int R = (int) (Math.random( )*256);
                    int G = (int)(Math.random( )*256);
                    int B= (int)(Math.random( )*256);
                    Color randomColor = new Color(R, G, B);
                    g.setColor(randomColor);
                }
        
                ball.paint(g2d);
		racquet.paint(g2d);

                g2d.setColor(Color.GRAY);
		g2d.setFont(new Font("Verdana", Font.BOLD, 30));
		g2d.drawString(String.valueOf(getScore()), 10, 30);
	}
        
        public void gameOver() {
            Sound.BACK.stop();
            Sound.GAMEOVER.play();
            JOptionPane.showMessageDialog(this, "Your score is: " + getScore(),
				"Game Over", JOptionPane.YES_NO_OPTION);
            System.exit(ABORT);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis"); //titulo de la ventana
		Game game = new Game();
		frame.add(game);
		frame.setSize(300, 400); //tamaño de la ventana
		frame.setVisible(true); //si esto no esta true, no aparece la ventana
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para que aparezca la X de la ventana

		while (true) {
			game.move(); //metodo que mueve la bola
			game.repaint(); //metodo que repinta la bola
			Thread.sleep(10);
		}
	}
}