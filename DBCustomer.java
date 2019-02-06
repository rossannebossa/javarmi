package customer;

public class DBCustomer implements java.io.Serializable {
    
private int acc_no;  
private String firstname,lastname,email;  
private float amount;

    public DBCustomer() {
    }

    public DBCustomer(int acc_no, String firstname, String lastname, String email, float amount) {
        this.acc_no = acc_no;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.amount = amount;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DBCustomer{" + "acc_no=" + acc_no + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", amount=" + amount + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }



}
