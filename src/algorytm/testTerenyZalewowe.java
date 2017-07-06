package Moje;
import java.io.File;

public class testTerenyZalewowe {
	public static void main(String[] args) {
//		Algorytm test = new Algorytm();
//		test.MakeCalculations();
//		test.wyswietlenie();
		
//		Algorytm_2 test2 = new Algorytm_2();
//		test2.MakeCalculations_2();
		
		Algorytm_3 test3 = new Algorytm_3();
		test3.Map();
		Integer[][] calculation = test3.Calculation();
		test3.Display(calculation);
		
		//wyswietlenie_tablicy wys = new wyswietlenie_tablicy();
		//wys.wyswietlenie();
		//File folder = new File("C:\\Users\\User1\\Documents\\DTED2");
		//fileFromFolder(folder);
	}


}
