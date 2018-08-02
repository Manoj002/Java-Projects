package p1;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import p1.PiggyBank;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yadav
 */
public class TestPiggy {
    static PiggyBank p;
    
    public TestPiggy() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        p = new PiggyBank();
        System.out.println("Before Test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After Test");
        p = null;
    }
    
    @Before
    public void setUp() {
        System.out.println("1");
    }
    
    @After
    public void tearDown() {
        System.out.println("2");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Test1() {
        int oldBalance = p.getBalance();
        p.deposit(200);
        int z = p.getBalance();
        Assert.assertEquals(200, z - oldBalance);
        Assert.assertEquals(200, p.getLt());
    }
    
    @Test
    public void Test2() {
        int oldBalance = p.getBalance();
        p.deposit(200);
        p.withdraw(100);
        Assert.assertEquals(100, p.getBalance() - oldBalance);
        Assert.assertEquals(-100, p.getLt());
    }
    
    @Test
    public void Test3() {
        int oldBalance = p.getBalance();
        p.deposit(-50);
        int newBalance = p.getBalance();
        Assert.assertEquals(0, newBalance - oldBalance);
        
    }
}
