scala_sources()

# TODO: Because the `deploy_jar` needs an explicit dependency on the scala_sources target, we
# need two copies in order to avoid https://github.com/pantsbuild/pants/issues/14515.
scala_sources(
    name="app_2_12",
    resolve="scala-2.12",
)

# TODO: Because the `deploy_jar` target does not use dependency inference, we must create two
# copies with separate dependencies lists. See https://github.com/pantsbuild/pants/issues/14519.
deploy_jar(
    name="bin",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app",
    ],
)

deploy_jar(
    name="bin_2_12",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app_2_12",
    ],
    resolve="scala-2.12",
)
