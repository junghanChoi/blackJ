import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;

    public CardDeck() {
        this.cards = generateCards();
    }

    private List<Card> generateCards() {
        List<Card> cards = new LinkedList<>();
        for(String pattern : PATTERNS){
            for(int i=1; i<= CARD_COUNT;i++){


                Card card = new Card(pattern, i);
                cards.add(card);
            }
        }
        return cards;
    }



    private List<Card> cards;

    public Card getCard(){
        return null;
    }

    public Card draw(){
        Card selectedCard = getRandomCard();
        cards.remove(selectedCard);
        return selectedCard;
    }

    private Card getRandomCard() {
        int size = cards.size();
        int select = (int)(Math.random()*size);
        Card selectedCard = cards.get(select);
        return selectedCard;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card: cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
