package app;

public class Wanita{
	
	public static void keterangan ( double hasil) {
		
		if(hasil < 18) {
			
			System.out.println("Anda Kurang Berat badan/kurus");
			
		}else if (hasil <25){
			
			System.out.println("Berat Badan Anda Ideal/Normal");
			
		}else if (hasil <27){
			
			System.out.println("Anda Kelebihan Berat Badan");
			
		}else {
			
			System.out.println("Obesitas , Anda Harus melakukan Kegiatan Program menurunkan Berat Badan");
			
		}
			
			
			
	}
	
}