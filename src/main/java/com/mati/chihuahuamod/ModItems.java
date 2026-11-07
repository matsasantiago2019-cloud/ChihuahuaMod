package com.mati.chihuahuamod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.bus.BusGroup;
public final class ModItems {
 private ModItems(){}
 public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,ChihuahuaMod.MOD_ID);
 public static final RegistryObject<Item> CHIHUAHUA_SPAWN_EGG=ITEMS.register("chihuahua_spawn_egg",()->new SpawnEggItem(ModEntities.CHIHUAHUA.get(),0xA96C43,0xE8D5B9,new Item.Properties().setId(ITEMS.key("chihuahua_spawn_egg"))));
 public static void register(BusGroup bus){ITEMS.register(bus);}
}