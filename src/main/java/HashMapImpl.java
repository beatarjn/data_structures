import java.util.Arrays;

public class HashMapImpl {
    private String[] array;

    public HashMapImpl() {
        array = new String[1000];
    }

    public void put(MyString key, MyString myString) {
        array[hash(key)] = myString.getValue();
    }

    public String get(MyString key) {
        return array[hash(key)];
    }

    public void remove(MyString key) {
        array[hash(key)] = null;
    }

    public void clear() {
        Arrays.fill(array, null);
    }

    public int size() {
        return array.length;
    }

    public int hash(MyString key) {
        return Math.floorMod(key.hashCode(), array.length);
    }

}