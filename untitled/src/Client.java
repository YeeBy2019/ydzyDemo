import java.util.List;

/**
 * @author YeeBy
 * @version 1.0
 * Powered By IDEA
 */
public class Client {
    private List<Card> shoupai;
    private int money;
    private int level;

    public List<Card> getShoupai() {
        return shoupai;
    }

    public void setShoupai(List<Card> shoupai) {
        this.shoupai = shoupai;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Client(List<Card> shoupai, int money,int level) {
        this.shoupai = shoupai;
        this.money = money;
        this.level = level;
    }
}
