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
