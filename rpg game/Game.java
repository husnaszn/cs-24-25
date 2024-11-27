
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.*;
import java.util.Queue;
import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat; 

public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {

	private BufferedImage back;
	private int key, x, y, sk;
	private ArrayList<Playabl> charList;
	private ArrayList<Buttons> butList;
	private ArrayList<Text> ssText;
	private ArrayList<Food> foodTool;
	private String screen;
	private Playabl player;
	private Enemy enemy;
	private Queue<Enemy> enemies;
	private File saveFile;
	private String words;
	private Backgrounds bg;
	// private Tools too;
	// private Buttons testButton, test2, test3;
	
	public Game() {
		new Thread(this).start();
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		// 1470
		// 956
		// butList = setButList();						
		// too= null;
		key = -1;
		sk = 1;
		x = 0;
		y = 0;
		screen = "start";
		player = new Tob(100, 100);
		enemies = setEs();
		foodTool = new ArrayList<Food>();
		ssText= setssText();
		charList = setCharList();
		saveFile = new File("saved_file2.0.txt");
		words = "";
		bg = new Backgrounds("bg", -400, -350, 0, 0, 2840, 1920, new ImageIcon("testbg.png"));
	}

	public void createFile(){
		try {
			if(saveFile.createNewFile()){
				System.out.println("successfully created file");
			}else{
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readFile(){
		Scanner sc;
		// check out hasnextint
		try {
			sc = new Scanner(saveFile);
			while(sc.hasNext()){
			words = words + " " +sc.next();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void writeToFile(){
		FileWriter myWriter;
		try {
			myWriter = new FileWriter(saveFile);
		if(enemies.isEmpty()){
			myWriter.write("in your last run, you won");
		}else{
			myWriter.write("in your pervious run, you had  " +enemies.size() + " enemies left!");
		}
		myWriter.close();
		System.out.println("successfully wrote to file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public Queue<Enemy> setEs() {
		Queue<Enemy> temp = new LinkedList<>();
		temp.add(new Fish(400, 100));
		temp.add(new Fish(600, 100));
		temp.add(new Fish(800, 100));
		return temp;
	}

	public ArrayList<Playabl> setCharList() {
		ArrayList<Playabl> temp = new ArrayList<>();
		temp.add(new Tob(100, 100));
		temp.add(new Lada(300, 100));
		temp.add(new Simm(500, 100));
		// temp.add(new Fish(250,100));
		return temp;

	}

	public ArrayList<Text> setssText(){
		ArrayList<Text> temp = new ArrayList<>();
		temp.add(new Text("TOB", 1,165,420, 30, Color.BLACK));
		temp.add(new Text("LADA", 2,340,420, 30, Color.BLACK));
		temp.add(new Text("SIM", 3,565,420, 30, Color.BLACK));

		return temp;
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}

	public void paint(Graphics g) {

		Graphics2D twoDgraph = (Graphics2D) g;
		if (back == null)
			back = (BufferedImage) ((createImage(getWidth(), getHeight())));

		Graphics g2d = back.createGraphics();

		g2d.clearRect(0, 0, getSize().width, getSize().height);

		drawScreens(g2d);

		twoDgraph.drawImage(back, null, 0, 0);

	}

	public void drawStartScreen(Graphics g2d) {
		g2d.drawString(words, 800, 400);
		player.setDx(0);
		
		for (Playabl c : charList) {
			c.drawChar(g2d);
		}
		for (Text t: ssText){
			t.drawText(g2d);

			if ( sk == t.getTextNum()){
				t.setbColor(Color.pink);
				for (Playabl c: charList){
					if (c.getPlayerName()==t.getBname()){
						player = c;
						c.writeDesc(g2d);
					}
				}
			}else if (sk != t.getTextNum()){
				t.setbColor(Color.BLACK);
			}
			
			
		}
	}

	public void drawGameScreen(Graphics g2d) {
		bg.drawPart(g2d);
		bg.move(player);
		player.drawChar(g2d);
		player.moving(bg);
		
		if (!foodTool.isEmpty()) {
			// loop draw all weapons
		} else {

		}
		if (enemies.peek() != null) {
			enemies.peek().drawChar(g2d);
		}
	}

	private void drawScreens(Graphics g2d) {
		switch (screen) {
			case "start":
				drawStartScreen(g2d);
				break;
			case "selection":
				drawSelectScreen(g2d);
				break;
			case "gameplay":
				drawGameScreen(g2d);
				break;
			case "gameover":
				drawGameOverScreen(g2d);
				break;
		}
	}

	public void drawGameOverScreen(Graphics g2d) {
		g2d.drawString("game over", 200, 200);
	}

	public void drawSelectScreen(Graphics g2d) {
		player.drawChar(g2d);
		// too.drawTool(g2d);
		g2d.drawString("you picked " + player.toString(), 200, 500);
	}

	// DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void attack() {

		if (player.getTools() instanceof Food) {
			foodTool.add(new Food(player.getX(), player.getY(), player.getTools().getDam(), player.getTools().getDps(),
					player.getTools().getDurability(), player.getTools().getPic()));
		}
		System.out.println("foodTool is: " + this.foodTool);

	}

	// DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		key = e.getKeyCode();
		System.out.println(key);
		
		if (key == 32) {
			
			screen = "gameplay";
			// too= foodTool.get(0);
			player.setX((Toolkit.getDefaultToolkit().getScreenSize().width/2)-(player.getW()/2));
			player.setY((Toolkit.getDefaultToolkit().getScreenSize().height/2)-(player.getH()/2));
			attack();

		}

		if (screen == "start"){
			if(key==65){
				sk--;
			}else if (key==68){
				sk++;
			}

			if (sk <=1){
				sk=1;
			}else if(sk>=3){
				sk=3;
			}
		}

		if (screen == "gameplay") {
			if (key == 65) {
				// moving left
				player.setDx(-1);
				bg.setDx(1);
				player.setPic(player.getUwalkl());
				player.setW(160);

			} else if (key == 68) {
				// moving right
				player.setDx(1);
				bg.setDx(-1);
				player.setPic(player.getUwalkr());
				player.setW(160);
			} else if (key == 69) {
				player.setPic(new ImageIcon("tobeattuna.gif"));

				enemy = enemies.peek();

				if (enemy != null) {
					if (player.getX() >= enemy.getX()
							&& player.getX() <= (enemy.getX() + enemy.getW())) {
						System.out.println("touching");
						enemies.remove();
					}
				}

			} else if (key == 76) {
				enemy = enemies.peek();

				enemy.setPic(new ImageIcon("fishattack.gif"));
				if (player.getX() >= enemy.getX()
						&& player.getX() <= (enemy.getX() + enemy.getW())) {
					screen = "gameover";
				}
			}

		}

	}

	// DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		if (key== 65 || key ==68){
			if (screen == "gameplay"){
				player.setDx(0);
				bg.setDx(0);
				player.setPic(player.getUidle());
				player.setW(190);
			}
				
		}
		if (key == 69) {
			player.setPic(player.getUidle());
		}
		if (key == 76) {
			enemy = enemies.peek();
			enemy.setPic(new ImageIcon("fishidle.gif"));
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x = arg0.getX();
		y = arg0.getY();
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

		System.out.println("y coord: " + arg0.getY());
		System.out.println("x coord: " + arg0.getX());

		x = arg0.getX();
		y = arg0.getY();
		// enemies.remove();

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
