package ru.playsoftware.j2meloader;

import android.os.Bundle;
import org.junit.Test;

public class MainActivityTest {
    @Test
    public void Some() throws Exception {
        MainActivity application = new MainActivity();
        application.onCreate(new Bundle());
    }
}
