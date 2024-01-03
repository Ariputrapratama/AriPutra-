import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Menambah buku baru ke dalam perpustakaan
    public void addBook(Book book) {
        books.add(book);
    }

    // Menghapus buku dari perpustakaan berdasarkan judul
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    // Menampilkan semua buku dalam perpustakaan
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
