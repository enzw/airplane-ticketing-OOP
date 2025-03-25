public class PembayaranKartu extends Pembayaran {
    private String nomorKartu; 

    public PembayaranKartu(double jumlahPembayaran, String nomorKartu){
        super(jumlahPembayaran);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu(){
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu){
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran dengan kartu " + nomorKartu + " sebesar " + getJumlahPembayaran() + " berhasil" );
    }
}
