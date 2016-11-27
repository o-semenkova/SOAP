package service;

import domain.Book;

import javax.jws.WebService;

/**
 * Created by osemenkova on 11/27/2016.
 */

//Service Implementation
@WebService(endpointInterface = "service.BookService")
public class BookServiceImpl implements BookService {
    @Override
    public String getBook(int id) {
        return "Book here";
    }

    @Override
    public String deleteBook(int id) {
        return "Book is deleted";
    }
}
