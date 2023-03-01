import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    ArrayList<Domino> pile;
    Random random = new Random();
    public DominoPile() {
         pile = new ArrayList<>();
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                Domino domino = new Domino(i,j);
                pile.add(domino);
            }
        }

    }

    public void shuffle() {
        for(int i = 0; i <= 20; i++) {
            int x = random.nextInt(pile.size());
            Domino temp = pile.get(x);
            int y = random.nextInt(pile.size());
            pile.set(x, pile.get(y));
            pile.set(y, temp);
        }
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }
}

/*
This class contains 1 Instance variable: An ArrayList of Dominos called pile.

Implement the following Methods:

Default Constructor - Sets the pile to an empty arraylist of dominos.
newStack6() - puts in a complete set of dominoes from 0,0 to 6,6. Keep in mind that there are no repeated tiles (if there is already a 0,1, there can't be a 1,0). You must use a nested for-loop to solve this.
shuffle() - puts the dominos in a random order within the stack.
Option #1 - take all the values out of the original pile in a random order and add them to a new pile. Make the original pile equal to the new pile.
Option #2 - loop a large number of times simply grabbing 2 random tiles at a time and swapping their places.
 */
