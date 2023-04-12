package io.github.lemonnnnnnnnnnnnnn.lemon_quilt.item;

import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.LemonQuiltMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static final Item TEST_INGOT = registerItem("test_ingot",
		new Item(new QuiltItemSettings().Group(ItemGroup.Misc)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(LemonQuiltMain.MOD_ID, name), item);
	}
	public static void registerModItems(){
		LemonQuiltMain.LOGGER.info("Registering ModItems for " + LemonQuiltMain.MOD_ID);
	}
}
