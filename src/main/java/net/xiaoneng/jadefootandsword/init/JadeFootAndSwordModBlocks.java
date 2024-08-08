
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoneng.jadefootandsword.init;

import net.xiaoneng.jadefootandsword.block.JfasBlockBlock;
import net.xiaoneng.jadefootandsword.JadeFootAndSwordMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

public class JadeFootAndSwordModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(JadeFootAndSwordMod.MODID);
	public static final DeferredHolder<Block, Block> JFAS_BLOCK = REGISTRY.register("jfas_block", JfasBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
