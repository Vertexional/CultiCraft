package net.vertexional.culticraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    
public static CreativeModeTab CULTICRAFT_TAB;
    
    public static void load() {

        CULTICRAFT_TAB = new CreativeModeTab("culticrafttab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModBlocks.BASIC_PILL.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };


    }
}
