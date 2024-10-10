package TemplateMethod.CaffineBevrage;

public class tea extends caffineBevrage {
    void brew(){
        System.out.println("Stepping Tea Bag");
    }
    void addCondiments(){
        System.out.println("Adding Lemon");
    }
}
