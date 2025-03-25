public class Pesawat {
    private String maskapai;
    private int kapasitas;

    public Pesawat(String maskapai, int kapasitas){
        this.maskapai = maskapai;
        this.kapasitas = kapasitas;
    }

    public String getMaskapai(){
        return maskapai;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public void setMaskapai(String maskapai){
        this.maskapai = maskapai;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    @Override
    public String toString() {
        return "Maskapai: " + maskapai + ", Kapasitas: " + kapasitas;
    }

    public void getInfo(){
        System.out.println(this.toString());
    }

}
