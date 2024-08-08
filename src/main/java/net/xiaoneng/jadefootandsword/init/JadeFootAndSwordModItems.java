
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoneng.jadefootandsword.init;

import net.xiaoneng.jadefootandsword.item.JfasfullglasscupItem;
import net.xiaoneng.jadefootandsword.item.JfasItemItem;
import net.xiaoneng.jadefootandsword.item.JfasEmptyGlassCupItem;
import net.xiaoneng.jadefootandsword.item.JfasDiamondSwordItem;
import net.xiaoneng.jadefootandsword.item.JfaSocksItem;
import net.xiaoneng.jadefootandsword.JadeFootAndSwordMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

public class JadeFootAndSwordModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, JadeFootAndSwordMod.MODID);
	public static final DeferredHolder<Item, Item> JFAS_DIAMOND_SWORD = REGISTRY.register("jfas_diamond_sword", JfasDiamondSwordItem::new);
	public static final DeferredHolder<Item, Item> JFA_SOCKS_LEGGINGS = REGISTRY.register("jfa_socks_leggings", JfaSocksItem.Leggings::new);
	public static final DeferredHolder<Item, Item> JFAS_SPAWN_EGG = REGISTRY.register("jfas_spawn_egg", () -> new DeferredSpawnEggItem(JadeFootAndSwordModEntities.JFAS, -52225, -13108, new Item.Properties()));
	public static final DeferredHolder<Item, Item> JFAS_EMPTY_GLASS_CUP = REGISTRY.register("jfas_empty_glass_cup", JfasEmptyGlassCupItem::new);
	public static final DeferredHolder<Item, Item> JFASFULLGLASSCUP = REGISTRY.register("jfasfullglasscup", JfasfullglasscupItem::new);
	public static final DeferredHolder<Item, Item> JFAS_ITEM = REGISTRY.register("jfas_item", JfasItemItem::new);
	public static final DeferredHolder<Item, Item> JFAS_BLOCK = block(JadeFootAndSwordModBlocks.JFAS_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
