public class ObserverDesignPatternTest {
 
    public static void main(String[] args) throws InterruptedException {
 
        WeatherBroadcast weatherBroadcast = new WeatherBroadcast();
 
        Observer newsPaperAgency = new NewsPaperAgency();
        Observer newsChannel = new NewsChannel();
        Observer weatherInfoWebsite = new WeatherInfoWebsite();
 
        weatherBroadcast.addObserver(newsPaperAgency);
        weatherBroadcast.addObserver(newsChannel);
        weatherBroadcast.addObserver(weatherInfoWebsite);
         
        weatherBroadcast.temperatureChanged(30);
         
        System.out.println("\nAfter 10 seconds temperature changes to 33 degrees...\n");
         
        Thread.sleep(10000);
         
        weatherBroadcast.temperatureChanged(33);
 
    }
 
}