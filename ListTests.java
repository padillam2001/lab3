import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


class Tests{
    @Test
    public void testFilter(){
        List<String> arr = new List<String>("Hello", "wawa", "h", "yeayea");
        List<String> actual = ListExamples.filter(arr, new StringCheckerClass());
        assertArrayEquals(new List<String>("Hello", "wawa", "yeayea"), actual);
    }
}