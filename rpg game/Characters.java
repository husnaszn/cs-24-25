import java.awt.Graphics;
// import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Characters {

    private int x,y,w,h, speed, maxHealth, health, dmg, stam, dx, dy;
    // private int key1;
    private ImageIcon pic, uset, uwalkl, uwalkr, uidle;
    private Tools tools;
    private ArrayList <Tools> toolList;
    
    public Characters(){
        y=0;
        x=0;
        w=0;
        h=0;
        speed=0;
        health=0;
        maxHealth=0;
        stam=0;
        dmg=0;
        dx=0;
        dy=0;
        pic= new ImageIcon();
        uset = new ImageIcon();
        uwalkl = new ImageIcon();
        uwalkr = new ImageIcon();
        uidle = new ImageIcon();

    }

    public Characters(int x1, int y1, int dx1, int dy1, int width, int height, int sp, int mhea, int hea, int dam, int st, ImageIcon p, ImageIcon u, ImageIcon uwl, ImageIcon uwr){
        x=x1;
        y=y1;
        w=width;
        h=height;
        maxHealth = mhea;
        health=hea;       
        speed = sp;
        dmg = dam;
        stam=st;
        pic=p;
        uset = u;
        uwalkl = uwl;
        uwalkr = uwr;
        dx=dx1;
        dy=dy1;

    }
    
    public Characters(int x1, int y1, int dx1, int dy1, int width, int height, int sp, int mhea, int hea, int dam, int st, ImageIcon p, ImageIcon u, ImageIcon ui, ImageIcon uwl, ImageIcon uwr, Tools tool){
        x=x1;
        y=y1;
        w=width;
        h=height;
        maxHealth = mhea;
        health=hea;       
        speed = sp;
        dmg = dam;
        stam=st;
        pic=p;
        uset = u;
        uwalkl = uwl;
        uwalkr = uwr;
        uidle = ui;
        dx=dx1;
        dy=dy1;
        tools = tool;
    }


    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public ImageIcon getUidle() {
        return uidle;
    }

    public void setUidle(ImageIcon uidle) {
        this.uidle = uidle;
    }

    public Tools getTools(){
        return tools;
    }

    public ImageIcon getUwalkl() {
        return uwalkl;
    }

    public void setUwalkl(ImageIcon uwalkl) {
        this.uwalkl = uwalkl;
    }

    public ImageIcon getUwalkr() {
        return uwalkr;
    }

    public void setUwalkr(ImageIcon uwalkr) {
        this.uwalkr = uwalkr;
    }

    public void setTools(ArrayList <Tools> list){
        toolList = list;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getStam() {
        return stam;
    }

    public void setStam(int stam) {
        this.stam = stam;
    }

    public ImageIcon getUset() {
        return uset;
    }

    public void setUset(ImageIcon uset) {
        this.uset = uset;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    public ArrayList<Tools> getToolList() {
        return toolList;
    }

    public void setToolList(ArrayList<Tools> toolList) {
        this.toolList = toolList;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }

    public String toString(){
        return "HAVEN'T SET TOSTRING YET";
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public void drawChar(Graphics g2d){
        // System.out.println("null");
        g2d.drawImage(pic.getImage(), x, y, w, h, null);
        
    }

    public void moving(){
        if((getX()+getW())>=Toolkit.getDefaultToolkit().getScreenSize().width){
            setX(Toolkit.getDefaultToolkit().getScreenSize().width-(getW())); 
               }else if(getX()<=0){
        setX(0);
    }

    }
    // check for mouse collision 
}