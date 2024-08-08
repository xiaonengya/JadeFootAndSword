package net.xiaoneng.jadefootandsword.procedures;

import net.minecraft.world.entity.Entity;

public class JfasXianShiTiaoJianProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("temp") == true) {
			return true;
		}
		return false;
	}
}
