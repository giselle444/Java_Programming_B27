package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollections {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(126,578,270,323,23,809,817,610,435,398));

        Collections.max(list);
    }
}
