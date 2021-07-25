import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class GameFrame extends JFrame{
	
	GamePanel gamePanel;
	
	GameFrame(){
		 gamePanel = new GamePanel();
		 this.add(gamePanel);
		 this.setTitle("Pong Game");
		 this.setResizable(false);
		 this.setBackground(Color.black);
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 this.pack();
		 this.setVisible(true);
		 this.setLocationRelativeTo(null);
	 }
}
