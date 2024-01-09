import java.util.Arrays;

public class Newsfeed {
    String[] topics;
    public Newsfeed(String[] newsFeedTopics) {
        topics = newsFeedTopics;
    }
    public static void main(String[] args){
        Newsfeed feed;
        if (args[0].equals("Human")){
            String[] array = {"Geography", "History"};
            feed = new Newsfeed(array);
        } else if (args[0].equals("Robot")) {
            String[] array = {"AI", "ML"};
            feed = new Newsfeed(array);
        } else {
            String[] array = {"General Science", "General Knowledge"};
            feed = new Newsfeed(array);
        }
        System.out.println(Arrays.toString(feed.topics));
    }
}
