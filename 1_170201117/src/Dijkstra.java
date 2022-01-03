import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dijkstra {
		
	public static final int Duraksiz = -1;
	public static final ArrayList<Integer> ugrananSehirler = new ArrayList<Integer>();
	public static int toplamYol = 0;
	
	public static void dijkstra(int[][] matris, int baslangic, int hedef) {
		
		int dugumSayisi = matris[0].length;
		
		int enKisaYollar[] = new int[dugumSayisi];
		
		boolean kesinMi[] = new boolean[dugumSayisi];
		
		for(int i = 0; i < dugumSayisi; i++) {
			enKisaYollar[i] = Integer.MAX_VALUE;
			kesinMi[i] = false;
		}
		
		enKisaYollar[baslangic] = 0;
		
		int duraklar[] = new int[dugumSayisi];
		
		duraklar[baslangic] = Duraksiz;
		
		for(int i = 1; i < dugumSayisi; i++) {
			
			int enYakin = -1; 
            int enKisaYol = Integer.MAX_VALUE;
            
            for(int j = 0; j < dugumSayisi; j++) {
            	if(kesinMi[j] != true && enKisaYollar[j] < enKisaYol) {
            		
            		enYakin = j;
            		enKisaYol = enKisaYollar[j];
            	}
            }
            
            kesinMi[enYakin] = true;
            
            for(int k = 0; k < dugumSayisi; k++) {
            	int uzaklik = matris[enYakin][k];
            	
            	if(uzaklik > 0 && (enKisaYol + uzaklik) < enKisaYollar[k] ) {
            		duraklar[k] = enYakin;
            		enKisaYollar[k] = enKisaYol + uzaklik;
            	}
            }
		}
		
		
		yazdir(baslangic, enKisaYollar, duraklar, hedef);
		
	}
	
	public static void yazdir(int baslangic, int yollar[], int duraklar[], int hedef) {
		
		 int dugumSayisi = yollar.length; 
		         
	        for(int i = 0; i < dugumSayisi; i++) {
	        	
	        	if(i == hedef && i != baslangic ) {

	                System.out.print("\n" + (baslangic+1) + " -> ");
	                String str1 = "\n" + (baslangic+1) + " -> ";
	                dosyayaYazdir("cikti.txt", str1);	                
	                
	                System.out.print((i+1) + " \t\t ");
	                String str2 = (i+1) + " \t\t ";
	                dosyayaYazdir("cikti.txt", str2);
	                
	                System.out.print(yollar[i] + "\t\t"); 
	                String str3 = yollar[i] + "\t\t";
	                toplamYol = toplamYol + yollar[i];
	                dosyayaYazdir("cikti.txt", str3);
	                
	                yolYazdir(i, duraklar);
	        		
	        	}
	        	
	       }	        
	}
	
	public static void dosyayaYazdir(String dosyaAdi,String str) {
		try { 
			
            BufferedWriter yazici = new BufferedWriter(new FileWriter(dosyaAdi, true)); 
            yazici.write(str); 
            yazici.close(); 
        } 
        catch (IOException e) { 
        	JOptionPane.showMessageDialog(null, "exception occoured" + e); 
        } 
	}	
	
	public static void yolYazdir(int hedefSehir, int duraklar[]) {
		
		if (hedefSehir == Duraksiz) 
        { 
            return; 
        } 
				
		yolYazdir(duraklar[hedefSehir], duraklar);
		System.out.print(hedefSehir+1 + " ");
		ugrananSehirler.add(hedefSehir);
		String str = hedefSehir+1 + " ";
		dosyayaYazdir("cikti.txt", str);
	}	

}
