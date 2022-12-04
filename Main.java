/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int mat, fizik,kimya,turkce,tarih,muzik;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Matematik Notunuz : ");
		mat = inp.nextInt();
		
		System.out.print("Fizik Notunuz : ");
		fizik= inp.nextInt();
		
		System.out.print("Kimya Notunuz : ");
		kimya= inp.nextInt();
		
		System.out.print("turkce Notunuz : ");
		turkce= inp.nextInt();
		
		System.out.print("tarih Notunuz : ");
		tarih= inp.nextInt();
		
		System.out.print("muzik Notunuz : ");
		muzik= inp.nextInt();
		
		int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
		double sonuc = toplam/6.0;
		System.out.println("ortalamanız: " + sonuc);
	
		boolean x= sonuc>=60;
        String str = x ? "Tebrikler Geçtiniz." : "Maalesef Sınıfta Kaldınız";
        System.out.println(str);

	}
}


