import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

//int x = initializeDominoes().get(1).getLeftSide();

        List<Domino> dominoesComplete = new ArrayList<>();
        Random random = new Random();
        int random1= random.nextInt(5);
        dominoesComplete.add(dominoes.get(random1));

        for (int i = 0; i < initializeDominoes().size()-1; i++) {
            Domino firstDomino = dominoesComplete.get(i);
            int asd = firstDomino.getRightSide();
            for (int j = 0; j < initializeDominoes().size() ; j++) {

                int asdf = initializeDominoes().get(j).getLeftSide();


                if (asd == asdf) {
                    dominoesComplete.add(initializeDominoes().get(j));
                    break;
                }

            }

        }


        System.out.println(dominoes);
        System.out.println(dominoesComplete);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }


}