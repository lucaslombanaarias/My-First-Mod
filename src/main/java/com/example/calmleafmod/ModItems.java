//ModItems.java
package com.example.calmleafmod;


import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    // Create a DeferredRegister for ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CalmleafMod.MODID);

    // Register the Calmleaf Seed
    public static final RegistryObject<Item> CALMLEAF_SEED = ITEMS.register("calmleaf_seed",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("calmleaf_seed"))   // returns a ResourceLocation under the hood
                    .stacksTo(64)
            )
    );


}
