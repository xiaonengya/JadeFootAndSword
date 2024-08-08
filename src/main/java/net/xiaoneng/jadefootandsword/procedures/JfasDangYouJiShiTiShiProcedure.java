package net.xiaoneng.jadefootandsword.procedures;

import net.xiaoneng.jadefootandsword.init.JadeFootAndSwordModItems;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class JfasDangYouJiShiTiShiProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getPersistentData().getBoolean("temp") != true) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JadeFootAndSwordModItems.JFAS_EMPTY_GLASS_CUP.get()) {
				if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JadeFootAndSwordModItems.JFAS_EMPTY_GLASS_CUP.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				entity.getPersistentData().putBoolean("temp", true);
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(JadeFootAndSwordModItems.JFASFULLGLASSCUP.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
