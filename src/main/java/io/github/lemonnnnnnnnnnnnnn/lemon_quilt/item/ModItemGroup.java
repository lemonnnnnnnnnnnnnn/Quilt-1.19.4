package io.github.lemonnnnnnnnnnnnnn.lemon_quilt.item;


import io.github.lemonnnnnnnnnnnnnn.lemon_quilt.LemonQuiltMain;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
	public static ItemGroup DEV;

	public static void registerItemGroups() {
		DEV = FabricItemGroup.builder(new Identifier(LemonQuiltMain.MOD_ID, "dev"))
			.name(Text.translatable("itemgroup.dev"))
			.icon(() -> new ItemStack(ModItems.DEV_INGOT)).build();
	}
}
