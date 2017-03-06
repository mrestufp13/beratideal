import app.Rumus;
import app.Pria;
import app.Wanita;
import java.util.Scanner;

class Pengukuran{
	
	
	
	public static void main (String[] args) {
		
		Scanner ketik = new Scanner(System.in);
		double tinggi, berat;
		int jenis;
		
		System.out.print("Masukan tinggi Anda (meter) : ");
		tinggi = ketik.nextDouble();
		
		System.out.print("Masukan Berat Badan Anda (Kg) : ");
		berat = ketik.nextDouble();
		
		System.out.println("Jenis Kelamin (1) Pria (2) Wanita");
		jenis = ketik.nextInt();
		
		
		Rumus hitung = new Rumus ();
		double hasil = hitung.pengukuran (tinggi, berat);
		
		if (jenis == 1){
			
			Pria.keterangan(hasil); 
			
		} else if (jenis == 2){
			
			Wanita.keterangan(hasil);
			
		}else{
			
			System.out.println("Jenis Kelamin apa Kamu ?!");
			
		}
		
	}
	
}