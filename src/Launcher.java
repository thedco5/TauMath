import con.ConsoleProgram;
import gui.GUIProgram;

public class Launcher {
    public static void main(String[] args) {
        if (0 == args.length) new GUIProgram();
        else if ("con".equals(args[0])) new ConsoleProgram();
        else System.err.println("Unknown argument");
    }
}