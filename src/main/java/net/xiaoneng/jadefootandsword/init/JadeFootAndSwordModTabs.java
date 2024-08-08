
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoneng.jadefootandsword.init;

import net.xiaoneng.jadefootandsword.JadeFootAndSwordMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JadeFootAndSwordModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JadeFootAndSwordMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(JadeFootAndSwordModItems.JFAS_DIAMOND_SWORD.get());
			tabData.accept(JadeFootAndSwordModItems.JFA_SOCKS_LEGGINGS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(JadeFootAndSwordModItems.JFAS_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(JadeFootAndSwordModItems.JFAS_ITEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JadeFootAndSwordModItems.JFAS_EMPTY_GLASS_CUP.get());
			tabData.accept(JadeFootAndSwordModItems.JFASFULLGLASSCUP.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(JadeFootAndSwordModBlocks.JFAS_BLOCK.get().asItem());
		}
	}
}
