
package prevoz;


public abstract class Vozilo {
    
    static private int identifikator=0;
    private int id;
    private String marka;
    private int putarina;
    private int br_putnika;
    
    
    public Vozilo() {
        id=++identifikator;
    }

    public int getId() {
        return id;
    }
    
    
    public Vozilo(String marka, int putarina, int br_putnika) {
        this.marka = marka;
        this.putarina = putarina;
        this.br_putnika = br_putnika;
        id=++identifikator;
    }

    
    public String getMarka() {
        return marka;
    }

    public int getPutarina() {
        return putarina;
    }

    public int getBr_putnika() {
        return br_putnika;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setPutarina(int putarina) {
        this.putarina = putarina;
    }

    public void setBr_putnika(int br_putnika) {
        this.br_putnika = br_putnika;
    }


    
    @Override
    public String toString() {
        String str;
        str="";
        str+="\n-----------------------------------\nID= " + id + "\n" + "Marka= \"" + marka + "\"" + "\n" + "Putarina= " + putarina+ " din." + "\n" + "Broj putnika= " + br_putnika;
        return str;
    }

    
}
