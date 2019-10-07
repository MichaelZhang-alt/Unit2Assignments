
public class GuessMachine {

    private int number, guess, numGuesses;

    public GuessMachine() {
        numGuesses = 0;
        guess = 0;
        number = (int) (Math.random()*100+1);
        System.out.println("" + number);
    }

    public String giveHint() {
        if (guess > number) {
            return "Too high, guess lower";
        } else if (guess < number) {
            return "Too low, guess higher";
        } else {
            return "You got it!";
        }
    }

    public boolean setGuess(int num) {
        boolean validGuess = num <= 100 && num >= 1;
        if (validGuess) {
            numGuesses ++;
            guess = num;
            return true;
        } else {
            return false;
        }
    }
    
    public int getnumGuesses(){
        return numGuesses;
    }
}