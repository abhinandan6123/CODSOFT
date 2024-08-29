/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;
import java.util.Scanner;
import task3.AtmMachine;
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Enter Initial Balance in Your Account : ");
        Scanner s = new Scanner(System.in);
        double b = s.nextDouble();
        AtmMachine m = new AtmMachine();
        m.Balance(b);
        m.display();
      
    }
    
}
