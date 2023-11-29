package net.shychef.hclw.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shychef.hclw.HCLW;
import net.shychef.hclw.item.custom.*;

import java.security.PublicKey;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HCLW.MOD_ID);
    public static final RegistryObject<Item> SilverLuckyCoin = ITEMS.register("silverluckycoin",
            () -> new LuckyCoinSilver(new Item.Properties().tab(HCLWCreativeModeTab.HCLW_TAB).stacksTo(1).durability(10)));
    public static final RegistryObject<Item> LuckyCoin = ITEMS.register("luckycoin",
            () -> new LuckyCoinItem(new Item.Properties().tab(HCLWCreativeModeTab.HCLW_TAB).stacksTo(1).defaultDurability(10)));
    public static final RegistryObject<Item> DiamondLuckyCoin = ITEMS.register("diamondluckycoin",
            () -> new LuckyCoinDiamond(new Item.Properties().tab(HCLWCreativeModeTab.HCLW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> NetherLuckyCoin = ITEMS.register("netheriteluckycoin",
            () -> new LuckyCoinNetherite(new Item.Properties().tab(HCLWCreativeModeTab.HCLW_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SheathedSword = ITEMS.register("sheathed_sword",
            () -> new sheathed_sword(new Item.Properties().tab(HCLWCreativeModeTab.HCLW_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
