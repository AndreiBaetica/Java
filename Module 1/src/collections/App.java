package collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
	public static String[] vehicles = {
			"ambulance", "helicopter","lifeboat"
	};
	public static String[][] drivers = {
			{"Fred","Sue","Pete"},
			{"Sue","Dick","Bob","Fred"},
			{"Pete","Mary","Bob"},	
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Set<String>> personnel = new HashMap<>();
		for(int i=0; i<vehicles.length; i++){
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];
			Set<String> driverSet = new LinkedHashSet<String>();
			for(String driver: driverList){
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet);
		}
		Set<String> driverList = personnel.get("helicopter");
		for(String driver: driverList){
			System.out.println(driver);
		}
		
	}

}
