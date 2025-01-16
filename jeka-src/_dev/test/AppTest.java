package _dev.test;

import app.App;
import dev.jeka.core.tool.JkDep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;

// Just holds dev dependencies
@JkDep("org.junit.jupiter:junit-jupiter:5.11.4")
class AppTest {

    @Test
    void allAlgoEnum_accepted() {
        Arrays.stream(App.Algo.values()).forEach(algo -> App.compute(Paths.get("."), algo.name()));
    }

    @Test
    void badAlgo_fail() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            App.compute(Paths.get("."), "badAlgo");
        });
    }

}