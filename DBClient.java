package dbclient;

import dbinterface.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.*;
import customer.DBCustomer;

public class DBClient {

    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
            DBInterface di = (DBInterface) reg.lookup("Select");

            List<DBCustomer> list = di.getCustomers();
            for (DBCustomer c : list) {
                System.out.println(c.getAcc_no() + " " + c.getFirstname() + " " + c.getLastname() + " " + c.getEmail() + " " + c.getAmount());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
