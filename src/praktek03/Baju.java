package praktek03;

public class Baju {
    private String merk;
    private String warna;
    private double harga;
    
    void pelindungtubuh(){
        System.out.println("Merk \t: "+merk+"\n"+
                "Warna \t: "+warna+"\n"+
                "Harga \t: "+harga+"\n");
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
