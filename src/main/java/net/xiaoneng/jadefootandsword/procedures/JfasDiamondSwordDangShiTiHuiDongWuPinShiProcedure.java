package net.xiaoneng.jadefootandsword.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class JfasDiamondSwordDangShiTiHuiDongWuPinShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.END_ROD, (x + 0.5), (y + 1.75), (z + 0.5), 0, (-0.1), 0);
		world.addParticle(ParticleTypes.END_ROD, (x + 0.5), (y + 1.75), (z - 0.5), 0, (-0.1), 0);
		world.addParticle(ParticleTypes.END_ROD, (x - 0.5), (y + 1.75), (z + 0.5), 0, (-0.1), 0);
		world.addParticle(ParticleTypes.END_ROD, (x - 0.5), (y + 1.75), (z - 0.5), 0, (-0.1), 0);
	}
}
