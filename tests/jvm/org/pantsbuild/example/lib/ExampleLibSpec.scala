package org.pantsbuild.example

import org.scalatest.funspec.AnyFunSpec

import org.pantsbuild.example.lib.ExampleLib

class ExampleLibSpec extends AnyFunSpec {
  describe("ExampleLib") {
    it("should say hello") {
      assert(ExampleLib.hello == "Hello World!")
    }
  }
}
