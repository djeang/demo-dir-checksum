package app;

import dev.jeka.core.api.file.JkPathTree;
import dev.jeka.core.tool.JkDep;
import picocli.CommandLine;

@JkDep("dev.jeka:jeka-core:0.11.16")
@JkDep("info.picocli:picocli:4.7.6")
@JkDep("info.picocli:picocli-codegen:4.7.6")

@CommandLine.Command(name = "checksum",
        subcommands = { CommandLine.HelpCommand.class },
        description = "Compute the checksum of the current dir.")
public class App implements Runnable {

    enum Algo {
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
        String md5 = JkPathTree.of(".").checksum(algo.toString().toLowerCase());
        System.out.println(md5);
    }

}