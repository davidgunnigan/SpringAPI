/*
package test;

import app.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest2 {

    private static final String EXPECTED_FNAME = "Emma";

    private User appUser;

    @Before
    public void setUp() {
        appUser = new User(EXPECTED_FNAME, "Coughlan", 12345);
    }

    @Test
    public void testFirstNameIsCorrect() {
        assertEquals(EXPECTED_FNAME, appUser.getFirstName());
    }

    @Test
    public void testLastNameIsIncorrect() {
        assertTrue("Coughlan".equals(appUser.getLastName()));
    }

    @Test
    public void testId() {
        assertTrue(12345 == appUser.getId());
    }

    @Test (expected=NullPointerException.class)
    public void testNullFields() throws Exception {

//        assertTrue(n.equals(appUser.getFirstName()));
//        assertTrue(n.equals(appUser.getLastName()));
    }

    @Test (expected = ZeroOrMinusNumberOutOfBoundsException.class)
    public void testZeroOrNegativeId() throws Exception {
        assertTrue(-14 == appUser.getId());
    }

}
*/
