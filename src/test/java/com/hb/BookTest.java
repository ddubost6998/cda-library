package com.hb;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import java.time.Year;

public class BookTest {
    @Test
    public void testGetAge() {
        Book book = new Book("Test Book", "Test Author", 2010);
        int expectedAge = Year.now().getValue() - 2010;
        assertEquals(book.getAge(), expectedAge, "The age calculation is incorrect");
    }
}
