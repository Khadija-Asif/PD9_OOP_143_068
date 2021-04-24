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
public class TaskThreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stringMethodsThree t = new stringMethodsThree();
        Scanner obj = new Scanner(System.in);
        String s1;
        System.out.println("Input String: ");
        s1 = obj.nextLine();
        t.ridMultipleBlank(s1);
        String s;
        System.out.println("Input String: ");
        s = obj.nextLine();
        t.removeInteger(s);
    }

}
