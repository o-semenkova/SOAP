package service;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by osemenkova on 11/27/2016.
 */
public class BookClient {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/service/hello");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://service/", "BookServiceImplService");

        Service service = Service.create(url, qname);


        service.BookServiceWsImport bookService = service.getPort(service.BookServiceWsImport.class);

        System.out.println(bookService.getBook(1));
        System.out.println(bookService.deleteBook(1));

    }
}
