package Moje;
import java.io.File;
import java.net.Inet4Address;
import java.util.ArrayList;

import com.sun.javafx.css.CalculatedValue;

public class testTerenyZalewowe extends Algorytm_4{
	int slat;
	int slon;
	public static void main(String[] args) {
		
		Algorytm_4 test4 = new Algorytm_4();
		test4.CoordinateList();
		test4.Map();
		
		Integer[][] netMap_test = test4.NetMap();
		Boolean[][] booleanNetMap_test = test4.BooleanNetMap();
		String[][] waterDirection_test = test4.WaterDirection();
		ArrayList<Integer> list1_test = test4.CoordinateList();
		ArrayList<Integer> wetList_test = test4.WetPoints();
		ArrayList<Integer> listOfPoints_test = test4.ListOfPoints();
		
		test4.Calculation(netMap_test, list1_test, wetList_test, booleanNetMap_test, listOfPoints_test, waterDirection_test);
		
		do{
		test4.Calculation2(netMap_test, list1_test, wetList_test, booleanNetMap_test, listOfPoints_test, waterDirection_test);
		}while(listOfPoints_test.isEmpty() == false && wetList_test.isEmpty() == false);
		
		test4.Display(netMap_test, booleanNetMap_test, waterDirection_test);
		
	}


}
