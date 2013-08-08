public class WeatherDisplay {
	public static void main(String args[]) {
		WeatherForecast weatherForecast = new WeatherForecast();
		String output = weatherForecast.forecast();
		output=checkTime(output);

		System.out.println(output);
	}

	public static String checkTime(String output) {

		int time = (int)( Math.random()*24);
		
		if (time >= 0 && time <= 12) {
			output = output.concat(" Day ");
		} else if (time >= 12 && time <= 24) {
			output = output.concat(" Night ");
		}
return output;
	}
}
