
public class TemperatureConverter {
	public String convertTemp(int temperature, char convertTo){
		int temperatureResult;
		if (convertTo=='F'){
			temperatureResult=(temperature*9/5)+32;
		}
		else {
			temperatureResult=(temperature-32)*5/9;
		}
		String res=Integer.toString(temperatureResult);
		return res;
	}
	public static void main(String[]args){
		String myConvert;
		TemperatureConverter tc=new TemperatureConverter();
		myConvert=tc.convertTemp(40, 'F');
		System.out.println(myConvert);
		
	}
}
