/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidersjar.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.spidersjar.client.renderer.BrownSpiderRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class SpidersjarModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SpidersjarModEntities.BROWN_SPIDER.get(), BrownSpiderRenderer::new);
	}
}