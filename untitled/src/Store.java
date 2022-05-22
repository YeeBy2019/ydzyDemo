import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author YeeBy
 * @version 1.0
 * Powered By IDEA
 */
public class Store {
    private List<Card> recentCards;
    private HashMap<Integer,HashMap<Integer,Integer>> gailv;
    private HashMap<Integer,ArrayList<Card>> totalCards;
    public void setGailv(HashMap<Integer,HashMap<Integer,Integer>> gailv){
        this.gailv = gailv;
    }
    public Store(HashMap<Integer,HashMap<Integer,Integer>> gailv,HashMap<Integer,ArrayList<Card>> totalCards){
        this.gailv = gailv;
        this.totalCards = totalCards;
        if(recentCards == null){
            recentCards = new ArrayList<>();
            for(int i = 1;i<=5;i++){
                recentCards.add(getOneRandomCard(1));
            }
        }
    }
    public void refreshStore(int level){
        if(recentCards == null){
            recentCards = new ArrayList<>();
        }
        for(int i = 1;i<=5;i++){
            recentCards.add(getOneRandomCard(level));

        }
    }

    public Card getOneRandomCard(int level){
        HashMap<Integer,Integer> hmp = (HashMap<Integer, Integer>) this.gailv.get(level);
        Random r = new Random();
        int idx = r.nextInt(100);
        int sum = 0;
        int getCardLevel = -1;
        for(int i = 1;i<=5;i++){
            sum += hmp.get(i);
            if(idx <= sum){
                getCardLevel = i;
                break;
            }
        }
        ArrayList<Card> arr = (ArrayList<Card>) totalCards.get(getCardLevel);
        Card returnCard = arr.get(r.nextInt(arr.size()));
        return returnCard;
    }
}
