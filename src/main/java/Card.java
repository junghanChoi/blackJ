public class Card {
    // Pattern : Clover, Heart, Space, Diamond
    // denomination: A,2~10,J,Q,K
    private String pattern, denomination;
    private int point;
    public Card(String pattern, int number) {
        this.pattern = pattern;
        this.denomination = this.numberToDenomination(number);
        this.point = this.numberToPoint(number);
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    private int numberToPoint(int number) {
        if (number >= 11){
            return 10;
        }
        return number;
    }

    private String numberToDenomination(int number){
        if(number == 1){
            return "A";
        }else if(number == 11){
            return "J";
        }else if(number == 12){
            return "Q";
        }else if(number == 13){
            return "K";
        }
        return String.valueOf(number);

    }

    @Override
    public String toString() {
        return "Card{" +
                "pattern='" + pattern + '\'' +
                ", denomination='" + denomination + '\'' +
                '}';
    }

    public int getPoint() {
        return point;
    }
}
