package org.pantsbuild.example.lib;

import com.google.common.base.Joiner;

public class ExampleLib {
  public static String hello() {
    return Joiner.on(" ").join("Hello", "World!");
  }
}
