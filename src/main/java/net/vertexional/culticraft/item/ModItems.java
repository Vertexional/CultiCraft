package net.vertexional.culticraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vertexional.culticraft.CultiCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CultiCraft.MOD_ID);

    public static final RegistryObject<Item> BASIC_PILL = ITEMS.register("basic_pill",
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTICRAFT_TAB).stacksTo(16).food(new FoodProperties.Builder().nutrition(0).alwaysEat().fast().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100, 113), 1).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
