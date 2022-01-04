# example-jvm

An example repository to demonstrate Pants's experimental Java and Scala support.

See the first
[JVM blog post](https://blog.pantsbuild.org/automatically-unlocking-concurrent-builds-and-fine-grained-caching-on-the-jvm-with-dependency-inference/)
for some unique
benefits Pants brings to Java and Scala projects.

This repository demonstrates a mix of Java and Scala, which is a common use case. But the Java
and Scala backends can be independently enabled, so there is no need to expose Scala BUILD file
symbols if you have a pure-Java repository (or vice versa). See comments in the `backends` section
of [`pants.toml`](./pants.toml).

This is only one possible way of laying out your project with Pants. See 
[pantsbuild.org/docs/source-roots#examples](https://www.pantsbuild.org/docs/source-roots#examples) 
for some other example layouts.

# Running Pants

You run Pants goals using the `./pants` wrapper script, which will bootstrap the
configured version of Pants if necessary.

# Goals

Pants commands are called _goals_. You can get a list of goals with

```
./pants help goals
```

Most goals take arguments to run on. To run on a single directory, use the directory name with 
`:` at the end. To recursively run on a directory and all its subdirectories, add `::` to the 
end.

For example:

```
./pants lint src: 3rdparty::
```

You can run on all changed files:

```
./pants --changed-since=HEAD lint
```

You can run on all changed files, and any of their "dependees":

```
./pants --changed-since=HEAD --changed-dependees=transitive test
```

# Example Goals

Try these out in this repo!

## Run `scalafmt` and `google_java_format`

```
./pants fmt ::  # Format all files.
./pants fmt src/jvm:  # Format only files in this directory (non-recursively).
./pants lint src/jvm::  # Check that all files under `src/jvm` are formatted (recursively).
```

## Check compilation

```
./pants check ::  # Compile everything.
./pants check src/jvm/org/pantsbuild/example/lib/ExampleLib.java  # Compile a file and its deps.
```

## Run and debug tests

```
./pants test ::  # Run all tests in the repository.
./pants test tests/jvm/org/pantsbuild/example/lib:  # Run all the tests in this directory.
./pants test tests/jvm/org/pantsbuild/example/lib/ExampleLibSpec.scala -- -z hello  # Run one test method.
./pants test --debug tests/jvm/org/pantsbuild/example/lib/ExampleLibSpec.scala  # Debug one file.
```

## Create a binary file

Writes the result to the `dist/` folder.

```
./pants package src/jvm/org/pantsbuild/example/app:  # Build one binary.
./pants package ::  # Create all binaries.
```

## Determine dependencies

```
./pants dependencies tests/jvm::
./pants dependencies --transitive tests/jvm::
```

## Determine dependees

That is, find what code depends on a particular files.

```
./pants dependees src/jvm/org/pantsbuild/example/lib::
./pants dependees --transitive src/jvm/org/pantsbuild/example/lib/ExampleLib.java
```

## Count lines of code

```
./pants count-loc '**/*'
```
