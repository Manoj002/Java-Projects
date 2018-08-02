package reflectnaction;

import java.io.PrintWriter;
import reflectn2.Reflectn2;

public class ReflectnAction1 implements Reflectn2{
    
    @Override
    public void execute(PrintWriter out) {
        out.println("This is Action1");
        for(int i = 0; i < 5; i ++){
            out.println("Action_1 " + i);
        }
        out.println("Action1 ends");
    }
}
