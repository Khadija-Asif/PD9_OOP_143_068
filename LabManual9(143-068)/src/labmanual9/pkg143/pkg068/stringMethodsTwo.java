/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual9.pkg143.pkg068;

/**
 *
 * @author KHADIJA
 */
public class stringMethodsTwo {

    /**
     * Function to display string in a vertical form
     *
     * @param s
     * @return
     */
    String displayVertical(String s) {
        String str = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!(s.charAt(i) == ' ')) {
                str = str + s.charAt(i);
            }
        }
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i) + "\n");
        }
        return s;

    }

}
