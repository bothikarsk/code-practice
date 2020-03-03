package oops;

public class Parent {

    public void show(){
        System.out.println("In parent show");
    }

    public void print(){
        Child child= new Child();
        child.display();
        System.out.println("in parent print");
    }
}
