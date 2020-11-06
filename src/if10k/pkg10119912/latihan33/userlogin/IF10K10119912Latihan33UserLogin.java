/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */

public class IF10K10119912Latihan33UserLogin {

    private static String usName, passWord;
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Masukan Username : ");
         usName = scanner.nextLine();
         System.out.print("Masukan Password : ");
         passWord = scanner.nextLine();
         User user1 = new User();
         user1.checkLogin(usName, passWord);
    }
    
}
