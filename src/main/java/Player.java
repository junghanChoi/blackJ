import java.util.List;

public interface Player {
    List<Card> cards = null;

    public void receiveCard(Card card);
    public List<Card> openCards();
}
