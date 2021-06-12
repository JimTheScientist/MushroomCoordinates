package net.jimthescientist.mushroomfinder;

import kaptainwutax.biomeutils.source.BiomeSource;
import kaptainwutax.mcutils.block.Block;
import kaptainwutax.mcutils.state.Dimension;
import kaptainwutax.mcutils.version.MCVersion;
import kaptainwutax.terrainutils.TerrainGenerator;

public class Main {
    public static void main(String[] args){
        long worldSeed = 4312L;
        MCVersion version = MCVersion.v1_16_5;
        Dimension dimension = Dimension.OVERWORLD;
        BiomeSource biomeSource = BiomeSource.of(dimension, version, worldSeed);
        TerrainGenerator terrainGenerator = TerrainGenerator.of(biomeSource);
        assert terrainGenerator != null;
        System.out.print("Calculations Initiated");
        int matchesFound = 0;
        for (int x = -2000; x <=2000;x++){
            for (int z = -2000; z <=2000;z++){
                int originalBlockInt = terrainGenerator.getHeightOnGround(x,z);
                if (originalBlockInt == 67){
                    //System.out.println("First Check Passed: "+ x + ", " + z);
                    if (terrainGenerator.getHeightOnGround(x,z-1) == 68){
                        //System.out.println("Second Check Passed: "+ x + ", " + z);
                        if (terrainGenerator.getHeightOnGround(x,z-2) == 68){
                            //System.out.println("Third Check Passed: "+ x + ", " + z);
                            if (terrainGenerator.getHeightOnGround(x,z-3) == 69){
                                //System.out.println("Fourth Check Passed: "+ x + ", " + z);
                                if (terrainGenerator.getHeightOnGround(x+1,z-3) == 66){
                                    //System.out.println("Fifth Check Passed: "+ x + ", " + z);
                                    if (terrainGenerator.getHeightOnGround(x+1,z-2) == 66){
                                        //System.out.println("Sixth Check Passed: "+ x + ", " + z);
                                        if (terrainGenerator.getHeightOnGround(x+1,z-1) == 65){
                                            //System.out.println("Seventh Check Passed: "+ x + ", " + z);
                                            if (terrainGenerator.getHeightOnGround(x+1,z) == 65){
                                                //System.out.println("Eighth Check Passed: "+ x + ", " + z);
                                                if (terrainGenerator.getHeightOnGround(x+2,z) == 64){
                                                    //System.out.println("Ninth Check Passed: "+ x + ", " + z);
                                                    if (terrainGenerator.getHeightOnGround(x+2,z-1) == 64){
                                                        //System.out.println("Tenth Check Passed: "+ x + ", " + z);
                                                        if (terrainGenerator.getHeightOnGround(x+2,z-2) == 64){
                                                            System.out.println("Eleventh Check Passed: "+ x + ", " + z);
                                                            matchesFound +=1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        System.out.print("Calculations Complete, "+ matchesFound+ " matches found");
    }
}
