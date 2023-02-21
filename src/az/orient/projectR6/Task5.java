package az.orient.projectR6;

import java.util.Scanner;

public class Task5 {
/*    Elə edin ki verilmiş cümlədəki bütün sözlərin sadəcə baş hərfləri böyük digər hərfləri isə kiçik olsun.
    Məs: “sALam dÜnyA” —> “”Salam Dünya”*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cumleni daxil edin:");
        String cumle = sc.nextLine();
        //istifadeci her ne daxil edirse hamsini balacalasdirimki sonra rahat davam edim
        String balaca = cumle.toLowerCase();
        String[] bolmek = balaca.split(" ");
        if(cumle.isEmpty()){
            System.out.println("Bu hisse bos ola bilmez , String daxil edin !");
        }else {
            for (String simvol : bolmek) {
                String boyuk_herf_mod = simvol.substring(0, 1).toUpperCase() +simvol.substring(1).toLowerCase();
                System.out.print(boyuk_herf_mod+" ");
            }

        }
    }
}
