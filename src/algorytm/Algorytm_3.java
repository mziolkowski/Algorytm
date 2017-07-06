package Moje;

import java.util.Random;
import java.util.Scanner;

public class Algorytm_3 {
	
	int slat; 							// szerokosc geo. zr. wody
	int slon;							// dlugosc geo. zr. wody
	int rtwsp_geo_lat;					// szerokosc geo. prawego-gornego rogu analizowanego obszaru
	int rtwsp_geo_lon;					// dlugosc geo. prawego-gornego rogu analizowanego obszaru
	int lbwsp_geo_lat;					// szerokosc geo. lewego-dolnego rogu analizowanego obszaru
	int lbwsp_geo_lon;					// dlugosc geo. lewego-dolnego rogu analizowanego obszaru
	int swsp_geo = 2;				// wysokosc zr. wody
	int hs;						// wysokosc poczatkowa zr. wody
	int he;						// wysokosc koncowa zr. wody
	int interwal = 2; 						// interwal przyrostu wody
	int length_tab;						//dlugosc tablicy
	int width_tab;						//szerokosc tablicy

	int groundHeight = 15;
	int maxPoziomWody = 10;
	
	Integer[][] tab1 = new Integer[3][3];
	Integer[][] tab2 = new Integer[3][3];
	
	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	
	public void Map() {
		
		//Wskazanie prawego-gornego punktu
		System.out.println("Podaj szerokosc geograficzna prawego-gornego punktu");
		rtwsp_geo_lat = scan.nextInt();
		System.out.println("Podaj dlugosc geograficzna prawego-gornego punkty");
		rtwsp_geo_lon = scan.nextInt();
		
		//Wskazanie lewego-dolnego punktu
		System.out.println("Podaj szerokosc geograficzna lewego-dolnego punktu");
		lbwsp_geo_lat = scan.nextInt();
		System.out.println("Podaj dlugosc geograficzna lewego-dolnego punkty");
		lbwsp_geo_lon = scan.nextInt();
		
		//Wskazanie punktu zr. wody
		System.out.println("Podaj szerokosc geograficzna zr. wody z zakresu " + rtwsp_geo_lat + " " + lbwsp_geo_lat);
		slat = scan.nextInt();
		System.out.println("Podaj dlugosc geograficzna zr. wody z zakresu " + rtwsp_geo_lon + " " + lbwsp_geo_lon);
		slon = scan.nextInt();
		
		
		//Okreslenie wymiaru tablicy
		if(rtwsp_geo_lat < lbwsp_geo_lat) {
			do{
				rtwsp_geo_lat++;
				length_tab = length_tab + 1;
			}while (rtwsp_geo_lat <= lbwsp_geo_lat);
			
		} else {
			do{
				lbwsp_geo_lat++;
				length_tab = length_tab + 1;
			}while (lbwsp_geo_lat <= rtwsp_geo_lat);
		}	
		
		if(rtwsp_geo_lon < lbwsp_geo_lon) {
			do{
				rtwsp_geo_lon++;
				width_tab = width_tab + 1;
			}while (rtwsp_geo_lon <= lbwsp_geo_lon);
			
		} else {
			do{
				lbwsp_geo_lon++;
				width_tab = width_tab + 1;
			}while (lbwsp_geo_lon <= rtwsp_geo_lon);
		}	
		
	}
	
	
	public Integer[][] Calculation() {
		
		tab1[1][1] = swsp_geo; //Przypisanie wysokosci zr. wody do P1
		Integer[][] netMap = new Integer[length_tab - 1][width_tab - 1];
		
		//Uzupelnienie tablicy losowymi liczbami
		for(int i = 0; i <= netMap.length - 1; i++) { 
			for(int j = 0; j <= netMap.length - 1; j++) {
				netMap[i][j] = gen.nextInt(9) + 1;
			}
		}
		
		
		netMap[slat][slon] = swsp_geo;
//		System.out.println(tab1[1][1] + " " + netMap[slat][slon]);
		
		for(int i = 0; i <= netMap.length - 1; i++) {
			for(int j = 0; j <= netMap.length - 1; j++) {
				
				if(netMap[slat - 1][slon - 1] <= swsp_geo) {
					
					for(int p = 0; p <= tab2.length - 1; p++) { 
						for(int k = 0; k <= tab2[p].length - 1; k++) {
								tab2[i][j] = netMap[slat - 1][slon - 1];
//								if(tab2[i][j] == maxPoziomWody) break;	
						}
					}
				} else {
					tab1[i][j] = netMap[slat - 1][slon - 1];
				}
			}
		}
		
//		
//			for(int i = 0; i <= tab1.length - 1; i++) { 
//				for(int j = 0; j <= tab1.length - 1; j++) {
//					if(swsp_geo < groundHeight) {
//						tab1[i][j] = swsp_geo;
//						
//					} else {
//						for(int p = 0; p <= tab2.length - 1; p++) { 
//							for(int k = 0; k <= tab2[p].length - 1; k++) {
//									System.out.println("Teren jest zalany " + poziomWody + " " + i + " " + j);
//									tab2[i][j] = swsp_geo;
//									if(tab2[i][j] == maxPoziomWody) break;
//									
//							}
//						}
//					}
//				}
//			}
			return netMap;
	}
	
	public void Display(Integer[][] netMap2) {
		
		System.out.println(" ");
		System.out.println("TABLICA 1 -  Teren nie zalany");
		for(int m = 0; m < tab1.length; m++) {
			for(int n = 0; n < tab1[m].length; n++) 
				System.out.print(tab1[m][n] + " ");
				System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println("TABLICA 2 - teren zalany");
		for(int m = 0; m < tab2.length; m++) {
			for(int n = 0; n < tab2[m].length; n++) 
				System.out.print(tab2[m][n] + " ");
				System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println("TABLICA netMap");
		for(int m = 0; m < netMap2.length; m++) {
			for(int n = 0; n < netMap2[m].length; n++) 
				System.out.print(netMap2[m][n] + " ");
				System.out.println(" ");
		}
		
	}
}