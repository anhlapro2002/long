package BTVN;
import java.util.Random;
class WeatherCityInVietNam implements Weather {
    @Override
    public String getWeather(String city) {
        if (isCityInVietNam(city)) {
            int temperature = generateRandomTemperature();
            int humidity = generateRandomHumidity();
            return "Nhiệt độ: " + temperature + "°C\nĐộ ẩm: " + humidity + "%";
        } else {
            return "Không hỗ trợ tra cứu thời tiết cho thành phố nước ngoài.";
        }
    }

    private boolean isCityInVietNam(String city) {
        return true;
    }

    private int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(11) + 30;
    }

    private int generateRandomHumidity() {
        Random random = new Random();
        return random.nextInt(41) + 40;
    }
}

