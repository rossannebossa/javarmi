package dbserver;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import dbimplementation.*;

public class DBServer {
    public static void main (String [] args){
        try{
            Registry reg = LocateRegistry.createRegistry(1099);//5000
            DBImplementation d = new DBImplementation();
            reg.rebind("Select", d);
            
            System.out.println("Server is running");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
