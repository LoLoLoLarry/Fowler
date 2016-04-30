import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Lolololarry on 30.04.16.
 */
public class TestRental {

    Movie movie = new Movie("Movie",2);
    Rental rent = new Rental(movie, 20);

    @Test
    public void getDaysRented(){
        assertEquals(rent.getDaysRented(), 20);
    }

    @Test
    public void getMovie() {
        assertEquals(rent.getMovie(), movie);
    }
}
