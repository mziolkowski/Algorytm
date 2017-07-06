package Moje;
import java.awt.Cursor;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.avlist.AVList;
import gov.nasa.worldwind.data.DataRaster;
import gov.nasa.worldwind.data.DataRasterReader;
import gov.nasa.worldwind.data.DataRasterReaderFactory;
import gov.nasa.worldwind.geom.Sector;
import gov.nasa.worldwindx.examples.ApplicationTemplate;
import gov.nasa.worldwindx.examples.dataimport.ImportElevations;
import gov.nasa.worldwindx.examples.dataimport.ImportImagery;
import gov.nasa.worldwindx.examples.util.ExampleUtil;

public class Algorytm {
	
    
	int slat = 0; 				// szerokosc geo. zr. wody
	int slon = 0;				// dlugosc geo. zr. wody
	int rtwsp_geo;				// wspolrzedna geo. prawego-gornego rogu analizowanego obszaru
	int lbwsp_geo;				// wspolrzedna geo. lewego-dolnego rogu analizowanego obszaru
	int swsp_geo = 2;			// wysokosc zr. wody
	int hs = 0;						// wysokosc poczatkowa zr. wody
	int he = 0;					// wysokosc koncowa zr. wody
	int interwal; 						// interwal przyrostu wody
	int n;
	int m;
	int wiersz;
	int kolumna;
	int wys_punktu = 6;
	int tmp_swsp_geo;			//tymczasowa wys. zr. wody
	
	int netMap[] = new int[n];
	Integer l1[][] = new Integer[3][3]; // wiersze kolumny
	Integer l2[][] = new Integer[3][3];
	
	public void MakeCalculations() {

		
		 
		
			
			do{	
				for(int j = 0; j < l1.length; j++){
					for(int k = 0; k < l1[j].length; k++){
						if(wys_punktu >= swsp_geo) {
							System.out.println("Punkt nie jest zalany");
							System.out.println("wysokosc punktu " + wys_punktu + " j" +j + " k" + k);
							l1[j][k] = wys_punktu;
							l1[j][k] = null;
							wys_punktu -= 3;
							
						} else { 
							for(m = 0; m < l2.length; m++){
								for(n = 0; n < l2[m].length; n++){
									if(wys_punktu < swsp_geo){
									System.out.println("Punkt jest zalany");
									l2[m][n] = wys_punktu;
									System.out.println("wysokosc punktu " + wys_punktu + " m" + m + " n" + n);
									System.out.println(l2[m][n]);
									wys_punktu += 1;
									}
								}
								
							}
						}
					}
				}
			
				wys_punktu += 4;
				swsp_geo += 2;
						
				for(int j = 0; j < l2.length; j++){
					for(int k = 0; k < l2[j].length; k++){
						if(wys_punktu >= swsp_geo) {
							System.out.println("Punkt nie jest zalany");
							System.out.println("wysokosc punktu " + wys_punktu + " j" +j + " k" + k);
							l2[j][k] = wys_punktu;
							l2[j][k] = null;
							wys_punktu -= 3;
							
						} else { 
							for(m = 0; m < l1.length; m++){
								for(n = 0; n < l1[m].length; n++){
									if(wys_punktu < swsp_geo){
									System.out.println("Punkt jest zalany");
									l1[m][n] = wys_punktu;
									System.out.println("wysokosc punktu " + wys_punktu + " m" + m + " n" + n);
									System.out.println(l1[m][n]);
									wys_punktu += 1;
									}
								}
								
							}
						}
					}
				}
				hs++;
				}while(hs <= he);
					
	}
				
public void wyswietlenie() {
	
		        System.out.println("\nTablica l1");
		        // Wyœwietlenie zawartoœci ca³ej tablicy l1
		        for(int i=0; i<l1.length; i++){ // "Przejœcie" przez wiersze
		            for(int j=0; j<l1[i].length; j++) // "Przejœcie" przez kolumny
		                System.out.print(l1[i][j]+" ");
		            	System.out.println(); // Koniec kolumn w danym wierszu - nowa linia
		        }
		      
		        System.out.println("\nTablica l2");
		        // Tworzenie tablicy dwuwymiarowej:
		        
		 
		        // Wyœwietlenie zawartosci calej tablicy l2
		        for(int h=0; h<l2.length; h++){ // "Przejœcie" przez wiersze
		            for(int j=0; j<l2[h].length; j++) // "Przejœcie" przez kolumny
		                System.out.print(l2[h][j]+" ");
		            	System.out.println(); // Koniec kolumn w danym wierszu - nowa linia
		        }
			
}
		        
}
