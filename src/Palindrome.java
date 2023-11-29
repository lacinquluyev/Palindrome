
import java.util.Scanner;

//Tersi duzune beraber olan sozler veya reqemler toplusu palindrome adlanir.
/* Author Lachinquluyev@gmail.com
Lachin Guluyev
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String soz;
        String tersSoz = "";

        System.out.print(" Sozu daxil edin : ");

        soz=scanner.nextLine();
        int uzunluq =soz.length();

        for (int i = uzunluq-1; i >=0 ; i--) {
            tersSoz += soz.charAt(i);
        } if (soz.equals(tersSoz)){
            System.out.println(soz + " = Palindrome sozdur ");
        } else {
            System.out.println(soz + " = Palindrome deyildir");
        }
    }
}
