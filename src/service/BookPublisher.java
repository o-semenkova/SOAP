package service;

import javax.xml.ws.Endpoint;

/**
 * Created by osemenkova on 11/27/2016.
 */
public class BookPublisher {
    public static void main(String []args){
        Endpoint.publish("http://localhost:9999/service/hello", new BookServiceImpl());
    }
}
