package net.anotheria.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface fo RMI service.
 */
public interface IEchoService extends Remote{


    /**
     * Take message and return reverse of it.
     *
     * @param aString
     * @return
     * @throws RemoteException
     */
    String echo(String aString) throws RemoteException;
}
