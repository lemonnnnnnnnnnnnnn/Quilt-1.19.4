package io.github.lemonnnnnnnnnnnnnn.lemon_quilt;

import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LemonQuiltMain implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Lemon Quilt");
	public static final String MOD_ID = "lemon_quilt";

	@Override
	public void onInitialize(ModContainer mod) {
		ModItems.registerModItems();
	}
}
