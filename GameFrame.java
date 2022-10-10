package snakeGame;

import javax.swing.JFrame;

// gameframe class sets up game window
// adds the game panel class where main game play operation takes place
public class GameFrame extends JFrame {

	GameFrame(){
		 
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	
}
