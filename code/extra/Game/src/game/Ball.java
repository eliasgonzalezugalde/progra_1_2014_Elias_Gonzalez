/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {
	private static final int DIAMETER = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Game game;

	public Ball(Game game) {
		this.game= game;
	}

	void move() {
		if (x + xa < 0)
			xa = game.speed;;
		if (x + xa > game.getWidth() - DIAMETER)
			xa = -game.speed;;
		if (y + ya < 0)
			ya = game.speed;;
		if (y + ya > game.getHeight() - DIAMETER)
			game.gameOver();
		if (collision()){
			ya = -game.speed;;
			y = game.racquet.getTopY() - DIAMETER;
                        Sound.BALL.play();
                        game.speed++;
                        game.score++;
                        
		}
		x = x + xa;
		y = y + ya;
	}

	private boolean collision() {
		return game.racquet.getBounds().intersects(getBounds());
	}

	public void paint(Graphics2D g) {
		g.fillOval(x, y, DIAMETER, DIAMETER);
                g.setColor( new Color(0x85, 0x42, 0x6F) );
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}
        
        public void changeColor(Graphics2D g){

            int R = (int) (Math.random( )*256);
            int G = (int)(Math.random( )*256);
            int B= (int)(Math.random( )*256);
            Color randomColor = new Color(R, G, B);
            g.drawLine(10, 10, 56, 56);
            g.setColor(randomColor);
            g.fillOval(10, 50, 30, 60);
            
        }
        
}
