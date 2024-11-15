import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Characters {

    private int x,y,w,h, speed, health, dmg, stam, dx, dy;
    private int key1;
    private ImageIcon pic, uset, uwalk;
    private Tools tools;
    private ArrayList <Tools> toolList;

    public Characters(){
        y=0;
        x=0;
        w=0;
        h=0;
        speed=0;
        health=0;
        stam=0;
        dmg=0;
        dx=0;
        dy=0;
        pic= new ImageIcon();
        uset = new ImageIcon();
        uwalk = new ImageIcon();

    }

    public Characters(int x1, int y1, int dx1, int dy1, int width, int height, int sp, int hea, int dam, int st, ImageIcon p, ImageIcon u, ImageIcon uw){
        x=x1;
        y=y1;
        w=width;
        health=hea;       
        h=height;
        speed = sp;
        dmg = dam;
        stam=st;
        pic=p;
        uset = u;
        uwalk = u;
        dx=dx1;
        dy=dy1;

    }
    
    public Characters(int x1, int y1, int dx1, int dy1, int width, int height, int sp, int hea, int dam, int st, ImageIcon p, ImageIcon u, ImageIcon uw, Tools tool){
        x=x1;
        y=y1;
        w=width;
        health=hea;       
        h=height;
        speed = sp;
        dmg = dam;
        stam=st;
        pic=p;
        uset = u;
        uwalk = u;
        dx=dx1;
        dy=dy1;
        tools = tool;
    }

    public ImageIcon getUwalk() {
        return uwalk;
    }

    public void setUwalk(ImageIcon uwalk) {
        this.uwalk = uwalk;
    }

    public Tools getTools(){
        return tools;
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
        // key1=key;
        // System.out.println(key1);
        // System.out.println(getDx());
        System.out.println(getX()+getW());
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().width);
        if((getX()+getW())>=Toolkit.getDefaultToolkit().getScreenSize().width){
            setX(Toolkit.getDefaultToolkit().getScreenSize().width-(getW()));        }
            System.out.println("crossing");
        // if (key1==65){
        //     setDx(-1);
        //     // System.out.println("setting dx");
        // } else if (key1 == 68){
        //     setDx(1);
        //     // System.out.println("setting dx");
        // }else{
        //     setDx(0);
        
       
       
    }
    // check for mouse collision 
}