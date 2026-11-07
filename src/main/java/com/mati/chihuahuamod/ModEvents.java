package com.mati.chihuahuamod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.entity.animal.Animal;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(modid = ChihuahuaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEvents {
    private ModEvents() {}

    @SubscribeEvent
    public static void attributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CHIHUAHUA.get(), Animal.createAnimalAttributes().build());
    }

    @SubscribeEvent
    public static void spawnPlacement(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.CHIHUAHUA.get(), SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules,
                SpawnPlacementRegisterEvent.Operation.OR);
    }

    @SubscribeEvent
    public static void creativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.CHIHUAHUA_SPAWN_EGG);
        }
    }
}
