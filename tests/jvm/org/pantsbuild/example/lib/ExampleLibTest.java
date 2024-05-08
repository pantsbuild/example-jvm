package org.pantsbuild.example.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import org.junit.jupiter.api.Test;

public class ExampleLibTest {

  @Test
  public void testHello() throws IOException {
    assertEquals("Hello World!", ExampleLib.hello());
  }
}
