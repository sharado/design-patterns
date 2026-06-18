package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        // Register observers
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather changes
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
        weatherStation.setWeather("Cloudy");

        // Remove one observer
        weatherStation.removeObserver(tvDisplay);

        // Notify remaining observer
        weatherStation.setWeather("Windy");
    }
}
