package reflectnaction;

import java.io.PrintWriter;
import reflectn2.Reflectn2;

public class ReflectnAction2 implements Reflectn2{
    
    @Override
    public void execute(PrintWriter out) {
        out.println("This is Action2");
        for(int i = 0; i < 5; i++) {
            out.println("Action_2 " + i);
        }
        out.println("Action2 ends");
    }
}
