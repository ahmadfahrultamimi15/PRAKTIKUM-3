package Praktikum3;

public class Anton {
    private String Nama;
    private String JenisKelamin;
    private int Umur;

    //SETTER
    public void setNama(String Nama){
        this.Nama = Nama ;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin ;
    }
    public void setUmur(int Umur){
        this.Umur = Umur ;
    }

    //GETTER
    public String getNama() {
        return Nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public int getUmur() {
        return Umur;
    }
}
