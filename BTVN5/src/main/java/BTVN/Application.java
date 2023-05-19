package BTVN;

public class Application {
    public static void main(String[] args) {
        Weather weather = new WeatherCityInVietNam();

        String city = "Hà Nội";
        String weatherInfo = weather.getWeather(city);
        System.out.println(city);
        System.out.println(weatherInfo);

        weather = new OpenWeatherAdapter();

        city = "New York";
        weatherInfo = weather.getWeather(city);
        System.out.println(city);
        System.out.println(weatherInfo);
    }
}