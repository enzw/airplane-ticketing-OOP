import java.util.ArrayList;
import java.util.List;

public class Penumpang{
    private String nama;
    private String email;
    private List<Tiket> tiketList;

  
    public Penumpang(String nama, String email) throws Eksepsi {
        if (email == null || !email.contains("@")) {
            throw new Eksepsi("Email tidak valid");
        }
        this.nama = nama;
        this.email = email;
        this.tiketList = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }

    public String getEmail(){
        return email;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void tambahTiket(Tiket tiket){
        tiketList.add(tiket);
    }

    public void lihatTiket() {
        for (Tiket tiket : tiketList) {
            System.out.println("Kode Tiket: " + tiket.getKodeTiket());
            System.out.println("Penerbangan: " + tiket.getPenerbangan().getKodePenerbangan());
        }
    }
} 