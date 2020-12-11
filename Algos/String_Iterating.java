import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class String_Iterating {
    public static void main(String [] args){

        String [] names = new String[] {"David", "Timo", "Deniz"};


        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        for(String name : names){
            System.out.println(name);
        }

        List<String> nameList = new ArrayList<String>(Arrays.asList(names));
        Iterator<String> iter = nameList.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        for(Iterator<String> it = nameList.iterator(); it.hasNext();){
            String name = it.next();
            System.out.println(name);
        }


    }

}
