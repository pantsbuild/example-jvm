package org.pantsbuild.example.app;

import java.io.IOException;
import org.pantsbuild.example.lib.ExampleLib;

public class ExampleApp {
  public static void main(String[] args) throws IOException {
    System.out.println(ExampleLib.hello());
  }
}
