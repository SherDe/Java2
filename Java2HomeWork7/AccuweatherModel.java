package Java2HomeWork7;

import org.omg.CORBA.Request;

import javax.xml.ws.Response;
import java.io.IOException;

public class AccuweatherModel implements WeatherModel {
    private static final String PROTOCOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String CURRENT_CONDITIONS = "currentconditions";
    private static final String VERSION = "v1";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final String API_KEY = "pUvsci2SGknRchiLzrTkjopdujwh8UA4";
    static OkHttpClient okHttpClient = new OkHttpClient();
    static ObjectMapper objectMapper = new ObjectMapper();
    private Object httpUr

    public void getWeather(String selectedCity, Period period) throws IOException {
        if (period == Period.NOW) {
            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_HOST)
                    .addPathSegment(CURRENT_CONDITIONS)
                    .addPathSegment(VERSION)
                    .addPathSegment(getCityKey(selectedCity))
                    .addQueryParameter("apikey", API_KEY)
                    .build();

            Request request = new Request.Builder()
                    .url(httpUrl)
                    .build();

            Response response = okHttpClient.newCall(request).execute();
            String responseString = response.body().string();
            String weatherText = objectMapper.readTree(responseString).get(0).at("/WeatherText").asText();
            Integer degrees = objectMapper.readTree(responseString).get(0).at("/Temperature/Metric/Value").asInt();
            Weather weather = new Weather(selectedCity, weatherText, degrees);
            System.out.println(weather);
            DataBaseRepository dataBaseRepository = new DataBaseRepository();
            dataBaseRepository.saveWeather(weather);

        }
        if (period == Period.FIVE_DAYS) {
        }
    }

    public String getCityKey(String city) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegments(LOCATIONS)
                .addPathSegments(VERSION)
                .addPathSegments(CITIES)
                .addPathSegments(AUTOCOMPLETE)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", city)
                .build();



        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();

        String cityKey = objectMapper.readTree(responseBody).get(0).at("/Key").asText();
        return cityKey;
    }

    private class Builder {
        Request request = new Builder()
                .url(httpUrl)
                .build();
    }
}