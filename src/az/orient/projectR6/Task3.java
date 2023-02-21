package az.orient.projectR6;

import java.util.Scanner;

public class Task3 {
/*    Verilmiş sözdəki 3-hərfli bütün substringləri çap edin.
            Məs: “Orient” —> “Ori”, “rie”, “ien”, “ent”*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu daxil edin:");
        String soz = sc.nextLine();
        String[] bolmek = soz.split("");
        if(!soz.isEmpty()){
            if(soz.length()>3) {
                for(int i = 0 ; i <= soz.length()-3 ; i++){
                    System.out.println(soz.substring(i,i+3));
                }
            }else{
                System.out.println("sozden 3 herfli hisseleri cixarmaq olmadi, soz uzunluqu 3 den kicikdir!");
            }
        }else{
            System.out.println("Soz daxil edin bos ola bilmez!");
        }


    }
}
