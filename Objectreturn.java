/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectreturn;

/**
 *
 * @author Hp
 */
public class Objectreturn {
    

    int a,b;
    Objectreturn(int i,int c){
        a = i;
        b = c;
    }
    Objectreturn test(){
        Objectreturn h1 = new Objectreturn(a,b);
        return h1;
    }
    Objectreturn tes(){
        Objectreturn h4 = new Objectreturn(a+10,b);
        return h4;
    }
    
    
    public static void main(String[] args) {
       Objectreturn h2 = new Objectreturn(2,5);
       Objectreturn h5 = new Objectreturn(10,5);
      Objectreturn h6 = new Objectreturn(10,5);
       Objectreturn h7 = h6.tes();
  Objectreturn h = h5.test();
       Objectreturn h3 = h2.test();
        System.out.println(h3.b);
        System.out.println(h3.a);
 System.out.println(h.a);
System.out.println(h7.a);// TODO code application logic here
    }
    
}
