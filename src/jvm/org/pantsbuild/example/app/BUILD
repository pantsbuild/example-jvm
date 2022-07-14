scala_sources(resolve=parametrize("jvm-default", "scala-2.12"))

deploy_jar(
    name="bin",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app",
    ],
    resolve=parametrize("jvm-default", "scala-2.12"),
)
