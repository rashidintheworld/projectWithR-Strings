package az.orient.projectR6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Userdən 2 String alın. String.reverse() metodundan istifadə
        etmədən bu 2 stringin əks olub-olmamasını yoxlayın.
            Məs: “XYZ” və “ZYX” —> true
            “XYZ” və “YZX” —> false*/

        Scanner sc = new Scanner(System.in);
        System.out.print("birinci stringi daxil edin-> ");
        String birinci_string = sc.nextLine();
        System.out.print("ikinci stringi daxil edin-> ");
        String ikinci_string = sc.nextLine();
        String temp_birinci_string = "";
        String temp_ikinci_string = "";
       // String[] demo = birinci_string.split("")
        if (birinci_string.isEmpty() || ikinci_string.isEmpty()) {
            System.out.println("Bu hisse bos ola bilmez, bir String deyer girin!");
        }else{
            for(int i = birinci_string.length() - 1; i >= 0 ; i--) {
                temp_birinci_string += birinci_string.charAt(i);
            }
            if(temp_birinci_string.equals(ikinci_string)){
                System.out.println("Iki String bir birinin tersidir");
            }else{
                System.out.println("Iki String bir birinin tersi deyildir");
            }
        }
    }
}
