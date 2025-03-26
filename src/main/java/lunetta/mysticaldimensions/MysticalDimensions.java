package lunetta.mysticaldimensions;

import lunetta.mysticaldimensions.block.ModBlocks;
import lunetta.mysticaldimensions.item.ModItemGroups;
import lunetta.mysticaldimensions.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticalDimensions implements ModInitializer {
	public static final String MOD_ID = "mystical-dimensions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MEOW :3!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}