scala_sources()

deploy_jar(
    name="bin",
    main="org.pantsbuild.example.app.ExampleApp",
    dependencies=[
        ":app",
        # TODO: This dependency is explicitly declared because it is not currently implicitly/automatically
        # added for Scala targets. See https://github.com/pantsbuild/pants/issues/14171.
        "3rdparty/jvm/org/scala-lang:scala-library",
    ],
)
