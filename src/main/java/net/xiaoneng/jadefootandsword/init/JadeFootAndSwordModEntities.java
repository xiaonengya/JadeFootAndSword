
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoneng.jadefootandsword.init;

import net.xiaoneng.jadefootandsword.entity.JfasEntity;
import net.xiaoneng.jadefootandsword.JadeFootAndSwordMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JadeFootAndSwordModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, JadeFootAndSwordMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<JfasEntity>> JFAS = register("jfas",
			EntityType.Builder.<JfasEntity>of(JfasEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(SpawnPlacementRegisterEvent event) {
		JfasEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(JFAS.get(), JfasEntity.createAttributes().build());
	}
}
