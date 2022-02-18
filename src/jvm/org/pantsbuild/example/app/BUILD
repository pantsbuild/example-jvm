scala_sources(resolve=parametrize("jvm-default", "scala-2.12"))

# TODO: Because the `deploy_jar` target does not use dependency inference, we must create two
# copies with separate dependencies lists. See https://github.com/pantsbuild/pants/issues/14519.
deploy_jar(
    name="bin",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app@resolve=jvm-default",
    ],
)

deploy_jar(
    name="bin_2_12",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app@resolve=scala-2.12",
    ],
    resolve="scala-2.12",
)
