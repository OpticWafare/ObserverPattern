public class NewsPaperAgency implements Observer {
 
    @Override
    public void update(int temperature) {
 
        System.out.println("News Paper Agencies gets current temperature as: "
                + temperature + " degrees");
 
    }
 
}