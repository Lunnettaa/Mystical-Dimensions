package lunetta.mysticaldimensions.datagen;

import lunetta.mysticaldimensions.block.ModBlocks;
import lunetta.mysticaldimensions.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MysticalDimensionsRecipeProvider extends FabricRecipeProvider {

    public MysticalDimensionsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                List<ItemConvertible> SUNORIUM_SMELTABLES = List.of(ModBlocks.SUNORIUM_ORE);

                offerSmelting(SUNORIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SUNORIUM, 500.0f, 200, "sunorium");


            }
        };
    }

    @Override
    public String getName() {
        return "MysticalDimensionsRecipeProvider";
    }
}
