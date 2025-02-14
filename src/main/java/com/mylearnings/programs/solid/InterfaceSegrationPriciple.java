package com.mylearnings.programs.solid;

public class InterfaceSegrationPriciple {

    //Definition: A class should not be forced to implement interfaces it doesn’t use.
}

interface Worker{
    void work();
    void eat();
}

//Bad Idea
class Robot implements Worker{
    @Override
    public void work() {

    }

    @Override
    public void eat() {
 // Robot does not eat
    }
}

//Good Practice

interface Workable{
    void work();
}
interface Eatable{
    void eat();
}

class Robo implements Workable{
    @Override
    public void work() {

    }
}

class Human implements Workable,Eatable{
    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}


