package org.pantsbuild.example.lib;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Resources;
import java.io.IOException;

public class ExampleLib {
  public static String hello() throws IOException {
    String world =
        Resources.toString(Resources.getResource(ExampleLib.class, "world.txt"), Charsets.UTF_8)
            .strip();
    return Joiner.on(" ").join("Hello", world);
  }
}
