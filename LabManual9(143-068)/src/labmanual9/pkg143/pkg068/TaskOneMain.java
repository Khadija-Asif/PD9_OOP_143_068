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
public class TaskOneMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stringMethodsOne S = new stringMethodsOne();
        System.out.println("Enter the String: ");
        String s;
        Scanner obj = new Scanner(System.in);
        s = obj.nextLine();
        S.wordCounter(s);
        S.vovelCounter(s);
        S.puncCounter(s);
        String s1;
        System.out.println("Enter subString to check whether it is available in the String or not: ");
        s1 = obj.nextLine();
        S.findSubString(s, s1);
        System.out.println("Hello world");
    }

}
