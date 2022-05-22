import java.util.*;

/**
 * @author YeeBy
 * @version 1.0
 * Powered By IDEA
 */
public class Application {
    public static HashMap<Integer, HashMap<Integer,Integer>> gailv = new HashMap<>();
    public static HashMap<Integer,ArrayList<Card>> totalCards = new HashMap<>();
    public static void initGailv(){
        HashMap<Integer,Integer> hmp1 = new HashMap<>();
        hmp1.put(1,100);hmp1.put(2,0);hmp1.put(3,0);hmp1.put(4,0);hmp1.put(5,0);
        HashMap<Integer,Integer> hmp2 = new HashMap<>();
        hmp2.put(1,100);hmp2.put(2,0);hmp2.put(3,0);hmp2.put(4,0);hmp2.put(5,0);
        HashMap<Integer,Integer> hmp3 = new HashMap<>();
        hmp3.put(1,75);hmp3.put(2,25);hmp3.put(3,0);hmp3.put(4,0);hmp3.put(5,0);
        HashMap<Integer,Integer> hmp4 = new HashMap<>();
        hmp4.put(1,50);hmp4.put(2,30);hmp4.put(3,20);hmp4.put(4,0);hmp4.put(5,0);
        HashMap<Integer,Integer> hmp5 = new HashMap<>();
        hmp5.put(1,40);hmp5.put(2,33);hmp5.put(3,25);hmp5.put(4,2);hmp5.put(5,0);
        HashMap<Integer,Integer> hmp6 = new HashMap<>();
        hmp6.put(1,25);hmp6.put(2,40);hmp6.put(3,30);hmp6.put(4,5);hmp6.put(5,0);
        HashMap<Integer,Integer> hmp7 = new HashMap<>();
        hmp7.put(1,19);hmp7.put(2,30);hmp7.put(3,35);hmp7.put(4,15);hmp7.put(5,1);
        HashMap<Integer,Integer> hmp8 = new HashMap<>();
        hmp8.put(1,15);hmp8.put(2,20);hmp8.put(3,35);hmp8.put(4,25);hmp8.put(5,5);
        HashMap<Integer,Integer> hmp9 = new HashMap<>();
        hmp9.put(1,10);hmp9.put(2,15);hmp9.put(3,30);hmp9.put(4,30);hmp9.put(5,15);
        gailv.put(1, hmp1);gailv.put(2, hmp2);gailv.put(3, hmp3);
        gailv.put(4, hmp4);gailv.put(5, hmp5);gailv.put(6, hmp6);
        gailv.put(7, hmp7);gailv.put(8, hmp8);gailv.put(9, hmp9);
    }
    public static void initStore(){
        for(int i = 1;i<=5;i++){
            totalCards.put(i,new ArrayList<>());
        }
        Card card01 = new Card("辛吉德",new ArrayList<String>(){{
            add("炼金科技");
            add("发明家");
        }},1,1);
        Card card02 = new Card("图奇",new ArrayList<String>(){{
            add("炼金科技");
            add("刺客");
        }},1,1);
        Card card03 = new Card("卡萨丁",new ArrayList<String>(){{
            add("变异战士");
            add("学者");
        }},1,1);
        Card card04 = new Card("凯特琳",new ArrayList<String>(){{
            add("执法官");
            add("狙神");
        }},1,1);
        Card card05 = new Card("魔腾",new ArrayList<String>(){{
            add("海克斯科技");
            add("刺客");
        }},1,1);
        Card card06 = new Card("嘉文四世",new ArrayList<String>(){{
            add("海克斯科技");
            add("强袭战士");
        }},1,1);
        Card card07 = new Card("布兰德",new ArrayList<String>(){{
            add("执事");
            add("黑魔法师");
        }},1,1);
        Card card08 = new Card("沃里克",new ArrayList<String>(){{
            add("炼金科技");
            add("挑战者");
        }},2,1);
        Card card09 = new Card("艾希",new ArrayList<String>(){{
            add("辛迪加");
            add("狙神");
        }},2,1);
        Card card10 = new Card("厄运小姐",new ArrayList<String>(){{
            add("赏金猎人");
            add("狙神");
        }},3,1);
        Card card11 = new Card("阿利斯塔",new ArrayList<String>(){{
            add("海克斯科技");
            add("巨像");
        }},4,1);
        Card card12 = new Card("泽丽",new ArrayList<String>(){{
            add("执事");
            add("狙神");
        }},5,1);
        Card card13 = new Card("金克丝",new ArrayList<String>(){{
            add("宿敌");
            add("极客");
            add("枪手");
        }},5,1);
        Card card14 = new Card("杰斯",new ArrayList<String>(){{
            add("未来守护者");
            add("执法官");
            add("发明家");
        }},5,1);
        ArrayList<Card> arr = new ArrayList<Card>(){{
            add(card01);
            add(card02);
            add(card03);
            add(card04);
            add(card05);
            add(card06);
            add(card07);
            add(card08);
            add(card09);
            add(card10);
            add(card11);
            add(card12);
            add(card13);
            add(card14);
        }};
        for(int i = 0;i<arr.size();i++){
            int cost = arr.get(i).getCost();
            if(cost == 1){
                ArrayList<Card> brr = totalCards.get((cost));
                for(int j = 1;j<=39;j++){
                    brr.add(arr.get(i));
                }
                totalCards.put(cost,brr);
            }else if(cost == 2){
                ArrayList<Card> brr = totalCards.get((cost));
                for(int j = 1;j<=26;j++){
                    brr.add(arr.get(i));
                }
                totalCards.put(cost,brr);
            }else if(cost == 3){
                ArrayList<Card> brr = totalCards.get((cost));
                for(int j = 1;j<=21;j++){
                    brr.add(arr.get(i));
                }
                totalCards.put(cost,brr);
            }else if(cost == 4){
                ArrayList<Card> brr = totalCards.get((cost));
                for(int j = 1;j<=13;j++){
                    brr.add(arr.get(i));
                }
                totalCards.put(cost,brr);
            }else if(cost == 5){
                ArrayList<Card> brr = totalCards.get((cost));
                for(int j = 1;j<=10;j++){
                    brr.add(arr.get(i));
                }
                totalCards.put(cost,brr);
            }
        }
    }
    public static void main(String[] args){
        initGailv();
        initStore();
        Client client = new Client(new ArrayList<>(),1,1);
        Store store = new Store(gailv,totalCards);
        for(int i = 1;i<=15;i++){
            System.out.println(store.getOneRandomCard(9));
        }
    }
}
