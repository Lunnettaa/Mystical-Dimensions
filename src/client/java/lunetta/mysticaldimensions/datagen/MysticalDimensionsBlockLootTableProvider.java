package lunetta.mysticaldimensions.datagen;

import lunetta.mysticaldimensions.MysticalDimensions;
import lunetta.mysticaldimensions.block.ModBlocks;
import lunetta.mysticaldimensions.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MysticalDimensionsBlockLootTableProvider extends FabricBlockLootTableProvider {

    public MysticalDimensionsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SUNORIUM_ORE, oreDrops(ModBlocks.SUNORIUM_ORE, ModItems.SUNORIUM));
        addDrop(ModBlocks.JADE_ORE, oreDrops(ModBlocks.JADE_ORE, ModItems.JADE));
    }
}
