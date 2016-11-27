package servicewsimport;

import service.BookServiceImplService;
import service.BookServiceWsImport;

/**
 * Created by osemenkova on 11/27/2016.
 */
public class BookClientForWsImport {
    public static void main(String[] args) {

        BookServiceImplService bookService = new BookServiceImplService();
        BookServiceWsImport book = bookService.getBookServiceImplPort();

        System.out.println(book.getBook(1));
    }
}
