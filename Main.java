public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Menambahkan beberapa buku ke perpustakaan
        Book book1 = new Book("Java Programming", "John Doe", 2010);
        Book book2 = new Book("Python Basics", "Alice Smith", 2015);
        Book book3 = new Book("Web Development", "Emma Johnson", 2018);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Menampilkan semua buku dalam perpustakaan
        library.displayBooks();

        // Menghapus buku dengan judul tertentu
        library.removeBook("Java Programming");

        // Menampilkan kembali semua buku setelah penghapusan
        library.displayBooks();
    }
}
