package net.anotheria.rmi.client;

import net.anotheria.rmi.common.IEchoService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Connect to the server and use its method like own local thought RMI.
 */
public class Client {


    /**
     * Lookup for the stub in registry and invoke the method on it.
     *
     * @param args
     */
    public static void main(String[] args) {

        String message = "hello";

        try {
            Registry registry = LocateRegistry.getRegistry(5555);
            IEchoService stub = (IEchoService) registry.lookup("EchoService");
            String response = stub.echo(message);

            System.out.println(message);
            System.out.println(response);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
