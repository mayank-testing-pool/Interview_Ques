import java.util.*;

import static java.util.Collections.list;

public class RemoveDuplicateFromArrayList {
    public ArrayList<String> remove_duplicate (ArrayList<String> list)
    {
        int lenght = list.size();
        ArrayList <String> list2 = new ArrayList<String>();
        for (int i=0;i<lenght;i++)
        {
            //String str = list.get(i);
            if (!list2.contains(list.get(i)))
            {
                list2.add(list.get(i));
            }
        }

        /*for (T str : list)
        {
            if (!list2.contains(str))
            {
                list2.add(str);
            }
        }*/
        return list2;
    }

    public static void main (String [] a)
    {
        ArrayList <String> list = new ArrayList();
        list.add("JAVA");
        list.add("PYTHON");
        list.add("C++");
        list.add("SELENIUM");
        list.add("JAVA");
        RemoveDuplicateFromArrayList obj = new RemoveDuplicateFromArrayList();
        ArrayList <String> temp_list =obj.remove_duplicate(list);
        System.out.println(temp_list);
    }



}
