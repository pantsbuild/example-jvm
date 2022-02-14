scalac_plugin(
    name="acyclic",
    artifact="3rdparty/jvm/com/lihaoyi:acyclic",
)

# For now, a separate target is needed for each resolve.
# TODO: Use the `parametrize` built-in once that works with the `resolve` field.
scalac_plugin(
    name="acyclic_2.12",
    # Given that the name of this target is different than the plugin name, use the
    # `plugin_name` field to provide the plugin's name, which must match the plugin
    # name used in the plugin source code and in the --scalac-plugins-for-resolve option.
    plugin_name="acyclic",
    artifact="3rdparty/jvm/com/lihaoyi:acyclic_2.12",
)
