public class WeatherInfoWebsite implements Observer {
 
    @Override
    public void update(int temperature) {
 
        System.out.println("Weather Info Websites gets current temperature as: "
                + temperature + " degrees");
 
    }
 
}