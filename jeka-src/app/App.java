package app;

import com.github.lalyos.jfiglet.FigletFont;
import dev.jeka.core.api.file.JkPathTree;
import dev.jeka.core.tool.JkDep;

import java.nio.file.Path;
import java.nio.file.Paths;

// Declare here, production dependencies

@JkDep("com.github.lalyos:jfiglet:0.0.9")
@JkDep("dev.jeka:jeka-core:0.11.16")
public class App {

    public static void main(String[] args) throws Exception {
        String md5 = JkPathTree.of(Paths.get(".")).checksum("md5");
        System.out.println(md5);
    }

}