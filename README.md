# Waterproof Concrete Powder

Build with concrete powder that stays in place, even underwater.

Waterproof Concrete Powder adds a waterproof, gravity-free version of every concrete powder color. Keep the familiar powder texture in floating builds and underwater structures without turning it into concrete.

Available for NeoForge, Forge and Fabric.

## Features

- **All 16 colors.** Each color has its own block and item, listed in the vanilla Colored Blocks creative tab.
- **Waterproof.** Source water, flowing water and underwater placement do not turn these blocks into concrete.
- **No gravity.** Blocks stay where you place them, even without support.
- **Vanilla appearance.** Models and textures refer to the matching vanilla concrete powder, including changes made by resource packs.
- **Normal mining.** Shovels work as expected, and each block drops its own waterproof variant when mined in Survival.

## How it works

In a crafting table, combine **8 vanilla concrete powder of the same color + 1 wheat** to make **8 Waterproof Concrete Powder** of that color. The recipe is shapeless: fill eight slots with one powder each and the remaining slot with wheat. All eight powder and the wheat are consumed.

- Colors cannot be mixed in a recipe. A 2×2 inventory crafting grid is too small.
- Vanilla concrete powder keeps its usual gravity and water-hardening behavior.
- Waterproof blocks cannot be converted back through a recipe. There is no special recoloring recipe or coating interaction on placed blocks.
- These are solid blocks; they do not have a waterlogged state.

## Requirements

| | NeoForge | Forge | Fabric |
|---|---|---|---|
| Minecraft | 26.2 | 26.2 | 26.2 |
| Java | 25 | 25 | 25 |
| Loader | NeoForge 26.2.0.0-beta or newer | Forge 65.0.0 or newer | Fabric Loader 0.18.4 or newer |
| Other | | | Fabric API 0.152.1+26.2 or newer for Minecraft 26.2 |
| Jar | `waterproofconcretepowder-neoforge-26.2-<version>.jar` | `waterproofconcretepowder-forge-26.2-<version>.jar` | `waterproofconcretepowder-fabric-26.2-<version>.jar` |

On Minecraft 26.2, NeoForge and Forge are separate loaders that do not run each other's mods, so each has its own jar. Pick the jar that matches your game's loader.

### Client and server

Install the matching mod jar on **both the client and server**, on every loader. Fabric also needs Fabric API on both sides. The mod adds new blocks and items that both sides must know about.

In singleplayer, install it in your own game; the built-in server runs it.

## Configuration

The mod has no configuration file.

## Saved data and removing the mod

Blocks and items are saved under normal registry IDs such as `waterproofconcretepowder:white_concrete_powder`. The mod adds no separate saved-data file.

Back up your world before removing the mod. Remove its placed blocks and stored items first: they depend on the mod's registry entries and cannot be preserved as waterproof blocks or items without it. Reinstalling the mod after saving without it may not restore missing content.

## Compatibility

- Targets Minecraft 26.2. Use one matching loader jar at a time.
- Uses standard block/item registration, crafting recipes, loot tables and mining tags.
- Resource packs can change its appearance by replacing the vanilla concrete powder resources it references.
- Other mods or data packs that replace these recipes, loot tables, tags or block behavior may change the result.

## Building from source

Use JDK 25 and the included Gradle wrapper:

```
./gradlew build
```

The release jars are written to `neoforge/build/libs/`, `forge/build/libs/` and `fabric/build/libs/`. Use Fabric's ordinary jar from `fabric/build/libs/`; development jars are not release artifacts.

Development profiles use `runs/26.2/neoforge` for both NeoForge sides, and separate `runs/26.2/forge-client`, `forge-server`, `fabric-client` and `fabric-server` directories. These directories are ignored by Git.

## License

MIT, copyright emberbocor. See [LICENSE](LICENSE).

The original NeoForged template notice is retained in [TEMPLATE_LICENSE.txt](TEMPLATE_LICENSE.txt).
