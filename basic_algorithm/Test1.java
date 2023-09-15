import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args){

        List<Integer> arrayList = Arrays.asList(1, 2, 1, 3);
        List<Integer> arrayList2 = new ArrayList<>();
        int count = 1 ;

        for (int i = 0; i < arrayList.size(); i++) {

            int value = arrayList.get(i);
            for (int j = 0; j < arrayList.size(); j++) {
                if(value == arrayList.get(j)){

                    count++ ;
                }
            }
            if(count == 1){
                arrayList2.add(value) ;
            }

            count = 0 ;
        }

        //list show just uniq value
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));

        }

    }
}
