import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        // Sortarea listelor crescător
        Collections.sort(x);
        Collections.sort(y);

        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);

        // a) xPlusY conține toate elementele din x și y
        List<Integer> xPlusY = new ArrayList(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("Lista xPlusY: " + xPlusY);

        // b) zSet conține doar elementele comune între x și y (fără duplicate)
        Set<Integer> zSet = new TreeSet(x);
        zSet.retainAll(y);
        System.out.println("Setul zSet: " + zSet);

        // c) xMinusY conține elementele din x care nu sunt în y
        List<Integer> xMinusY = new ArrayList(x);
        xMinusY.removeAll(y);
        System.out.println("Lista xMinusY: " + xMinusY);

        // d) xPlusYLimitedByP conține elementele din x și y care sunt <= p
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }
        System.out.println("Lista xPlusYLimitedByP: " + xPlusYLimitedByP);

    }
}