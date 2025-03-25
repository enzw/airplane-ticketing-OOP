public abstract class Pembayaran {
    private double jumlahPembayaran;

    public Pembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }

    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }

    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }

    public abstract void prosesPembayaran();
}
