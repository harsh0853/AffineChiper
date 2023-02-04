import java.util.Scanner;
public class AffineChiper {

    /**------------------------------------------------encryption method starts--------------------------------------------**/
    public static String encrypt(String plainText) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter multiplicative key :  ");
        int mul_key = sc.nextInt();
        System.out.print("Enter additive key :  ");
        int sum_key = sc.nextInt();
        String chiptext = "";
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char [] chipArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] index = new int[plainText.length()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (plainText.charAt(j) == array[i])
                    index[j] = ((i * mul_key) + sum_key) % 26;
            }
        }
        for (int j = 0; j < index.length; j++) {
            chiptext = chiptext + Character.toString(chipArray[index[j]]) ;
        }
        return chiptext;
    }

    // Using this method to calculate multiplicative inverse
    static int calmodInv(int mul_key)
    {
        mul_key = mul_key % 26;
        for (int x = 1; x < 26; x++)
            if ((mul_key * x) % 26 == 1)
                return x;
        return 1;
    }

    /**---------------------------------------------------decryption part starts------------------------------------------**/
    public static String decrypt(String chipertext) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter multiplicative key :  ");
        int mul_key = sc.nextInt();
        System.out.print("Enter additive key :  ");
        int sum_key = sc.nextInt();
        String plainText = "";
        char[] plainArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char [] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] index = new int[chipertext.length()];
        for (int i = 0; i < chipertext.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (chipertext.charAt(i) == array[j])
                    index[i] =  ((j - sum_key + 26) * calmodInv(mul_key)) % 26;
            }
        }
        for (int j = 0; j < index.length; j++) {
            plainText = plainText + Character.toString(plainArray[index[j]]);
        }
        return plainText;
    }

    /** ---------------------------------main method starts-------------------------------------**/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for ENCRYPTION , 2 for DECRYPTION :  ");
        int a = sc.nextInt();
        System.out.print("Enter the message  :  ");
        String b = sc.next();
        if(a==1)
            System.out.println("\nENCRYPTED message is : " +encrypt(b));
        else if (a == 2)
            System.out.println("\nDECRYPTED message is : " +decrypt(b));
        else
            System.out.println("\nInvalid Input !!");
    }
}
