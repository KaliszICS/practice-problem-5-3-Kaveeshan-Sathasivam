/*File: Practice Problem 5.3
Author: Kaveeshan
Date Created: May 4th, 2026
Date Last Modified: May 4th, 2026 */
public class PracticeProblem {

    public static String[] addString(String[] arr, String value, int index) {
        String[] newArr = new String[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = value;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static char[] removeChars(char[] arr, char ch) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ch) {
                count++;
            }
        }

        char[] newArr = new char[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ch) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }
}