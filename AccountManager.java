package myPackage;

import java.util.ArrayList;

public class AccountManager {

    private static ArrayList<Account> accountManager = new ArrayList<>();
    
    public AccountManager(){
    
    }
    public void addAccountToDataBase(Account ac) {
        accountManager.add(ac);
        System.out.println(ac.toString());
    }

    public static boolean check(String username, String email, String password) {
        for (Account s : accountManager) {
            if (s.getUsername().equals(username)) {
                if (s.getEmail().equals(email)) {
                    if (s.getPassword().equals(password)) {
                        return true;
                    }else{
                        System.out.println("Wrong password.");
                    }
                }else{
                    System.out.println("Wrong email.");
                }
            }
        }
        return false;
    }
    
    public static void changePass(String username, String email, String password, String newPassword) {
        for (Account s : accountManager) {
            if (s.getUsername().equals(username) && s.getEmail().equals(email) && s.getPassword().equals(password)) {
                s.setPassword(newPassword);
            }
        }

    }
    
    public boolean isPassword(String password) {
        for (Account s : accountManager) {
            if (s.getUsername() == password) {
                return true;
            }
        }
        return false;
    }
    
     public static boolean isUsernameExist(String username, String password) {
        for (Account s : accountManager) {
            if (s.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
     
    public static boolean checkAccount(String username, String password) {
        for (Account s : accountManager) {
            if (s.getUsername().equals(username) && s.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean crendentials(String username, String password) {
        for (Account s : accountManager) {
            if (s.getUsername().equals(username) && s.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    public static void setLoggedIn(String username, String password){
        for (Account s : accountManager) {
            if (s.getUsername().equals(username) && s.getPassword().equals(password)) {
                s.setLogIn(true);
            }
        }
    }
    
    public static boolean logOutAccount(String username, String password) {
        for (Account s : accountManager) {
            if (s.getUsername().equals(username) && s.getPassword().equals(password)) {
                s.setLogIn(false);
                return true;
            }
        }
        return false;
    }

    public static void displayAccounts() {
        int i = 1;
        for (Account s : accountManager) {
            System.out.println("Account No. " + i + s.toString() + "\n");
            i++;
        }

    }

}
