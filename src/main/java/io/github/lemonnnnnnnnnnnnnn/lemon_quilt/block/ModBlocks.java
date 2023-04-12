package io.github.lemonnnnnnnnnnnnnn.lemon_quilt.block;

import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.LemonQuiltMain;
import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.item.ModItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {

	public static final Block DEV_BLOCK = registerBlock("dev_block",
		new Block(QuiltBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.DEV);

	private static Block registerBlock(String name, Block block, ItemGroup group) {
		registerBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(LemonQuiltMain.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(LemonQuiltMain.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.addItem(item));
		return item;
	}

	public static void registerModBlocks() {
		LemonQuiltMain.LOGGER.info("Registering ModBlocks for " + LemonQuiltMain.MOD_ID);
	}

}
