package sorting;

import sorting.comparators.AssendByStringSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByStringSize {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>(Arrays.asList("Electrifai","Ele","E","Electri","Elect"));
        System.out.println(names);
        Collections.sort(names,new AssendByStringSize());
        System.out.println(names);

    }
}
