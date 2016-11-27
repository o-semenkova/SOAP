package service;

import domain.Book;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by osemenkova on 11/27/2016.
 */

//Service Endpoint Interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BookService {

    @WebMethod
    String getBook(int id);

    @WebMethod
    String deleteBook(int id);
}
