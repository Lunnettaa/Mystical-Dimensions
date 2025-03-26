package lunetta.mysticaldimensions.block;

import lunetta.mysticaldimensions.MysticalDimensions;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SUNORIUM_ORE = registerBlock("sunorium_ore",
            AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool());

    public static final Block JADE_ORE = registerBlock("jade_ore",
            AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool());


    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MysticalDimensions.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MysticalDimensions.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks() {
        MysticalDimensions.LOGGER.info("Registering mod blocks for " + MysticalDimensions.MOD_ID + " :3");
    }
}
