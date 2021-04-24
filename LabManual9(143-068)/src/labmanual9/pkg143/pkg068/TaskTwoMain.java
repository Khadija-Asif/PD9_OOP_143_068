/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual9.pkg143.pkg068;

import java.util.Scanner;

/**
 *
 * @author KHADIJA
 */
public class TaskTwoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stringMethodsTwo T = new stringMethodsTwo();
        String s;
        System.out.println("Enter the String: ");
        Scanner obj = new Scanner(System.in);
        s = obj.nextLine();
        T.displayVertical(s);
    }

}
