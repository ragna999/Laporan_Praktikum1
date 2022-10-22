public class Latihan{
    /**
     * 
     */
        public static void main(String[]args){

        //Membuat Objek
        final Person Saya = new Person();
        final Person Dia = new Person();

        //Memanggil atribut yang sudah dibuat pada file Public_Class_Person.java
        Saya.nama = "Anton";
        Saya.jeniskelamin = "Pria";
        Saya.umur = 50;
        Dia.nama = "Riko";
        Dia.jeniskelamin = "Pria";
        Dia.umur = 40 ;
        System.out.println("========================");
        System.out.println("Nama            : "+ Saya.nama);
        System.out.println("Jenis Kelamin   : "+ Saya.jeniskelamin);
        System.out.println("Umur            : "+ Saya.umur);
        System.out.println("========================");
        System.out.println("Nama            : "+ Dia.nama);
        System.out.println("Jenis Kelamin   : "+ Dia.jeniskelamin);
        System.out.println("Umur            : "+ Dia.umur);
    }
}