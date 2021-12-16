package TP5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String toUpper(String s) throws RemoteException;
    int index(String s, String a) throws RemoteException;
    String palindrome(String s) throws RemoteException;

}
