public class NewsChannel implements Observer {
 
    @Override
    public void update(int temperature) {
 
        System.out.println("News Channel gets current temperature as: "
                + temperature + " degrees");
 
    }
 
}