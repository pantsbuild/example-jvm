scala_sources()

# For now, a separate target is needed for each resolve.
# TODO: Use the `parametrize` built-in once that works with the `resolve` field.
scala_sources(
    name="app_2_12",
    resolve="scala-2.12",
)

deploy_jar(
    name="bin",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app",
    ],
)

# For now, a separate target is needed for each resolve.
# TODO: Use the `parametrize` built-in once that works with the `resolve` field.
deploy_jar(
    name="bin_2_12",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app_2_12",
    ],
    resolve="scala-2.12",
)
