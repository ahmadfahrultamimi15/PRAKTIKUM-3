package Praktikum3;

public class Riko {
    public static void main(String[] Args){

        //MEMBUAT OBJEK
        Anton AntonAbc = new Anton ();
        Anton AntonDef = new Anton ();

        //MEMANGGIL ATRIBUT
        AntonAbc.setNama("ANTON");
        AntonAbc.setJenisKelamin("Laki-Laki");
        AntonAbc.setUmur(23);

        AntonDef.setNama("RIKO");
        AntonDef.setJenisKelamin("Laki-Laki");
        AntonDef.setUmur(23);

        System.out.println("Nama :" + AntonAbc.getNama());
        System.out.println("Jenis Kelamin :" + AntonAbc.getJenisKelamin());
        System.out.println("Umur :" + AntonAbc.getUmur());

        System.out.println("Nama :" + AntonDef.getNama());
        System.out.println("Jenis Kelamin :" + AntonDef.getJenisKelamin());
        System.out.println("Umur :" + AntonDef.getUmur());


    }
}
