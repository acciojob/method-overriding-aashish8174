package com.driver;

public class Main {
    public static void main (String args[]){
        B b = new B();
        System.out.println(b.meth());
    }
  public static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }
  B b  = new B();
 String str = b.meth();
  public static class B extends A{
      @Override
      public String meth() {
          return "Methode is overridden in extended class B";
      }
     /// public String met(){
        //  return super.meth();
      //}
  }
}