package TP5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello World !!";
    }

    @Override
    public String toUpper(String s) throws RemoteException {
        return s.toUpperCase();
    }

    @Override
    public int index(String s,String a) throws RemoteException {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == a.charAt(0)) {
                return i;

            }
        } return -1;
    }
	
	@Override
	public boolean palindrome (String x) throws RemoteException{
        	int i=0;
        	for(int j=0;i<x.length()/2;i++){
            		if((x.charAt(j))!=(x.charAt(x.length()-j-1)))
                		x++;
       		 }
       		 if (i==0)
            		return true;
        	else
            		return false;


    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
