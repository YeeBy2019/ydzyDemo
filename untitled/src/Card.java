import java.util.List;

/**
 * @author YeeBy
 * @version 1.0
 * Powered By IDEA
 */
public class Card {
    private String name;
    private List<String> jiban;
    private int cost;
    private int star;

    public Card(String name, List<String> jiban, int cost,int star) {
        this.name = name;
        this.jiban = jiban;
        this.cost = cost;
        this.star = star;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getJiban() {
        return jiban;
    }

    public void setJiban(List<String> jiban) {
        this.jiban = jiban;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", jiban=" + jiban +
                ", cost=" + cost +
                ", star=" + star +
                '}';
    }
}
