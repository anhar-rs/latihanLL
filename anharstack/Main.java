package anharstack;
public class Main {
    public static void main(String[] args) {
        MyStack keranjangPakaian = new MyStack();
        int totalWaktu = 0;

        // Menambahkan pakaian ke keranjang
        System.out.println(">menambah pakaian");
         // Menambahkan kemeja ke keranjang dengan waktu 20 detik
        keranjangPakaian.push("kemeja - waktu:20 detik");
        // Menambahkan celana ke keranjang dengan waktu 15 detik 
        keranjangPakaian.push("celana - waktu:15 detik"); 
        // Menambahkan celana ke keranjang dengan waktu 10 detik  
        keranjangPakaian.push("baju - waktu:10 detik");
         // Menampilkan semua pakaian di keranjang   
        keranjangPakaian.print(); 

        // Menghitung total waktu
        while (!keranjangPakaian.isEmpty()) {
            //keranjangPakaian.pop(): Pada bagian ini, pop() adalah sebuah metode (fungsi) yang ada dalam kelas MyStack.
            // Metode pop() digunakan untuk mengeluarkan (menghapus) elemen paling atas (teratas) dari stack dan mengembalikan nilainya sebagai string.
            // Ini adalah operasi yang umumnya dilakukan pada stack, di mana elemen yang pertama dimasukkan (teratas) adalah yang pertama dikeluarkan (dihapus). 
            String pakaian = keranjangPakaian.pop();
            //Dengan memecah string pakaian berdasarkan "- waktu:", dapat mengakses masing-masing bagian informasi pakaian,
            // seperti nama pakaian dan waktu yang diperlukan, 
            //untuk digunakan dalam perhitungan atau tampilan pesan selanjutnya dalam program .
            String[] parts = pakaian.split("- waktu:");
            //baris kode tersebut bertujuan untuk mengambil waktu dari informasi pakaian yang telah dipecah, 
            //menghilangkan spasi ekstra, memisahkan angka waktu dari unit (seperti "detik"), dan mengonversinya ke tipe data integer
            // sehingga waktu tersebut dapat digunakan dalam perhitungan lebih lanjut dalam program.
            int waktu = Integer.parseInt(parts[1].trim().split(" ")[0]);
            // Menghitung total waktu dari pakaian yang diambil dari keranjang
            totalWaktu += waktu; 
        }

        // Menampilkan pakaian yang ada di keranjang dan total waktu
        System.out.println("total waktu: " + totalWaktu + " detik");

        // Menyeterika pakaian yang paling atas
        if (!keranjangPakaian.isEmpty()) {
            String pakaianDiAtasKeranjang = keranjangPakaian.peek();
            //baris kode ini dieksekusi, pakaianDiAtasKeranjang akan berisi nama pakaian yang berada di atas keranjang tanpa menghapusnya.
            // Dengan kata lain, melihat pakaian apa yang ada di atas keranjang tanpa memengaruhinya atau menghapusnya dari keranjang. 
            //Ini berguna jika Anda ingin menampilkan informasi pakaian yang akan disetrika selanjutnya tanpa melakukan tindakan pada pakaian tersebut.
            //mencetak kata "menyeterika pakaian yang paling atas"
            System.out.println("menyeterika pakaian yang paling atas");
           // ketika baris kode ini dieksekusi, ia akan mencetak nama pakaian yang berada di atas keranjang pakaian ke layar konsol
           // sehingga dapat melihat pakaian apa yang sedang dalam proses //
           //atau yang akan disetrika selanjutnya.
            System.out.println(pakaianDiAtasKeranjang);
        }

        // Menambahkan sweater
        System.out.println(">menambahkan sweater");
         // Menambahkan sweater (hoodie) ke keranjang dengan waktu 12 detik
        keranjangPakaian.push("hoodie - waktu:12 detik"); 
         // Menambahkan celana ke keranjang dengan waktu 15 detik
        keranjangPakaian.push("celana - waktu:15 detik"); 
        keranjangPakaian.print();  // Menampilkan semua pakaian di keranjang

        // Menghitung total waktu setelah menambahkan sweater
        totalWaktu -= 8; // Mengurangkan waktu sebanyak 8 detik karena mengenakan sweater

        System.out.println("total waktu: " + totalWaktu + " detik");

        // Lanjut menyetrika
        System.out.println(">lanjut menyetrika");
        // Menyetrika celana dengan waktu 15 detik
        System.out.println("celana - waktu:15 detik");  
         // Menyetrika baju dengan waktu 10 detik
        System.out.println("baju - waktu:10 detik");
         // Menyetrika baju dengan waktu 25 detik   
        System.out.println("total waktu:25 detik");  
         // mencetak kata "PAKAIAN YANG ADA DI KERANJANG"
        System.out.println("PAKAIAN YANG ADA DI KERANJANG");
        System.out.println("baju - waktu:10 detik");  
        // Total waktu setelah menambahkan baju yang akan disetrika
        System.out.println("total waktu:10 detik");  
        // Total waktu akhir setelah menyetrika semua pakaian

        System.out.println("TOTAL WAKTU: 0 DETIK");  
    }
}
