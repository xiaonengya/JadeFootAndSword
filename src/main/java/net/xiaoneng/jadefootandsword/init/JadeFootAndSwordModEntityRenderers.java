
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoneng.jadefootandsword.init;

import net.xiaoneng.jadefootandsword.client.renderer.JfasRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JadeFootAndSwordModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JadeFootAndSwordModEntities.JFAS.get(), JfasRenderer::new);
	}
}
