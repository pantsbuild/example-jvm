java_sources(
    dependencies=[
        # Resource dependencies cannot be inferred, so we must explicitly declare that we
        # depend on them.
        "src/resources/org/pantsbuild/example/lib",
    ],
)

# For now, a separate target is needed for each resolve.
# TODO: Use the `parametrize` built-in once that works with the `resolve` field.
java_sources(
    name="lib_2_12",
    dependencies=[
        # Resource dependencies cannot be inferred, so we must explicitly declare that we
        # depend on them.
        "src/resources/org/pantsbuild/example/lib",
    ],
    resolve="scala-2.12",
)
