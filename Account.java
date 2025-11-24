package myPackage;

import javax.swing.JOptionPane;

public class Account {

    private String username;
    private String password;
    private String email;
    private String cellphoneNumber;
    private boolean verified;
    private boolean isLogIn;

    public Account(String username, String password, String email, String cellphoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.cellphoneNumber = cellphoneNumber;
        verified = true;
        isLogIn = false;
    }
    
    public boolean isLoggedIn(){
        return isLogIn;
    }
    
    public void setLogIn(boolean isLogIn){
        this.isLogIn = isLogIn;
    }
    
    public boolean getVerified(){
        return verified;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;

    }
    
    public void displayCredentials(){
        JOptionPane.showMessageDialog(null, toString(),"Credentials",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String toString(){
        return "Username: " + getUsername() +
               "\nPassword: " + getPassword() + 
               "\nEmail Address: " + getEmail() + 
               "\nCellphone No.: " + getCellphoneNumber();
    }
    
    
    
}
