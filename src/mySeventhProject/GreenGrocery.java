package mySeventhProject;
import java.util.Scanner;

public class GreenGrocery {
	public static void main(String[]args) {
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5;
		Scanner input=new Scanner(System.in);
		System.out.print("Lütfen aldığınız armut miktarını kg cinsinden giriniz:");
		double armutMiktari=input.nextDouble();
		System.out.print("Lütfen aldığınız elma miktarını kg cinsinden giriniz:");
		double elmaMiktari=input.nextDouble();
		System.out.print("Lütfen aldığınız domates miktarını kg cinsinden giriniz:");
		double domatesMiktari=input.nextDouble();
		System.out.print("Lütfen aldığınız muz miktarını kg cinsinden giriniz:");
		double muzMiktari=input.nextDouble();
		System.out.print("Lütfen aldığınız patlıcan miktarını kg cinsinden giriniz:");
		double patlıcanMiktari=input.nextDouble();
		double totalCost=armut*armutMiktari+elma*elmaMiktari+domates*domatesMiktari+muz*muzMiktari+patlıcan*patlıcanMiktari;
		System.out.println("Toplam maliyet:"+totalCost);
	}

}
