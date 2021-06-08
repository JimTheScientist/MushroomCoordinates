package net.jimthescientist.mushroomfinder;

import kaptainwutax.biomeutils.source.BiomeSource;
import kaptainwutax.mcutils.block.Block;
import kaptainwutax.mcutils.state.Dimension;
import kaptainwutax.mcutils.version.MCVersion;
import kaptainwutax.terrainutils.TerrainGenerator;

public class Main {
    public static void main(String[] args){
        long worldSeed = 12L;
        MCVersion version = MCVersion.v1_16_5;
        Dimension dimension = Dimension.NETHER;
        BiomeSource biomeSource = BiomeSource.of(dimension, version, worldSeed);



    }
}
