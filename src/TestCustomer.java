import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lolololarry on 30.04.16.
 */
public class TestCustomer {

    final String name = " Kevin";
    Customer customer = new Customer(name);

    Movie movie = new Movie("The Vow",1);
    Rental rent = new Rental(movie, 20);

    @Test
    public void addRental() {
        customer.addRental(rent);
        assertEquals(customer.statement(), "Rental for "+ customer.getName() +"\n\tTitle\t\tDays\tAmount\n\t"
        + movie.getTitle() + "\t\t30\t0.0\nAmount owed is 0.0\nYou earned 1 frequent renter points");
    }

    @Test
    public void getName() {
        assertEquals(customer.getName(), name);
    }

    @Test
    public void statement() throws Exception{
        customer.addRental(rent);
        assertEquals(customer.statement(), "Rental for " + "\n\tTitle\t\tDays\tAmount\n\t"
                + movie.getTitle() + "\t\t30\t0.0\nAmount owed is 0.0\n" +
                "You have earned 1 frequent renter points");
    }
}
