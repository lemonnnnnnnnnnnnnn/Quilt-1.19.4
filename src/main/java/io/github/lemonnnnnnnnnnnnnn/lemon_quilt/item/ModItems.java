package io.github.lemonnnnnnnnnnnnnn.lemon_quilt.item;

import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.LemonQuiltMain;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item RAW_DEV = registerItem("raw_dev",
		new Item(new QuiltItemSettings()));
	public static final Item DEV_INGOT = registerItem("dev_ingot",
		new Item(new QuiltItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(LemonQuiltMain.MOD_ID, name), item);
	}

	public static void addItemsToItemGroup() {
		addToItemGroup(ModItemGroup.DEV, DEV_INGOT);
		addToItemGroup(ModItemGroup.DEV, RAW_DEV);

		addToItemGroup(ItemGroups.INGREDIENTS, DEV_INGOT);
		addToItemGroup(ItemGroups.INGREDIENTS, RAW_DEV);
	}

	private static void addToItemGroup(ItemGroup group, Item item) {
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.addItem(item));
	}

	public static void registerModItems(){
		LemonQuiltMain.LOGGER.debug("Registering ModItems for " + LemonQuiltMain.MOD_ID);

		addItemsToItemGroup();
	}
}
