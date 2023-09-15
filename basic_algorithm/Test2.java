import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args){

        List<Integer> arrayList = Arrays.asList(5, 9, 7, 11, 12);
        List<Integer> arrayList2 = new ArrayList<>();
        int value1 = 0 ;
        int value2 = 0 ;
        int value3 = 0 ;
        int count = 0 ;

        for (int i = 0; i < arrayList.size(); i++) {

            if(value3 < arrayList.get(i)){

                if(count == 1  && arrayList.get(i) == value1){
                    value3 = value3;
                }else{
                    value3 = arrayList.get(i);
                }
            }

            if(i == arrayList.size()-1){

                if (count == 1){
                    value2 = value3 ;
                    break;
                }else{
                    value1 = value3 ;
                    value3 = 0 ;
                    i = 0;
                    count = +1 ;

                }
            }

        }

        value3 = value1 + value2 ;

        //return the largest sum of two number
        System.out.println(value3);

    }
}
