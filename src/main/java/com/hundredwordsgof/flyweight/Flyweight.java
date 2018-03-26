package com.hundredwordsgof.flyweight;

// Taylor Mauldin edited this 3/26
/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {

  void operation(Object extrinsicState);
}
