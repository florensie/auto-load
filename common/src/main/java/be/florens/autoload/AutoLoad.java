package be.florens.autoload;

import net.minecraft.client.Minecraft;

public class AutoLoad {

	public static void tryLoad() {
		Minecraft client = Minecraft.getInstance();

		if (client != null && client.getLevelSource().levelExists("autoload")) {
			client.loadLevel("autoload");
		}
	}
}
