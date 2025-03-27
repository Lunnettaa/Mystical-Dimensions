package lunetta.mysticaldimensions.datagen;

import lunetta.mysticaldimensions.MysticalDimensions;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MysticalDimensionsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(MysticalDimensionsBlockLootTableProvider::new);
        pack.addProvider(MysticalDimensionsBlockTagProvider::new);
        pack.addProvider(MysticalDimensionsRecipeProvider::new);
        pack.addProvider(MysticalDimensionsModelProvider::new);
    }
}
