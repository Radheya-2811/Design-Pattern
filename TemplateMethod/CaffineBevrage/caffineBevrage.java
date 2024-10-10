package TemplateMethod.CaffineBevrage;

public abstract class caffineBevrage {
      final void prepareRecipe(){
         boilWater();
         brew();
         pourInCup();
         addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    final void boilWater(){
        System.out.println("Boiling Water");
    }
    final void pourInCup(){
        System.out.println("Pouring in Cup");
    }

}
