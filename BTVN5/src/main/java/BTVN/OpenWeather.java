package BTVN;

class OpenWeather implements Weather {
    private OpenWeatherMap openWeatherMap;

    public OpenWeather() {
        openWeatherMap = new OpenWeatherMap();
    }

    @Override
    public String getWeather(String city) {
        return openWeatherMap.getWeather(city);
    }
}