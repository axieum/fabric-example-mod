package com.example.modid.submod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnotherExample implements ModInitializer
{
    public static final Logger LOGGER = LogManager.getLogger("modid-sub");

    @Override
    public void onInitialize()
    {
        LOGGER.info("Another Example is getting ready...");
    }
}
