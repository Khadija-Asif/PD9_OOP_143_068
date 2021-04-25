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
public class stringMethodsThree {

    String str = "";

    /**
     * Function to rid Multiple blank spaces in a string
     *
     * @param s
     * @return
     */
    String ridMultipleBlank(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {

                str = str + s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                int j = i + 1;
                if (!(s.charAt(j) == ' ')) {
                    str = str + " ";
                }
            }
        }
        System.out.println(str);
        return str;

    }

    /**
     * Function to remove Integers from the strings
     *
     * @param s
     * @return
     */
    String removeInteger(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                str = str + s.charAt(i);
            }
        }
        System.out.println(str);
        return str;
    }

    /**
     * Function which take input string and change into encrypted string
     * @param s
     * @return 
     */
    String stringEncryption(String s)
    {
        char[] str = s.toCharArray();
        for(int i = 0 ; i<str.length ;i++ )
        {
            str[i] = (char) (s.charAt(i)+5);
        }
        String inp = str.toString();
        System.out.println(inp);
        return inp;
    }
    
}
