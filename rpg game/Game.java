
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.*;
import java.util.Queue;
import java.util.LinkedList;


public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key, x, y; 
	private ArrayList <Characters> charList;
	private ArrayList <Food> foodTool;
	private String screen;
	private Characters player;
	// private Tools too;
	private Queue <Enemy> enemies;



	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		key =-1; 
		x=0;
		y=0;
		charList=setCharList();
		for(Characters c: charList){
			// System.out.println(c);
		}
		screen="start";
		player=null;
		// too= null;
		foodTool=new ArrayList<Food>();
		enemies = setEs();
		System.out.println(enemies.size());
	}
	public Queue <Enemy> setEs(){
		Queue <Enemy> temp = new LinkedList<>();
		temp.add(new Fish(400,100));
		temp.add(new Fish(400,100));
		temp.add(new Fish(400,100));
		return temp;
	}
	
    public ArrayList <Characters> setCharList(){
        ArrayList <Characters> temp = new ArrayList<>();
		temp.add(new Tob(100,100));
		temp.add(new Mud(150,100));
		temp.add(new Lion(200,100));
		// temp.add(new Fish(250,100));
		return temp;
		
    }

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
	
		
		drawScreens(g2d);
	
		twoDgraph.drawImage(back, null, 0, 0);

	}

public void drawStartScreen(Graphics g2d){
	for(Characters c: charList){
		// System.out.println("lalalalalala");
		c.drawChar(g2d);
		// System.out.println(c.getPic());
		// g2d.drawImage(c.getPic().getImage(), c.getX(), c.getX(), getFocusCycleRootAncestor());
	}
}

public void drawGameScreen(Graphics g2d){
	player.drawChar(g2d);
	if (!foodTool.isEmpty()){
		//loop draw all weapons
	}
	else{

	}
	enemies.peek().drawChar(g2d);

}

	private void drawScreens(Graphics g2d){
		switch (screen) {
			case "start":
			drawStartScreen(g2d);
			break;
			case "selection":
			drawSelectScreen(g2d);
			break;
			case "gameplay":
			drawGameScreen(g2d);
		}
	}

	public void drawSelectScreen(Graphics g2d){
		player.drawChar(g2d);
		// too.drawTool(g2d);
		g2d.drawString("you picked "+player.toString(), 200, 500);
	}


	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

public void attack(){

	if(player.getTools() instanceof Food){
		foodTool.add(new Food(player.getX(),player.getY(),player.getTools().getDam(),player.getTools().getDps(),player.getTools().getDurability(), player.getTools().getPic()));
	}
	System.out.println("foodTool is: " + this.foodTool);

}


//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		if (key==32){
			screen="selection";
			player=charList.get(0);

		}
		else if (key==65){
			screen= "gameplay";
			// too= foodTool.get(0);
			attack();

		}
		
		
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// check to see if on start screen
		// for loop to check through all main chars
		// if mousecollision is true
		// player = loop.get(i);
		
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("entered");
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("exited");
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("you clicked at"+ arg0.getY());
		x=arg0.getX();
		y=arg0.getY();
		enemies.remove();
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
