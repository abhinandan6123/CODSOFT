/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

import java.util.Scanner;

import task3.UserBank;
public class AtmMachine extends UserBank {
    double balance;
     Scanner s = new Scanner(System.in);
     
    public void checkBalance(){
        System.out.println("your balance is : "+super.balance);
    }
    public void withdraw(double amount){
       
       
        if(amount<=0 || amount>super.balance){
            System.out.println("transaction failed because your balance is : "+super.balance);
        }else {
             super.balance -= amount;
            System.out.println("thank you ! you successfully withdrawn : "+amount);
            System.out.println("you current balance is : "+super.balance);
        }
        
    }
    public void deposit(double balance) {
        
        super.balance = super.balance + balance;
        System.out.println("thank you ! You Deposited The Amount : "+balance);
        System.out.println("your Current Balance is : "+super.balance);
    }
  public  void display() {
      
      System.out.println("Welcome to ATM Machine");
      System.out.println("1.Check Balance");
      System.out.println("2.Withdraw");
      System.out.println("3.Deposit");
      System.out.println("4.Exit");
      int choice;
      while(true){
          System.out.println("Enter Your Option");
     
      choice = s.nextInt();
      switch(choice){
          case 1:
              System.out.println("You Choose the Check Balance Option :");
              checkBalance();
              break;
          case 2:
               System.out.println("you choose the withdraw option :");
              System.out.println("Enter the Amount");
              double withdra = s.nextDouble();
              withdraw(withdra);
              break;
          case 3:
              System.out.println("You choose the Deposit Option :");
              System.out.println("Enter The Balance");
              double Balance = s.nextDouble();
              deposit(Balance);
              break;
          case 4:
              System.out.println("Thank You For Using ATM");
              System.exit(0);
          default:
              System.out.println("Invalid Option");
              
      }
      }
      
  
  }
}
