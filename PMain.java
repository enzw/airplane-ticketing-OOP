public class PMain {
    public static void main(String[] args) {
        try {
            // 1. Membuat objek Penumpang
            Penumpang penumpang1 = new Penumpang("Enzo", "enzo@example.com");

            // 2. Menampilkan informasi penumpang
            System.out.println("Nama Penumpang: " + penumpang1.getNama());
            System.out.println("Email Penumpang: " + penumpang1.getEmail());

            // 3. Mengubah nama dan email penumpang
            penumpang1.setNama("Enzokulin");
            penumpang1.setEmail("enzokulin@example.com");
            System.out.println("Nama Penumpang setelah diubah: " + penumpang1.getNama());
            System.out.println("Email Penumpang setelah diubah: " + penumpang1.getEmail());

            // 4. Membuat objek Rute
            Rute rute1 = new Rute("Jakarta", "Bali");
            System.out.println("\nInformasi Rute:");
            rute1.getInfo();

            // 5. Mengubah rute penerbangan
            rute1.setAsal("Surabaya");
            rute1.setTujuan("Lombok");
            System.out.println("\nRute setelah diubah:");
            rute1.getInfo();

            // 6. Membuat objek Pesawat
            Pesawat pesawat1 = new Pesawat("Garuda Indonesia", 200);
            System.out.println("\nInformasi Pesawat:");
            pesawat1.getInfo();

            // 7. Mengubah informasi pesawat
            pesawat1.setMaskapai("Lion Air");
            pesawat1.setKapasitas(180);
            System.out.println("\nPesawat setelah diubah:");
            pesawat1.getInfo();

            // 8. Membuat objek Penerbangan
            Penerbangan penerbangan1 = new Penerbangan("GA-123", rute1, pesawat1);
            System.out.println("\nInformasi Penerbangan:");
            penerbangan1.getInfo();

            // 9. Mengubah kode penerbangan
            penerbangan1.setKodePenerbangan("JT-456");
            System.out.println("\nPenerbangan setelah diubah:");
            penerbangan1.getInfo();

            // 10. Membuat objek Tiket
            Tiket tiket1 = new Tiket("TKT-001", penerbangan1);
            System.out.println("\nInformasi Tiket:");
            System.out.println("Kode Tiket: " + tiket1.getKodeTiket());
            System.out.println("Penerbangan: " + tiket1.getPenerbangan().getKodePenerbangan());

            // 11. Menambahkan tiket ke penumpang
            penumpang1.tambahTiket(tiket1);

            // 12. Menampilkan semua tiket penumpang
            System.out.println("\nTiket yang dimiliki oleh " + penumpang1.getNama() + ":");
            penumpang1.lihatTiket();

            // 13. Melakukan pembayaran dengan kartu
            Pembayaran pembayaran = new PembayaranKartu(500000, "1234-5678-9012-3456");
            pembayaran.prosesPembayaran();

        } catch (Eksepsi e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
