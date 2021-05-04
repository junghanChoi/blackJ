import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;

    public CardDeck(List<Card> cards) {
        this.cards = new ArrayList<>();
        for(String pattern : PATTERNS){
            for(int i=1; i<= CARD_COUNT;i++){
                Card card = new Card();
                String denomination;

                if(i == 1){
                    denomination = "A";
                }else if(i == 11){
                    denomination = "J";
                }else if(i == 12){
                    denomination = "Q";
                }else if(i == 13){
                    denomination = "K";
                }else{
                    denomination = String.valueOf(i);
                }
            }
        }
    }

    private List<Card> cards;

    public Card getCard(){
        return null;
    }
}
