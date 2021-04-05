package be.florens.autoload;

import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfig;
import net.minecraft.world.level.storage.LevelStorageSource;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MinecraftMixin {

	@Shadow @Final private LevelStorageSource levelSource;

	@Shadow public abstract void loadLevel(String string);

	@Inject(method = "<init>", at = @At("TAIL"))
	private void autoLoadLevel(GameConfig runArgs, CallbackInfo info) {
		if (this.levelSource.levelExists("autoload")) this.loadLevel("autoload");
	}
}
