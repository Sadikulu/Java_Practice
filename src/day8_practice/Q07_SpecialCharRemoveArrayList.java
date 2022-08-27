package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q07_SpecialCharRemoveArrayList {
    public static void main(String[] args) {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
        List<String> list = new ArrayList<>();
        list.add("$-13");
        list.add("$0");
        list.add("$0");
        int toplam=0;
        if (!(toplam>0)) {
            System.out.println(getSum(list,toplam));
        }else {
            System.out.println("-1");
        }

    }

    public static int getSum(List<String> list,int toplam) {

        for (int i = 0; i <list.size() ; i++) {
            String index=list.get(i);
            index=index.replace("$","");
            toplam+=Integer.parseInt(index);
        }

        return toplam;
    }
}