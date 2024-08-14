package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAppConstructor() {
        App app = new App();
        assertNotNull(app);
    }

    @Test
    public void testAppMessage() {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}