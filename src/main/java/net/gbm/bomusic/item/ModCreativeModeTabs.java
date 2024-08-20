package net.gbm.bomusic.item;
import net.gbm.bomusic.BoMusic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BoMusic.MODID);

    public static final RegistryObject<CreativeModeTab> BOMUSIC_TAB = CREATIVE_MODE_TABS.register("bomusic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_DISC.get()))
                    .title(Component.translatable("creativetab.bomusic"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.RAW_DISC.get());


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}