package p1;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestStack {
    
    public TestStack() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void create() {
        Stack s1 = new Stack();
    }
    
    @Test
    public void testpush() {
        Stack s1 = new Stack();
        s1.push(40);
        int z = s1.peek();
        Assert.assertEquals(40, z);
    }
    
    @Test
    public void test3() {
        Stack s1 = new Stack();
        s1.push(60);
        Assert.assertEquals(60, s1.peek());
    }
    
    @Test
    public void test4() {
        Stack s1 = new Stack();
        s1.push(40);
        int z = s1.pop();
        Assert.assertEquals(40, z);
    }
    
    @Test
    public void test5() {
        Stack s1 = new Stack();
        s1.push(40);
        s1.push(60);
        int z1 = s1.pop();
        int z2 = s1.pop();
        Assert.assertEquals(60, z1);
        Assert.assertEquals(40, z2);
    }
}
