/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicclass;

/**
 *
 * @author patrickbenitez
 */
public class BasicClass {

    public static void main(String[] args) {
        
        bankAccount checkingAccount= new bankAccount();
        
        checkingAccount.deposit(5000);
        
        checkingAccount.getBalance();
    }
    
    public static class bankAccount {
        
        public bankAccount() {
            balance = 0;
        }
        
        public bankAccount(double initialBalance) {
            balance = initialBalance;
        }
        
        public void deposit(double amount){
            balance = balance + amount;
        }
        
        public void withdraw(double amount) {
            balance = balance - amount;
        }
        
        public void getBalance() {
            System.out.println("Your balance is: " + balance); 
        }
        
        private double balance;
    }
}
