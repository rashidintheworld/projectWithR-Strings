package az.orient.projectR6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/*
        Verilmiş cümlədəki hərflərin və rəqəmlərin sayını tapın.
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Cumleni daxil edin:");
        String cumle = sc.nextLine();
        int herf_sayi = 0;
        int reqem_sayi = 0;
        String[] bolmek = cumle.split("");

        if(cumle.isEmpty()){
            System.out.println("Bu hisse bos ola bilmez , String daxil edin !");
        }else{
            for(String simvol : bolmek){
                if(Character.isDigit(simvol.charAt(0))){
                    reqem_sayi+=1;
                }else if(Character.isLetter(simvol.charAt(0))){
                    herf_sayi+=1;
                }
            }
            System.out.println("Reqem sayi: " + reqem_sayi + "\n" + "Herf sayi: " + herf_sayi);
        }
    }
}
