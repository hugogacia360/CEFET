package Collections.ExemploList2.src;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
