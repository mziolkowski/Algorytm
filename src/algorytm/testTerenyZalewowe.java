package Moje;
import java.io.File;
import java.util.ArrayList;

public class testTerenyZalewowe {
	public static void main(String[] args) {
//		Algorytm test = new Algorytm();
//		test.MakeCalculations();
//		test.wyswietlenie();
		
//		Algorytm_2 test2 = new Algorytm_2();
//		test2.MakeCalculations_2();
		
//		Algorytm_3 test3 = new Algorytm_3();
//		test3.Map();
//		Integer[][] calculation = test3.Calculation();
//		test3.Display(calculation);
		
		Algorytm_4 test4 = new Algorytm_4();
		test4.CoordinateList();
		test4.Map();
		
		Integer[][] netMap_test = test4.NetMap();
		Boolean[][] booleanNetMap_test = test4.BooleanNetMap();
		ArrayList<Integer> list1_test = test4.CoordinateList();
		
		test4.Calculation(netMap_test, list1_test, booleanNetMap_test);
		test4.Display(netMap_test, booleanNetMap_test);
		
		//wyswietlenie_tablicy wys = new wyswietlenie_tablicy();
		//wys.wyswietlenie();
		//File folder = new File("C:\\Users\\User1\\Documents\\DTED2");
		//fileFromFolder(folder);
	}


}
