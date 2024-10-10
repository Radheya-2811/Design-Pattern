package TemplateMethod.CaffineBevrage;

public class coffee extends caffineBevrage {
    void brew(){
        System.out.println("Brewing Coffee grinds");
    }   
    void addCondiments(){
        System.out.println("Adding Sugar and milk");
    } 
}
