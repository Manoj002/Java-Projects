package reflectnaction;

import java.io.PrintWriter;
import reflectn2.Reflectn2;

public class DefaultAction implements Reflectn2{
    
    @Override
    public void execute(PrintWriter out) {
        out.println("This is is Default Action");
        out.println("The action you desired is not yet implemented.");
        out.println("Sorry...");
        out.println("Default Action Ends");
    }
}
