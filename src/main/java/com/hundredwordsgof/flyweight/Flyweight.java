package com.hundredwordsgof.flyweight;
//James Knepper edited this file on 03-26-18 @1741
/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {

  void operation(Object extrinsicState);
}
