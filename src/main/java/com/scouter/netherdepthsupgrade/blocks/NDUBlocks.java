package com.scouter.netherdepthsupgrade.blocks;

import com.mojang.logging.LogUtils;
import com.scouter.netherdepthsupgrade.NetherDepthsUpgrade;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = NetherDepthsUpgrade.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NDUBlocks {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NetherDepthsUpgrade.MODID);
    public static final RegistryObject<Block> LAVA_SPONGE = BLOCKS.register("lava_sponge", () -> new LavaSpongeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(0.6F).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> WET_LAVA_SPONGE = BLOCKS.register("wet_lava_sponge", () -> new WetLavaSpongeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(0.6F).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> WARPED_KELP_PLANT = BLOCKS.register("warped_kelp_plant", () -> new WarpedKelpPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> WARPED_KELP = BLOCKS.register("warped_kelp", () -> new WarpedKelpBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> WARPED_SEAGRASS = BLOCKS.register("warped_seagrass", () -> new WarpedSeagrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> TALL_WARPED_SEAGRASS = BLOCKS.register("tall_warped_seagrass", () -> new TallWarpedSeagrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> WARPED_KELP_BLOCK = BLOCKS.register("warped_kelp_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(0.5F, 2.5F).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Block> WARPED_KELP_CARPET_BLOCK = BLOCKS.register("warped_kelp_carpet_block", () -> new CarpetBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(0.1F).sound(SoundType.WET_GRASS)));

    public static final RegistryObject<Block> CRIMSON_KELP_PLANT = BLOCKS.register("crimson_kelp_plant", () -> new CrimsonKelpPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> CRIMSON_KELP = BLOCKS.register("crimson_kelp", () -> new CrimsonKelpBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> CRIMSON_SEAGRASS = BLOCKS.register("crimson_seagrass", () -> new CrimsonSeagrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> TALL_CRIMSON_SEAGRASS = BLOCKS.register("tall_crimson_seagrass", () -> new TallCrimsonSeagrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().instabreak().sound(SoundType.WET_GRASS).noOcclusion()));
    public static final RegistryObject<Block> CRIMSON_KELP_BLOCK = BLOCKS.register("crimson_kelp_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(0.5F, 2.5F).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Block> CRIMSON_KELP_CARPET_BLOCK = BLOCKS.register("crimson_kelp_carpet_block", () -> new CarpetBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(0.1F).sound(SoundType.WET_GRASS)));



    public static final RegistryObject<Block> LAVA_GLASS = BLOCKS.register("lava_glass", () -> new LavaGlassBlock(BlockBehaviour.Properties.of().strength(0.6F).sound(SoundType.GLASS)));
}
