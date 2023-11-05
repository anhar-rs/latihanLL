
package anharstack;
class MyStack {
   // private String[] stack;: Ini adalah array string yang digunakan untuk menyimpan
   // elemen-elemen dalam tumpukan (stack) pakaian. 
   //Array ini diberi nama stack.
    private String[] stack;
    //rivate int top;: Variabel top digunakan untuk melacak indeks atau posisi elemen
    // teratas dalam tumpukan pakaian. Ketika tumpukan kosong,
    // top diatur ke -1.//
    private int top;
//: Ini adalah konstruktor kelas MyStack. Konstruktor ini akan dijalankan ketika 
// membuat objek dari kelas MyStack. Di dalam konstruktor, array stack diinisialisasi dengan 
//ukuran 100 (seperti yang Anda sebutkan, menganggap bahwa keranjang pakaian dapat menampung 100 pakaian)
// dan top diatur ke -1 untuk menandakan bahwa tumpukan awalnya kosong.
    public MyStack() {
        stack = new String[100]; // Anggap saja keranjang bisa menampung 100 pakaian
        top = -1;
    }
    //public void push(String item): Metode push digunakan untuk menambahkan pakaian ke tumpukan.
    // Ia menerima sebuah string item yang mewakili pakaian dan menambahkannya ke dalam tumpukan 
    //dengan menginkremen top terlebih dahulu dan kemudian menempatkan item ke posisi yang ditunjuk oleh top.

    public void push(String item) {
        stack[++top] = item;
    }
//public String pop(): Metode pop digunakan untuk mengeluarkan (menghapus) pakaian dari tumpukan yang berada 
//di paling atas. Metode ini mengembalikan string yang mewakili pakaian tersebut dan mengurangkan top 
//untuk menunjuk ke pakaian di bawahnya. Jika tumpukan sudah kosong (ketika top adalah -1),
// metode ini akan melemparkan pengecualian (exception) dengan pesan "Stack is empty".
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }
    //public String peek(): Metode peek digunakan untuk melihat (tanpa menghapus) pakaian yang berada 
    //di paling atas tumpukan. Metode ini mengembalikan string yang mewakili pakaian tersebut tanpa 
    //mengubah nilai top. Seperti metode pop, jika tumpukan kosong, ia akan melemparkan pengecualian.

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }
    //public boolean isEmpty(): Metode ini memeriksa apakah tumpukan kosong atau tidak. 
    //Ia mengembalikan true jika top adalah -1 (tumpukan kosong)
    // dan false jika sebaliknya.//

    public boolean isEmpty() {
        return top == -1;
    }
    //public void print(): Metode print digunakan untuk mencetak semua pakaian yang ada dalam tumpukan,
    // mulai dari pakaian di paling atas (indeks 0) hingga pakaian di bawahnya (indeks top).
    // Ini memungkinkan Anda untuk melihat pakaian yang ada dalam keranjang.

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }
}
