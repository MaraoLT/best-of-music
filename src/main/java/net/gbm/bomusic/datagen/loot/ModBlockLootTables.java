package net.gbm.bomusic.datagen.loot;

import net.gbm.bomusic.block.ModBlocks;
import net.gbm.bomusic.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CIRCLE.get());
//        this.dropSelf(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
//        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
//
//        this.add(ModBlocks.ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
//        this.add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
//        this.add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.END_STONE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
//        this.add(ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.NETHER_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}