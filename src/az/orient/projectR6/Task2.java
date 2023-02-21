package az.orient.projectR6;

import java.util.Scanner;

public class Task2 {
/*
    Verilmiş çümlə daxilindəki sözlərin sayını tapın.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cumleni daxil edin : ");
        String cumle = sc.nextLine();
        String[] bolmek = cumle.split(" ");
        int say = 0;
        if(cumle.isEmpty()){
            System.out.println("Bu hisse bos ola bilmez , String daxil edin !");
        }else{


        for(String soz : bolmek){
            say+=1;
        } System.out.println("\n"+"Cumlede soz sayi -> "+say+"\n");


    }
}
}