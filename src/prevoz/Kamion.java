package prevoz;


public class Kamion extends Vozilo {
    private int nosivost;

    public Kamion() {
    }

    public Kamion(int nosivost) {
        this.nosivost = nosivost;
    }

    public Kamion(int nosivost, String marka, int putarina, int br_putnika) {
        super(marka, putarina, br_putnika);
        this.nosivost = nosivost;
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNosivost= " + nosivost + " kg";
    }

    
    

    
    

    
    
    
    
}
