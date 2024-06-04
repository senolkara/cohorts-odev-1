package main.java.util;

import java.util.Collections;
import java.util.Set;

public class GenerateRandomUnique {

    private GenerateRandomUnique(){}

    public static Long createId(Set<Long> idSet){
         if (!idSet.isEmpty()){
             return Collections.max(idSet) + 1;
         }
        return 1L;
    }
}
