package com.example.modid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

/**
 * Example Minecraft mod.
 */
public class Example implements ModInitializer
{
    /** Example Mod logger. */
    public static final Logger LOGGER = LogManager.getLogger("modid");

    @Override
    public void onInitialize()
    {
        LOGGER.info("Example is getting ready...");
    }
}
