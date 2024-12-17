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

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public int getHeals() {
        return heals;
    }

    public void setHeals(int heals) {
        this.heals = heals;
    }
}
