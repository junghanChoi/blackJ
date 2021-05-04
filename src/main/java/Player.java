import java.util.List;

public interface Player {
    void showCards();
    public void receiveCard(Card card);
    public List<Card> openCards();
}
