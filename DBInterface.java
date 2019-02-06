package dbinterface;

import java.rmi.*;
import java.sql.*;
import java.util.List;
import customer.DBCustomer;

public interface DBInterface extends Remote{
   public List<DBCustomer> getCustomers()throws RemoteException;  
}
