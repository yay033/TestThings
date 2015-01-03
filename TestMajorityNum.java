import java.util.*;
public class TestMajorityNum {

    public int majorityElement(int[] num) {

        Map<int,int> map = new HashMap<int,int>();

        for(int i=0;i<num.length;i++){

            if(map.containsKey(num[n])) map.put(num[n],map.get(num[n])+1);

            else map.add(num[n],1);

        }

        Iterator iter = map.entrySet().iterator();

        int index = -1;

        max = -1;

        while(iter.hasNext()){

            Map.Entry entry = iter.next();

            int key = entry.getKey();

            int value = entry.getValue();

            if(max<value) {

                max = value;

                index =key;

            }

        }

        

        return index;

    }

}
