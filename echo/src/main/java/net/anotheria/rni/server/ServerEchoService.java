package net.anotheria.rni.server;


import net.anotheria.rmi.common.IEchoService;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Register service in Locate Registry.
 */
public class ServerEchoService {


    /**
     * Create EchoService and register it.
     *
     * @param args
     * @throws RemoteException
     */
    public static void main(String[] args) throws RemoteException {
        EchoService echoService = new EchoService();
        try {
            IEchoService stub = (IEchoService) UnicastRemoteObject.exportObject(echoService, 0);
            Registry registry = LocateRegistry.createRegistry(5555);
            registry.rebind("EchoService", stub);

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
