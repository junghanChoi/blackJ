import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    public void play(){
        System.out.println("BlackJ");
        Scanner sc = new Scanner(System.in);
        List<Player> players = Arrays.asList(new Gamer(), new Dealer());
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rules rule = new Rules();
        CardDeck deck = new CardDeck();

        initPhase(deck, players);
        playingPhase(sc, deck, players);
    }
    private static final int INIT_RECEIVE_CARD_COUNT = 2;
    private void initPhase(CardDeck cardDeck, List<Player> players){
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
        for(int i=0;i<INIT_RECEIVE_CARD_COUNT;i++) {
            for (Player player: players) {
                Card card = cardDeck.draw();
                player.receiveCard(card);
            }

        }
    }
    private void playingPhase(Scanner sc, CardDeck deck, List<Player> players) {
        while(true){
            boolean isAllPlayerTurnOff = receiveCardAllPlayers(sc, deck, players);

            if (isAllPlayerTurnOff) {
                break;
            }
        }

        String gamerInput, dealerInput;
        boolean isGamerTurn = false,isDealerTurn = false;
        while(true){
            System.out.println("카드를 뽑겠습니까? 종료하려면 0을 입력하세요.");
            gamerInput = sc.nextLine();

            if("0".equals(gamerInput)) {
                isGamerTurn = true;
            }else{
                Card card = deck.draw();
                gamer.receiveCard(card);
            }

            System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
            dealerInput = sc.nextLine();

            if("0".equals(dealerInput)) {
                isDealerTurn = true;
            }else{
                Card card = deck.draw();
                dealer.receiveCard(card);
            }

            if(isGamerTurn && isDealerTurn){
                break;
            }

        }
    }

    private boolean receiveCardAllPlayers(Scanner sc, CardDeck deck, List<Player> players) {
        boolean isAllPlayerTurnOff = true;
        for(Player player: players){
            if (isReceiveCard(sc)) {
                Card card = deck.draw();
                player.receiveCard(card);
                isAllPlayerTurnOff = false;
            }else{
                isAllPlayerTurnOff = true;
            }
        }
        return isAllPlayerTurnOff;
    }

    // 진행해야 함.
    private boolean isReceiveCard(Scanner sc) {
        System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
        return false; // 아직 진행하던 중!
    }
}
