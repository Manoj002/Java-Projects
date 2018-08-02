/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author yadav
 */
public class C2 extends C1{
    
    private int c;
    private int d;
    
    public C2(int a, int b, int c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println(c);
        System.out.println(d);
    }
}
