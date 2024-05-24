package net.diego.tutorialmod.item;

import net.diego.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS =
             DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


     public static final RegistryObject<Item> SAFIRO = ITEMS.register("safiro",
             ()-> new Item(new Item.Properties()));

     public static final RegistryObject<Item>RAW_SAFIRO = ITEMS.register("raw_safiro",
             ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item>POKEBOLA = ITEMS.register("pokebola",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);

     }

}
