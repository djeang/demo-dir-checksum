package app;

import dev.jeka.core.api.file.JkPathTree;
import dev.jeka.core.api.system.JkLog;
import dev.jeka.core.tool.JkDep;
import picocli.CommandLine;

import java.nio.file.Path;
import java.nio.file.Paths;

@JkDep("info.picocli:picocli:4.7.6")
@JkDep("info.picocli:picocli-codegen:4.7.6")

@CommandLine.Command(name = "checksum",
        subcommands = { CommandLine.HelpCommand.class },
        description = "Compute the checksum of the current dir.")
public class App implements Runnable {

    public enum Algo {
        MD5, SHA1, SHA256, SHA384, SHA512;
    }

    @CommandLine.Option(names = { "-a", "--algo" }, description = "Algorithm for checksum")
    Algo algo = Algo.MD5;

    public static void main(String[] args) throws Exception {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        try {
            String md5 = compute(Paths.get("."), algo.name().toLowerCase());
            System.out.println(md5);
        } catch (RuntimeException e) {
            System.err.println("Failed to compute checksum: " + e.getMessage());
        }
    }

    public static String compute(Path dir, String algo) {
        return JkPathTree.of(dir).checksum(algo.toLowerCase());
    }

}