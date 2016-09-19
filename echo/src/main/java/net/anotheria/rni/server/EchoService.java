package net.anotheria.rni.server;

import net.anotheria.rmi.common.IEchoService;

import java.rmi.RemoteException;


/**
 * Echo service implementation.
 */
public class EchoService implements IEchoService {


    protected EchoService() throws RemoteException {
    }

    public String echo(String aString) throws RemoteException {

        System.out.println(aString);

        return new StringBuilder(aString).reverse().toString();
    }


}
