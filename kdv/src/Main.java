import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double kdvTutar1, kdvTutar2;
        Scanner tutar=new Scanner(System.in);
        System.out.println("tutar giriniz:");
       double  sonuc=tutar.nextDouble();
         kdvTutar1=sonuc+sonuc*0.08;
         kdvTutar2=sonuc+sonuc*0.18;
       System.out.println(sonuc>=1000?"kdvli tutar:"+kdvTutar1: "kdvli tutar:"+kdvTutar2);

    }
}
