package algorytm;
public class MakingCalculation {

	int poziomWody = 2;
	int wysokoscTerenu = 5;
	int maxPoziomWody = 10;
	
	Integer[][] tab1 = new Integer[3][3];
	Integer[][] tab2 = new Integer[3][3];
	
	public void Calculation() {
			for(int i = 0; i <= tab1.length - 1; i++) { 
				for(int j = 0; j <= tab1.length - 1; j++) {
					if(poziomWody < wysokoscTerenu) {
						tab1[i][j] = poziomWody;
						System.out.println("Teren nie jest zalany " + poziomWody + " " + i + " " + j);
						poziomWody += 1;
					} else {
//						for(int p = 0; p <= tab2.length - 1; p++) { 
//							for(int k = 0; k <= tab2[p].length - 1; k++) {
									System.out.println("Teren jest zalany " + poziomWody + " " + i + " " + j);
									tab2[i][j] = poziomWody;
									//if(tab2[i][j] == maxPoziomWody) break;
									poziomWody -=3;
									
//							}
//						}
					}
				}
			}
	}
	
	public void Display() {
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
	}
}
