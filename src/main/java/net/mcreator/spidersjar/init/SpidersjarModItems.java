/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidersjar.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.mcreator.spidersjar.SpidersjarMod;

import java.util.function.Function;

public class SpidersjarModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpidersjarMod.MODID);
	public static final DeferredItem<Item> BROWN_SPIDER_SPAWN_EGG;
	static {
		BROWN_SPIDER_SPAWN_EGG = register("brown_spider_spawn_egg", properties -> new SpawnEggItem(SpidersjarModEntities.BROWN_SPIDER.get(), properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}