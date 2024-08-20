package net.gbm.bomusic.datagen;

import net.gbm.bomusic.BoMusic;
import net.gbm.bomusic.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BoMusic.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_DISC);
//        simpleItem(ModItems.RAW_ALEXANDRITE);
//
//        simpleItem(ModItems.KOHLRABI);
//        simpleItem(ModItems.METAL_DETECTOR);
//        simpleItem(ModItems.PEAT_BRICK);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BoMusic.MODID,"item/" + item.getId().getPath()));
    }
}