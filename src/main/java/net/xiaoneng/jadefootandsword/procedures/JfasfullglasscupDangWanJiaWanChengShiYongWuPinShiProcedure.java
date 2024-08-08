package net.xiaoneng.jadefootandsword.procedures;

import net.xiaoneng.jadefootandsword.init.JadeFootAndSwordModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

public class JfasfullglasscupDangWanJiaWanChengShiYongWuPinShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JadeFootAndSwordModItems.JFAS_ITEM.get()));
			entityToSpawn.setPickUpDelay(0);
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JadeFootAndSwordModItems.JFAS_ITEM.get()));
			entityToSpawn.setPickUpDelay(0);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
