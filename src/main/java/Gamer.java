import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gamer implements Player{
    private List<Card> cards;

    public Gamer() {
        this.cards = new LinkedList<>();
    }

    @Override
    public void receiveCard(Card card) {
        this.cards.add(card);
        this.showCards();
    }

    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("보유 카드 목록");
        for (Card card: cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    @Override
    public List<Card> openCards() {
        return this.cards;
    }
}
