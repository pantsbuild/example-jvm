java_sources(
    dependencies=[
        # Resource dependencies cannot be inferred, so we must explicitly declare that we
        # depend on them.
        "src/resources/org/pantsbuild/example/lib",
        # TODO: Protobuf dependencies are not currently inferred.
        # see https://github.com/pantsbuild/pants/issues/14960
        "src/jvm/org/pantsbuild/example/proto",
        "3rdparty/jvm/com/google/protobuf",
        "3rdparty/jvm/io/grpc:stub",
    ],
)
