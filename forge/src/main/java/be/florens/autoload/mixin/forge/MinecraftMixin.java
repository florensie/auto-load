package be.florens.autoload.mixin.forge;

import be.florens.autoload.AutoLoad;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MinecraftMixin {

	@Unique private static boolean wasLoaded;

	@Inject(method = "setScreen", at = @At("TAIL"))
	private void autoLoadLevel(@Nullable Screen screen, CallbackInfo info) {
		if (screen instanceof TitleScreen && !wasLoaded) {
			wasLoaded = true;
			AutoLoad.tryLoad();
		}
	}
}
