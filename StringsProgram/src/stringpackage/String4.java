package stringpackage;

public class String4 {
    public static void main(String[] args) {
        String s1 = "CIVIC";
        char[] arr = s1.toCharArray();
        int size = arr.length;
        char[] reversearr = new char[size];
        int i = 0;
        
        while (i != size) {
            reversearr[size - i - 1] = arr[i];
            i++;
        }
        
        int j = 0;
        while (j != size) {
            if (reversearr[j] != arr[j]) {
                System.out.println("Not a palindrome");
                System.exit(0);
            } else {
                j++;
            }
        }
        
        System.out.println("The string is a palindrome: " + s1);
    }
}

