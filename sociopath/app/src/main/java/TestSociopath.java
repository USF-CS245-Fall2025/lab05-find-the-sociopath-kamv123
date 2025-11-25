import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class TestSociopath {

    @Test
    void firstTest() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1,2});
        assertEquals(2, s.findTheSociopath(2, likeList), "2 = 2 likes no one; everyone likes 2");
    }

    @Test
    void secondTest() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1,2});
        assertEquals(-1, s.findTheSociopath(3, likeList), "-1 = No one likes 3");
    }

    @Test
    void thirdTest() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1,2});
        likeList.add(new int[]{1,3});
        likeList.add(new int[]{2,3});
        assertEquals(3, s.findTheSociopath(3, likeList), "3 = 3 likes no one; everyone likes 3");
    }

    @Test
    void fourthTest() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1,3});
        likeList.add(new int[]{2,3});
        likeList.add(new int[]{3,1});
        assertEquals(-1, s.findTheSociopath(3, likeList), "-1 = Each person likes someone else");
    }

    @Test
    void fifthTest() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1,2});
        assertEquals(-1, s.findTheSociopath(0, likeList), "-1 = Invalid group size / invalid people");
    }

    @Test
    void sixthTest() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1,0});
        assertEquals(-1, s.findTheSociopath(3, likeList), "-1 = 0 is not a person");
    }
}
