import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HashMapImplTest {

    @Test
    void testMapImpl() {
        HashMapImpl hashMap = new HashMapImpl();

        hashMap.put(new MyString("1"), new MyString("one"));
        hashMap.put(new MyString("2"), new MyString("two"));
        hashMap.put(new MyString("3"), new MyString("three"));

        assertEquals("one", hashMap.get(new MyString("1")));
        assertNull(hashMap.get(new MyString("4")));

        hashMap.remove(new MyString("1"));
        assertNull(hashMap.get(new MyString("1")));

        hashMap.clear();

        assertNull(hashMap.get(new MyString("2")));
    }

}