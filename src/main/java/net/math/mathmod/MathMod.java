package net.math.mathmod;

import net.fabricmc.api.ModInitializer;

import net.math.mathmod.item.ModItems;
import net.math.mathmod.potion.ModPotions;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathMod implements ModInitializer {
	public static final String MOD_ID = "mathmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModPotions.registerPotions();
	}
}

