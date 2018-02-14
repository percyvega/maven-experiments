package com.percyvega.mavenexperiments.plugins.exec_maven_plugin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreeterTest {

  private Greeter greeter;

  @BeforeEach
  void setUp() {
    greeter = new Greeter();
  }

  @Test
  void main() {
    assert (greeter.getGreeting("Hello")).endsWith("!");         // jdk
    assertTrue(greeter.getGreeting("Hello").endsWith("!"));     // junit
    assertThat(greeter.getGreeting("Hello")).endsWith("!");     // assertJ
  }
}