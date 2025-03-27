package lunetta.mysticaldimensions.datagen;

import com.ibm.icu.text.Normalizer2;
import lunetta.mysticaldimensions.block.ModBlocks;
import lunetta.mysticaldimensions.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class MysticalDimensionsModelProvider extends FabricModelProvider {
    public MysticalDimensionsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUNORIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SUNORIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EROSINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRYSTANTITE_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRALED_CRYSTANTITE_RING, Models.GENERATED);

    }
}
