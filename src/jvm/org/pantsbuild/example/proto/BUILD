protobuf_sources(
    grpc=True,
    dependencies=[
        # TODO: The protobuf runtime is not automatically injected as a dependency of protobuf targets.
        # see https://github.com/pantsbuild/pants/pull/15006.
        "3rdparty/jvm/com/google/protobuf",
    ],
)