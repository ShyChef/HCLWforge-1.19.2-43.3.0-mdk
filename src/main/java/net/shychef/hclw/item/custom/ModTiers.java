package net.shychef.hclw.item.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.shychef.hclw.HCLW;

public class ModTiers {
    public static final ForgeTier SheathedSword = new ForgeTier(2, 1500, 2f,
            2f, 1, BlockTags.NEEDS_IRON_TOOL, null);
}
