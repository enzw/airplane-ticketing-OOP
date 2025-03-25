public class Penerbangan {
    private String kodePenerbangan;
    private Rute rute;
    private Pesawat pesawat;

    public Penerbangan(String kodePenerbangan, Rute Rute, Pesawat Pesawat){
        this.kodePenerbangan = kodePenerbangan;
        this.rute = Rute;
        this.pesawat = Pesawat;
    }

    public String getKodePenerbangan(){
        return kodePenerbangan;
    }

    public Rute getRute(){
        return rute;
    }

    public Pesawat getPesawat(){
        return pesawat;
    }

    public void setKodePenerbangan(String kodePenerbangan){
        this.kodePenerbangan = kodePenerbangan;
    }

    public void setRute(Rute Rute){
        this.rute = Rute;
    }

    public void setPesawat(Pesawat Pesawat){
        this.pesawat = Pesawat;
    }

    public void getInfo(){
        System.out.println("Kode Penerbangan: " + kodePenerbangan);
        System.out.println("Rute: " + getRute());
        System.out.println("Pesawat: " + getPesawat());
    }
}
