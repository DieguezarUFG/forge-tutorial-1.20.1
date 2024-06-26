package net.diego.tutorialmod.item;

import net.diego.tutorialmod.TutorialMod;
import net.diego.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab {
    public  static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static  final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SAFIRO.get())).
                    title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) ->{

                        pOutput.accept(ModItems.SAFIRO.get());
                        pOutput.accept(ModItems.RAW_SAFIRO.get());
                        pOutput.accept(ModItems.POKEBOLA.get());


                        pOutput.accept(ModBlocks.SAFIRO_BLOQUE.get());
                        pOutput.accept(ModBlocks.RAW_SAFIRO_BLOQUE.get());

                        pOutput.accept(ModBlocks.SAFIRO_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAFIRO_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAFIRO_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAFIRO_ORE.get());

                    })
                    .build());

    public static void  register(IEventBus eventBus) {

        CREATIVE_MODE_TABS.register(eventBus);

    }
}
