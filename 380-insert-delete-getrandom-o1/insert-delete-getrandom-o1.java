import java.util.*;

class RandomizedSet {
    List<Integer> a;
    HashMap<Integer, Integer> b;
    Random c;

    public RandomizedSet() {
        a = new ArrayList<>();
        b = new HashMap<>();
        c = new Random();
    }

    public boolean insert(int val) {
        if (b.containsKey(val)) return false;

        b.put(val, a.size());
        a.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!b.containsKey(val)) return false;

        int x = b.get(val);
        int y = a.get(a.size() - 1);

        a.set(x, y);
        b.put(y, x);

        a.remove(a.size() - 1);
        b.remove(val);

        return true;
    }

    public int getRandom() {
        return a.get(c.nextInt(a.size()));
    }
}