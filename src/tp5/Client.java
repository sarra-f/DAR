package tp5;

import java.rmi.Naming;
package TP5;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.sayHello());
	    MyInterface service2 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service2.toUpper("sarra"));
 	    MyInterface service3 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service3.index("sarra","k"));
 	    MyInterface service4 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service4.palindrome("azza"));

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.sayHello());

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
