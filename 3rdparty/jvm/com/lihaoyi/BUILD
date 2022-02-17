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

# TODO: For now, a separate target is needed for each scala version, because both the resolve and
# artifact need to be templated. See https://github.com/pantsbuild/pants/issues/12969.
jvm_artifact(
    name="acyclic_2.12",
    group="com.lihaoyi",
    artifact="acyclic_2.12",
    version="0.2.1",
    packages=["acyclic.**"],
    resolve="scala-2.12",
)
