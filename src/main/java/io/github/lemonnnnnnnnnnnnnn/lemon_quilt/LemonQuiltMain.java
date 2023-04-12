package io.github.lemonnnnnnnnnnnnnn.lemon_quilt;

import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.item.ModItemGroup;
import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LemonQuiltMain implements ModInitializer {
	public static final String MOD_ID = "lemon_quilt";
	public static final Logger LOGGER = LoggerFactory.getLogger("Lemon Quilt");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt!");
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}
