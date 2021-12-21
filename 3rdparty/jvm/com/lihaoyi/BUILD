jvm_artifact(
    name="acyclic",
    group="com.lihaoyi",
    artifact="acyclic_2.13",
    version="0.2.1",
    # Because `acyclic` provides a package which does not match its `group`, we explicitly list it
    # here, which allows inference to recognize that imports of this package are provided by this
    # artifact. See https://www.pantsbuild.org/v2.9/docs/reference-jvm_artifact#codepackagescode
    # for more information.
    packages=["acyclic.**"],
)
