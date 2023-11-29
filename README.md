﻿# Palindrome
# Palindrome - interview question solution

Salam, Interview-larda bəzən soruşulan bəzəndə soruşulmayan bir məsələdir Palindrome.

Palindrome nədir? 

- Palindrome soldan sağa oxunuşu ilə sağdan sola oxunuşu eyni olan söz vəya rəqəm toplusudur. Məsələn 12454321 bu Palindrome rəqəmdir vəya ADDA bu Palindrome sözdür.

indi isə Java dilində kodda bunun tapılması qaydasına baxaq.

Aşağıdakı koda baxın:

```java
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String soz;
        String tersSoz = "";

        System.out.print("Sözü daxil edin: ");

        soz = scanner.nextLine();
        int uzunluq = soz.length();

        for (int i = uzunluq - 1; i >= 0; i--) {
            tersSoz += soz.charAt(i);
        }
        if (soz.equals(tersSoz)) {
            System.out.println(soz + " = Palindrome sözdür");
        } else {
            System.out.println(soz + " = Palindrome deyildir");
        }
    }
}

```

Indi isə kodu oxuyaq hissə-hissə ilk öncə Scanner klasını yaratdıq və Scanner klası vasitəsi ilə söz vəya rəqəm input edə bilirik və mütləq şəkildə import etməyi unutmayaq.

```java
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String soz;
        String tersSoz = "";

        System.out.print("Sözü daxil edin: ");

        soz = scanner.nextLine();
```

Bura kimi aydındırsa davam edək 

Daxil edilən sözün uzunluğun tapırıq və onu “For” əməliyyatında istifadə edəcəyik.

```java
    int uzunluq = soz.length();

        for (int i = uzunluq - 1; i >= 0; i--) {
            tersSoz += soz.charAt(i);
        }

```

For -da bir vahid azaldırıq və 0-a bərabər olana kimi hər sözü tapırıq və digər şərtdə if istifadə edəcəyik.

```java
    if (soz.equals(tersSoz)) {
            System.out.println(soz + " = Palindrome sözdür");
        } else {
            System.out.println(soz + " = Palindrome deyildir");
        }
```

İf şərtində equals - metodundan istifadə edirik -  Equals metodu Stringlərdə içərisindəki dəyəri yoxlayır və əgər eynidirsə true qaytarır eyni deyilsə false. Burada sözün özü ilə tərsi eynidirsə birinci daxil olacaq və Palindrome sözdür çap olunacaq. 

Ümid edirəmki izah başa düşüləndir. Təşəkkürlər!
