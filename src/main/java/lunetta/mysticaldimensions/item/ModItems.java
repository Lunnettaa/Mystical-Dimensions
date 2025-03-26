package lunetta.mysticaldimensions.item;

import lunetta.mysticaldimensions.MysticalDimensions;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    //item initializations.
    //ores
    public static final Item SUNORIUM = registerItem("sunorium", Item::new, new Item.Settings());
    public static final Item EROSINE = registerItem("erosine", Item::new, new Item.Settings());
    public static final Item JADE = registerItem("jade", Item::new, new Item.Settings());


    //items
    public static final Item CRYSTANTITE_RING = registerItem("crystantite_ring", Item::new, new Item.Settings());
    public static final Item CORRALED_CRYSTANTITE_RING = registerItem("corraled_crystantite_ring", Item::new, new Item.Settings());
    //block item initializations

    /*
    * HELPER METHODS
     */
    private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MysticalDimensions.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;

        //return Registry.register(Registries.ITEM, Identifier.of(MysticalDimensions.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MysticalDimensions.LOGGER.info("Registering items for " + MysticalDimensions.MOD_ID);
    }
}
