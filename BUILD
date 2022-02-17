scalac_plugin(
    # Given that the name of this target is different than the plugin name, use the
    # `plugin_name` field to provide the plugin's name, which must match the plugin
    # name used in the plugin source code and in the --scalac-plugins-for-resolve option.
    name="acyclic",
    artifact=parametrize(
        scala2_13="3rdparty/jvm/com/lihaoyi:acyclic",
        scala2_12="3rdparty/jvm/com/lihaoyi:acyclic_2.12",
    ),
)
