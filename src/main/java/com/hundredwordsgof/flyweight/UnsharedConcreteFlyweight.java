package com.hundredwordsgof.flyweight;

/**
 * UnsharedConcreteFlyweight, defines objects which are not shared.
 *
 */
public class UnsharedConcreteFlyweight implements Flyweight {

  private Object state;

  public UnsharedConcreteFlyweight(Object state) {
    this.state = state;
  }

  public void operation(Object extrinsicState) {

  }

  // this object returns the object state. This is Mason.
  
  public Object getState() {
    return state;
  }
}
