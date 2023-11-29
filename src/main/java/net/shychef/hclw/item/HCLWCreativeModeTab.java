package net.shychef.hclw.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class HCLWCreativeModeTab {
    public static final CreativeModeTab HCLW_TAB = new CreativeModeTab("HCLWtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LuckyCoin.get());
        }
    };
}
