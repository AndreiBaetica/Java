package APIDocs;
class Plant {
	public static final int ID = 7;
	private String name;
	public String getData(){
		String data = "awfhj"+calculateGrowthForecast();
		return data;
	}
	private int calculateGrowthForecast(){
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class application8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
