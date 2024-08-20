package net.gbm.bomusic.datagen;

import net.gbm.bomusic.BoMusic;
import net.gbm.bomusic.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BoMusic.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CIRCLE);
//        blockWithItem(ModBlocks.RAW_ALEXANDRITE_BLOCK);
//
//        blockWithItem(ModBlocks.ALEXANDRITE_ORE);
//        blockWithItem(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE);
//        blockWithItem(ModBlocks.END_STONE_ALEXANDRITE_ORE);
//        blockWithItem(ModBlocks.NETHER_ALEXANDRITE_ORE);
//
//        blockWithItem(ModBlocks.SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}