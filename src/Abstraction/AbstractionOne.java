package Abstraction;

abstract class AbstractionOne {

    // Abstract method (does not have a body)
    public abstract void helloAbstract();

    //Regular Method
    public void Hey() {
        System.out.println("Why And When To Use Abstract Classes and Methods?");
        System.out.println("To achieve security - hide certain details and only show the important details of an object.");
    }

    //AbstractionOne myObj = new AbstractionOne(); // will generate an error
}
