public class identitas {

    public static void main(String[] args) {
        // Data diri
        String nama = "Dimas Rizky Aliandy";
        int umur = 18;
        double tinggi = 172;  // dalam sentimeter
        double beratBadan = 60;  // dalam kilogram
        String pekerjaan = "Mahasiswa";
        boolean statusMenikah = true;

        // Menampilkan data diri
        System.out.println("Data Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggi + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Pekerjaan: " + pekerjaan);

        if (statusMenikah) {
            System.out.println("Status: Menikah");
        } else {
            System.out.println("Status: Belum Menikah");
        }
    }
}
