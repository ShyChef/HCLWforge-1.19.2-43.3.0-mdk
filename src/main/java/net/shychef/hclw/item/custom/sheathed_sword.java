package net.shychef.hclw.item.custom;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.shychef.hclw.HCLW;
import net.shychef.hclw.item.ModItems;
import net.shychef.hclw.sound.modsounds;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

import java.util.List;
public class sheathed_sword extends Item {
    public sheathed_sword(Properties p_41383_) {
        super(p_41383_);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        player.getCooldowns().addCooldown(this, 100);
        player.getInventory().add(new ItemStack(Items.WOODEN_SWORD));

        return super.use(level, player, hand);

    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Right Click Pull a Random Sword").withStyle(ChatFormatting.AQUA));
        super.appendHoverText(stack, level, components, flag);
    }
    private void swordswitch (Player player) throws InterruptedException {
        player.getInventory().add(new ItemStack(Items.WOODEN_SWORD));
wait(1);
        player.getInventory().removeItem(new ItemStack(Items.WOODEN_SWORD));
    }
public static class Tags {
        private static TagKey<Item> ITEM_TAG = ItemTags.create(new ResourceLocation(HCLW.MOD_ID, "item_tag"));

        }
}
