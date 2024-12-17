import javax.swing.ImageIcon;

public class Food extends Tools{
   
    private int uses, heals;

    public Food(){
        super();
        uses = 0;
        heals = 0;
    }

    public Food(int x, int y, int us, int heal, ImageIcon pic){
        super(x, y, pic);
        uses = us;
        heals =heal;

    }
}
