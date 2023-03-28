package com.example.taller1corte2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    @Test
    public void testLoginWithCorrectCredentials() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.login("admin", "12345");
        assertTrue(result);
    }
    @Test
    public void testLoginWithIncorrectCredentials() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.login("usuario", "contrasena");
        assertFalse(result);
    }
    @Test
    public void testLoginWithEmptyCredentials() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.login("", "");
        assertFalse(result);
    }
    @Test
    public void testLoginWithEmptyPassword() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.login("admin", "");
        assertFalse(result);
    }
    @Test
    public void testLoginWithEmptyUsername() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.login("", "12345");
        assertFalse(result);
    }


}




