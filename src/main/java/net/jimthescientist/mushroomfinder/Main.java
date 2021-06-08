package net.jimthescientist.mushroomfinder;

import kaptainwutax.biomeutils.source.BiomeSource;
import kaptainwutax.mcutils.block.Block;
import kaptainwutax.mcutils.state.Dimension;
import kaptainwutax.mcutils.version.MCVersion;
import kaptainwutax.terrainutils.TerrainGenerator;

public class Main {
    public static void main(String[] args){
        long worldSeed = 12L;
        MCVersion version = MCVersion.v1_16_4;
        Dimension dimension = Dimension.NETHER;
        BiomeSource biomeSource = BiomeSource.of(dimension, version, worldSeed);
        TerrainGenerator terrainGenerator = TerrainGenerator.of(biomeSource);

        assert terrainGenerator != null;
        Block[] column = terrainGenerator.getColumnAt(0, 0);
        int x = 0;
        for (Block blockClass : column) {
            System.out.println(blockClass + ", Y Coordinate: " + x);
            x++;
        }
    }
}
