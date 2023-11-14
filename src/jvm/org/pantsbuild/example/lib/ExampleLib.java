package org.pantsbuild.example.lib;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Resources;
import java.io.IOException;
import javax.annotation.Nonnull;
import org.pantsbuild.example.SubmitPynestJobRequest;

public class ExampleLib {
  public static String hello() throws IOException {
    SubmitPynestJobRequest.Builder builder = SubmitPynestJobRequest.newBuilder();
    builder.setConfigScope("TestScope");
    ExampleLib.printScope(builder.build());

    String world =
        Resources.toString(Resources.getResource(ExampleLib.class, "world.txt"), Charsets.UTF_8)
            .strip();
    return Joiner.on(" ").join("Hello", world);
  }

  private static void printScope(@Nonnull final SubmitPynestJobRequest request) {
    System.out.println(request.getConfigScope());
  }
}
