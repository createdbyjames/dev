import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {



    public void arrayListSub(ArrayList<Integer> pList, int pValue ) {

        int currentValue = 0;

        for (int i = 0; i < pList.size(); i++) {
            currentValue = pList.get(i);
            pList.set(i, currentValue - pValue);
        }
    }
}