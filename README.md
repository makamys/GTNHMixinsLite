# GTNH Mixins Lite

This is [GTNHMixins](https://github.com/GTNewHorizons/GTNHMixins) stripped down to just its own additions. This means the embedded Mixin, MixinExtras and SpongeMixins have been removed. This allows more granular control over how you assemble your modpack.

## Background

GTNHMixins consists of the following components:

* Mixin 0.8
* SpongeMixins
* MixinExtras
* GTNHMixins's own additions

This mod contains only the last one. This way you can use different mods to provide the first three. For example, [GasStation](https://github.com/FalsePattern/GasStation) can be used to provide all three.

Note: To avoid inconsistency, **the mod will refuse to launch unless it can locate all of these components!**

## License

### _GTNHMixins_ 
Lesser GNU Public License 3.0 - see [License](LICENSE)

### Credits

Inspiration and skeleton code for the backwards compat with SpongeMixins (MinecraftURLClassPath) derived from [Falsepattern](https://github.com/FalsePattern/) under either the Fair Use Doctrine,  MIT License, or LGPL license. 

mitchej123 for adding the [original MinecraftURLClassPath](https://github.com/GTNewHorizons/SpongeMixins/commit/a8f81842ea7d7cf131191ea41ba58c3cb05b9a3c)!
