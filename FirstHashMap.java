import java.util.HashMap;
import java.util.Set;

public class FirstHashMap{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Jesus loves me", "Jesus loves me this I know" );
        trackList.put("Reckless Love", "Love is unconditional");
        trackList.put("Oceans", "Spirit lead me");
        trackList.put("Jesus lover of my Soul", "Worship you my Lord");

        String lyric= trackList.get("Jesus loves me");
        System.out.println("The song lyric is: " + lyric);
        
//need to import Set in order to use set or can do second way with just .keySet without import of Set:

        // Set<String> Lyrics = trackList.keySet();
        // for(String Track : Lyrics)
        for(String Track: trackList.keySet()){
            System.out.println("Track: " + Track);
            System.out.println("Lyrics: " + trackList.get(Track));
        }
    }
}