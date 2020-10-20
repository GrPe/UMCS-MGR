import DTO.DailyWeather;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openweathermap.org/data/2.5/weather?lat=52.229676&lon=21.012229&appid=e524a4dcd890c13216d55e800480bb7b&lang=pl&units=metric"))
                .build();

        var response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();

        ObjectMapper objectMapper = new ObjectMapper();

        try
        {
            DailyWeather weather = objectMapper.readValue(response, DailyWeather.class);

            System.out.println("Lokacja: " + weather.getName());
            System.out.println(weather.getWeather().get(0).getMain() + " - " + weather.getWeather().get(0).getDescription());
            System.out.println("Maksymalna Temperatura: " + weather.getMain().getTemp() + "C");
            System.out.println("Cisnienie: " + weather.getMain().getPressure());
            System.out.println("Wilgotność: " + weather.getMain().getHumidity() + "%");
        }
        catch(Throwable ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}