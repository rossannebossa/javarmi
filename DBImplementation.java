package dbimplementation;

import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;
import java.util.*;
import dbinterface.*;
import customer.DBCustomer;

public class DBImplementation extends UnicastRemoteObject implements DBInterface {

    public DBImplementation() throws RemoteException {
    }

    //@Override
    public List<DBCustomer> getCustomers() throws RemoteException {
        List<DBCustomer> list = new ArrayList<DBCustomer>();
        Connection con = null;
        final String driver = "com.mysql.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/customer";
        final String user = "root";
        final String password = "";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected database successfully...");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM `details`");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DBCustomer c = new DBCustomer();
                c.setAcc_no(rs.getInt(1));
                c.setFirstname(rs.getString(2));
                c.setLastname(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setAmount(rs.getFloat(5));
                list.add(c);

                System.out.println(list);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    /*public static void main (String [] args) throws RemoteException{
        DBImplementation d = new DBImplementation();
        d.getCustomers();
    }*/
}
