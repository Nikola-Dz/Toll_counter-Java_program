
package prevoz;


public class Automobil_Prikolica extends Automobil implements Prikolica {

    private int nosivost;

    public Automobil_Prikolica() {
    }

    public Automobil_Prikolica(int nosivost, String marka, int putarina, int br_putnika) {
        super(marka, putarina, br_putnika);
        this.nosivost = nosivost;
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }
    
        
    public int prikolica(){
    
    return nosivost;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nNosivost prikolice= " + prikolica() + " kg";
        
    }
    
    }