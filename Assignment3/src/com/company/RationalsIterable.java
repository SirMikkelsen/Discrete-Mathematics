package com.company;

import java.lang.reflect.Array;
import java.util.*;


public class RationalsIterable  implements Iterable {

    ArrayList<Integer> arrayList = new ArrayList <>();

    public  RationalsIterable(){

        // Do something
    }

    @Override
    public Iterator iterator() {
        return arrayList.iterator();
    }
}
