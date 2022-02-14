jvm_artifact(
    group="com.google.guava",
    artifact="guava",
    version="31.0.1-jre",
    # Because `guava` provides a package which does not match its `group`, we explicitly list it
    # here, which allows inference to recognize that imports of this package are provided by this
    # artifact. See https://www.pantsbuild.org/v2.9/docs/reference-jvm_artifact#codepackagescode
    # for more information.
    packages=["com.google.common.**"],
)

# For now, a separate target is needed for each resolve.
# TODO: Use the `parametrize` built-in once that works with the `resolve` field.
jvm_artifact(
    name="guava_2_12",
    group="com.google.guava",
    artifact="guava",
    version="31.0.1-jre",
    # Because `guava` provides a package which does not match its `group`, we explicitly list it
    # here, which allows inference to recognize that imports of this package are provided by this
    # artifact. See https://www.pantsbuild.org/v2.9/docs/reference-jvm_artifact#codepackagescode
    # for more information.
    packages=["com.google.common.**"],
    resolve="scala-2.12",
)
