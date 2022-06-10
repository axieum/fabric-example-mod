package com.example.modid.submod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.TitleScreen;

import static com.example.modid.submod.AnotherExample.LOGGER;

/**
 * Mixes into the title screen and logs a message.
 */
@Mixin(TitleScreen.class)
public class TitleScreenMixin
{
    /**
     * Injects into the initialisation of the title screen and logs a message.
     *
     * @param info callback info
     */
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info)
    {
        LOGGER.info("This is another example mixin - and you've reached the title screen too!");
    }
}
