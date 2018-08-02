package reflectnaction;

import java.io.PrintWriter;
import reflectn2.Reflectn2;

public class ReflectnAction3 implements Reflectn2{
    
    @Override
    public void execute(PrintWriter out) {
        out.println("This is Action3");
        for(int i = 0; i < 5; i++) {
            out.println("Action_3 " + i);
        }
        out.println("Action3 ends");
    }
}
