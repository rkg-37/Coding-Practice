# convert arraylist to array[]

import java.util.Arrays;
import java.util.List;

class ListUtil
{
    // Program to convert list of integer to array of int in Java
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int[] primitive = list.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

        System.out.println(Arrays.toString(primitive));
    }
}

# to convert an array to a list 

String[] str_array = {"item1","item2","item3"};
List<String> list = new ArrayList<String>(Arrays.asList(str_array));
list.remove("item2");
str_array = list.toArray(new String[0]);

# good article fro string

https://www.delftstack.com/howto/java/java-split-string-by-space/

