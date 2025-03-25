package lunetta.mysticaldimensions.item;

import lunetta.mysticaldimensions.MysticalDimensions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MYSTICAL_DIMENSIONS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MysticalDimensions.MOD_ID, "mystical_dimensions_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SUNORIUM))
                    .displayName(Text.translatable("itemgroup.mystical-dimensions.mystical_dimensions_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SUNORIUM);
                    }).build());
    public static final ItemGroup MYSTICAL_DIMENSIONS_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MysticalDimensions.MOD_ID, "mystical_dimensions_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SUNORIUM))
                    .displayName(Text.translatable("itemgroup.mystical-dimensions.mystical_dimensions_blocks"))
                    .entries((displayContext, entries) -> {

                    }).build());



    public static void registerItemGroups(){
        MysticalDimensions.LOGGER.info("Registering Item Groups for" + MysticalDimensions.MOD_ID);



    }

}
