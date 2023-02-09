**This project has been superseded by [UniMixins](https://github.com/LegacyModdingMC/UniMixins) (specifically, its GTNHMixins module).**

---

# GTNH Mixins Lite

This is [GTNHMixins](https://github.com/GTNewHorizons/GTNHMixins) stripped down to only contain its own additions. The embedded Mixin and SpongeMixins have been removed. This makes the mod usable in more configurations (notably, **it can be used alongside [GasStation](https://github.com/FalsePattern/GasStation)**.)

## Background

GTNHMixins normally consists of the following generic components:

* Mixin 0.8.5
* SpongeMixins

And the following "GTNH-flavored" components:

* MixinExtras (relocated)
* GTNHMixins's own additions

This mod contains only the last two. This way, mods of your own choosing can be used to provide the first two.

**Note**: To avoid inconsistency, **the mod will refuse to launch unless it can locate all components!**

**Note**: Adding [FalsePatternLib](https://github.com/FalsePattern/FalsePatternLib) is highly recommended, as it remaps mixin config plugins to use correct package names. Many GTNHMixins-using mods won't work without this.

## License

### _GTNHMixins_ 
Lesser GNU Public License 3.0 - see [License](LICENSE)

### _MixinExtras_

MixinExtras by LlamaLad7 is included in binary files of GTNH Mixins. It is licensed under the [MIT License](https://github.com/LlamaLad7/MixinExtras/blob/master/LICENSE) and can be found at https://github.com/LlamaLad7/MixinExtras
