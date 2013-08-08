
public class WeatherForecast {

	public String forecast(){
		Weather weather = new Weather();
		weather.setCloudy(true);
		weather.setRainy(false);
		if(weather.isCloudy==true)
				return "Cloudy";
		else if(weather.isRainy==true)
			return "Rainy";
		else
			return null;
	}

}

