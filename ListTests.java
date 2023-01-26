import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    
    @Test
    public void testFilter(){
        StringChecker sc = new StringChecker() {
            @Override
            public boolean checkString(String s) {
                if(s.charAt(0) == 'a')
                    return true;
                return false;
            }
        };


        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pinneapple");
        list.add("apricot");
        list.add("baaaaaa");

        List<String> expected = new ArrayList<String>() {
            {
                add("apple");
                add("apricot");
            }
        };


        assertEquals(ListExamples.filter(list, sc), expected);

    }


    @Test
    public void testMerge(){
        List<String> list1 = new ArrayList<String>(){
            {
                add("a");
                add("c");
                add("e");
            }
        };

        List<String> list2 = new ArrayList<String>(){
            {
                add("b");
                add("d");
                add("f");
            }
        };


        List<String> expected = new ArrayList<String>(){
            {
                add("a");
                add("b");
                add("c");
                add("d");
                add("e");
                add("f");
            }
        };

        assertEquals(expected, ListExamples.merge(list1, list2));
    }



}
