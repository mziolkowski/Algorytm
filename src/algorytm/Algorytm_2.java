package Moje;
import java.awt.Cursor;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Algorytm_2 {
	
    
	int slat = 0; 					// szerokosc geo. zr. wody
	int slon = 0;					// dlugosc geo. zr. wody
	int rtwsp_geo;				// wspolrzedna geo. prawego-gornego rogu analizowanego obszaru
	int lbwsp_geo;				// wspolrzedna geo. lewego-dolnego rogu analizowanego obszaru
	int swsp_geo = 2;				// wysokosc zr. wody
	int hs;						// wysokosc poczatkowa zr. wody
	int he;						// wysokosc koncowa zr. wody
	int i; 						// interwal przyrostu wody
	int n;
	int m;
	int wiersz;
	int kolumna;
	int wys_punktu = 6;
	int tmp_swsp_geo;			//tymczasowa wys. zr. wody
	
	public void MakeCalculations_2() {

		int netMap[] = new int[n];
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
//		int l1[][] = new int[3][3]; // wiersze kolumny
//		int l2[][] = new int[3][3];
		 
		
				//l1[slat][slon] = swsp_geo;
				
		for(int j=0; j<l1.size(); j++){ 
            for(int k=0; k<l1.size(); k++){
            	if(wys_punktu >= swsp_geo) {
					System.out.println("Punkt nie jest zalany");
					System.out.println("wysokosc punktu " + wys_punktu);
					l1.add(wys_punktu);
					wys_punktu -= 1;
	            } else {
		            	for(int m=0; m<l2.size(); m++){ // "Przejœcie" przez wiersze
				            for(int n=0; n<l2.size(); n++) // "Przejœcie" przez kolumny
				            	l2.add(wys_punktu);
				            	System.out.println("Punkt jest zalany");
								System.out.println("wysokosc punktu " + wys_punktu);
								//System.out.println(l2[m][n]);
								wys_punktu -= 1;
		            	
		            	}	
	             
				}
			}
		}

		        
		        System.out.println("\nTablica l1");
		        // Wyœwietlenie zawartoœci ca³ej tablicy l1
		        for(int i=0; i<l1.size(); i++){ // "Przejœcie" przez wiersze
		            for(int j=0; j<l1.size(); j++) // "Przejœcie" przez kolumny
		                System.out.print(l1.get(i)+" ");
		            	System.out.println();
		        }
		      
		        System.out.println("\nTablica l2");
		        // Wyœwietlenie zawartosci calej tablicy l2
		        for(int i=0; i<l2.size(); i++){ // "Przejœcie" przez wiersze
		            for(int j=0; j<l2.size(); j++) // "Przejœcie" przez kolumny
		                System.out.print(l2.get(i)+" ");
		            	System.out.println();
		        }
			
		        
	}
}
