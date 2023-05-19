package BTVN;
import java.util.Random;
class OpenWeatherMap implements Weather {
    @Override
    public String getWeather(String city) {
        int temperature = generateRandomTemperature();
        int humidity = generateRandomHumidity();
        int wind = generateRandomWind();
        int pressure = generateRandomPressure();
        int seaLevel = generateRandomSeaLevel();

        return "Nhiệt độ: " + temperature + "°F\nĐộ ẩm: " + humidity + "%\nGió: " + wind + " km/h\nÁp suất: " +
                pressure + " hPa\nMực biển: " + seaLevel + " m";
    }

    private int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(51) - 10;
    }

    private int generateRandomHumidity() {
        Random random = new Random();
        return random.nextInt(41) + 40;
    }

    private int generateRandomWind() {
        Random random = new Random();
        return random.nextInt(71);
    }

    private int generateRandomPressure() {
        Random random = new Random();
        return random.nextInt(101) + 900;
    }

    private int generateRandomSeaLevel() {
        Random random = new Random();
        return random.nextInt(11) + 10;
    }
}
