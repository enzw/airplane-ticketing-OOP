public class Tiket {
    private String kodeTiket;
    private Penerbangan penerbangan;

    public Tiket(String kodeTiket, Penerbangan Penerbangan){
        this.kodeTiket = kodeTiket;
        this.penerbangan = Penerbangan;
    }

    public String getKodeTiket(){
        return kodeTiket;
    }

    public Penerbangan getPenerbangan(){
        return penerbangan;
    }   

    public void setKodeTiket(String kodeTiket){
        this.kodeTiket = kodeTiket;
    }   

    public void setPenerbangan(Penerbangan Penerbangan){
        this.penerbangan = Penerbangan;
    }

    public void getInfo(){
        System.out.println("Kode Tiket: " + kodeTiket);
        System.out.println("Penerbangan: " + getPenerbangan());
    }
    
}
