package net.shychef.hclw.item.custom;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LuckyCoinNetherite extends Item{

    public LuckyCoinNetherite(Properties p_41383_) {super(p_41383_);}
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

            potioneffect(player);
            player.getCooldowns().addCooldown(this, 200);
        return super.use(level, player, hand);
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Right Click to Test your Luck").withStyle(ChatFormatting.AQUA));
        super.appendHoverText(stack, level, components, flag);
    }
    private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal( "your number is " + getRandomnumber()));

    }
    private int getRandomnumber () {

        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }

    private int potionnumber () {
        return RandomSource.createNewThreadLocalInstance().nextInt(12);
    }
    private void potioneffect(Player player ){
        if (getRandomnumber() >= 1){
            if (potionnumber() == 0) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1, true, true, true ));
            } if (potionnumber()== 1) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1, true, true, true ));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 1, true, true, true ));
            } if (potionnumber()==2) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1, true, true, true ));
            } if (potionnumber()==3) {
                player.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 2, true, true, true ));
            }if (potionnumber()==4) {
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1200, 2, true, true, true ));
                player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200, 1, true, true, true ));
            }if (potionnumber()==5) {
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1, true, true, true ));
            } if (potionnumber()==6) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1, true, true, true ));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 1, true, true, true ));
            }if (potionnumber()==7) {
                player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 1200, 1, true, true, true ));
                player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1200, 1, true, true, true ));
            }if (potionnumber()==8) {
                player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1200, 1, true, true, true ));
                player.addEffect(new MobEffectInstance(MobEffects.LUCK, 1200, 1, true, true, true ));
            }if (potionnumber()==9) {
                player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 800, 1, true, true, true ));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800, 1, true, true, true ));
            } if (potionnumber()==10) {
                player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 1, true, true, true ));
            }if (potionnumber()>=11) {
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1, true, true, true ));
                player.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1, true, true, true ));
            }
        } else {
            if (potionnumber() == 0) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 1, true, true, true ));
            } if (potionnumber() == 1) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 1, true, true, true ));
            } if (potionnumber() == 2) {
                player.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 1, true, true, true ));
            } if (potionnumber() == 3) {
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1, true, true, true ));
            } if (potionnumber() == 4) {
                player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 400, 1, true, true, true ));
            } if (potionnumber() == 5) {
                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 300, 1, true, true, true ));
            } if (potionnumber() == 6) {
                player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 400, 1, true, true, true ));
            } if (potionnumber() == 7) {
                player.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 1, true, true, true ));
            }if (potionnumber() == 8) {
                player.addEffect(new MobEffectInstance(MobEffects.WITHER, 300, 1, true, true, true ));
            } if (potionnumber() == 9) {
                player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 300, 1, true, true, true ));
            } if (potionnumber() == 10) {
                player.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 400, 1, true, true, true ));
            } if (potionnumber() >= 11) {
                player.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 400, 1, true, true, true ));
            }
        }
    }
}
