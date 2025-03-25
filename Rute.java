public class Rute {
    private String asal;
    private String tujuan;

    public Rute(String Asal, String Tujuan){
        this.asal = Asal;
        this.tujuan = Tujuan;
    }

    public String getAsal(){
        return asal;
    }

    public String getTujuan(){
        return tujuan;
    }

    public void setAsal(String Asal){
        this.asal = Asal;
    }

    public void setTujuan(String Tujuan){
        this.tujuan = Tujuan;
    }

    @Override
    public String toString() {
        return asal + " - " + tujuan;
    }

    public void getInfo(){
        System.out.println(this.toString());
    }   
}
