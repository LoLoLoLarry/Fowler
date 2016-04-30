import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lolololarry on 30.04.16.
 */
public class TestMovie {

    Movie movie = new Movie("Movie",1);

    @Test
    public void getPriceCode() {
        assertEquals(movie.getPriceCode(),1);
    }

    @Test
    public void setPriceCode(){
        movie.setPriceCode(3);
        assertEquals(movie.getPriceCode(),3);
    }

    @Test
    public void getTitle() {
        assertEquals(movie.getTitle(), "movie");
    }
}
