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
public class stringMethodsOne {

    /**
     * Function to count number of words in a string
     *
     * @param s
     * @return
     */
    int wordCounter(String s) {
        int count = 1;
        int size = s.length();
        for (int i = 0; i < size - 1; i++) {
            if (s.charAt(i) == ' ') {
                count = count + 1;
            }
        }

        System.out.println("Number of words: " + count);
        return count;
    }

    /**
     * Function to count total number of vowels in a string
     *
     * @param s
     * @return
     */
    int vovelCounter(String s) {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            } else if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            } else {
            }
        }
        System.out.println("Number of vowels:  " + count);
        return count;

    }

    /**
     * Function to count number of punctuation marks in a string
     *
     * @param s
     * @return
     */
    int puncCounter(String s) {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == ':' || s.charAt(i) == ';') {
                count++;
            } else if (s.charAt(i) == '"') {
                count++;
            }
        }
        System.out.println("Number of punctuations :  " + count);
        return count;
    }

    /**
     * Function to check whether the sub string is the part of the string or not
     *
     * @param s
     * @param sub
     * @return
     */
    boolean findSubString(String s, String sub) {
        boolean check = false;
        int j = 0;
        int count = 1;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                count = count + 1;
            }
        }
        String[] Arr = new String[s.length()];
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!(s.charAt(i) == ' ')) {
                Arr[i] = "" + s.charAt(i);
            } else {
                Arr[i] = " ";
            }
        }
        String[] str = new String[count];
        int k = 0;
        for (int i = 0; i < count; i++) {
            str[i] = "";
        }
        for (int i = 0; i < Arr.length; i++) {
            if (!(Arr[i].equals(" "))) {
                str[k] = str[k] + Arr[i];
            } else {
                k = k + 1;
            }

        }

        for (int i = 0; i < count; i++) {
            if (sub.equals(str[i])) {
                System.out.println(str[i]);
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check == true) {
            System.out.println("\"" + sub + "\"" + " is a part of this string.");
        } else if (check == false) {
            System.out.println("0");
        }

        return check;
    }

}
