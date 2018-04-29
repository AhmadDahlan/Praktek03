package praktek03;

public class BajuAksi {
    public static void main(String[] args) {
       Baju b = new Baju();
       b.setMerk("Billabongss");
       b.setWarna("Hijau");
       b.setHarga(25000);
       
       b.pelindungtubuh();
       
       System.out.print("Merknya \t: ");
       System.out.println(b.getMerk());
       System.out.print("Warnanya \t: ");
       System.out.println(b.getWarna());
       System.out.print("Harganya \t: ");
       System.out.println(b.getHarga());
       
       BajuJalan bj = new BajuJalan();
       bj.setMerk("Nevada");
       bj.setWarna("Merah");
       bj.setHarga(50000);
       bj.setJenisbaju("Jalan");
       bj.pelindungtubuh();
       System.out.println("Jenis \t:"+bj.getJenisbaju());
       bj.throttle();
    }
    
}
