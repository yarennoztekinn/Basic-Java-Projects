import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		// UYGUN TC KİMLİK GİRDİ Mİ KONTROL
		// GİRDİYSE SIRA NUMARASI VEREN SİSTEM
		
		// tc kimlik numarasının uygun bir biçimde girilip girilmediğini kontrol etmedi
		// harf içeriyor olabilir yada 11 haneden eksik veya fazla sayı içeriyor olabilir.
		// gereken kontrolleri sağlamak için encapsulation kullanırız.
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("welcome to the control box!");
		
		System.out.print("Enter your identification number to get in line at the box office: ");
		String identificationNumber1 = scanner.nextLine();
		
		ID IDobj = new ID();
		IDobj.setIdentificationNumber(identificationNumber1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
