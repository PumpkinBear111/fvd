package me.pumpkinbear111.valentinesday.util;

import me.pumpkinbear111.valentinesday.blocks.BlockItemBase;
import me.pumpkinbear111.valentinesday.blocks.balloon;
import me.pumpkinbear111.valentinesday.blocks.balloon_string;
import me.pumpkinbear111.valentinesday.blocks.empty_vase;
import me.pumpkinbear111.valentinesday.items.ItemBase;
import me.pumpkinbear111.valentinesday.items.food.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import static me.pumpkinbear111.valentinesday.ValentinesDay.MOD_ID;

public class RegistryHandler {

    // Deferred Registers
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    // Items
    public static final RegistryObject<Item> BOUQUET = ITEMS.register("bouquet", ItemBase::new);
    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", Chocolate::new);
    public static final RegistryObject<Item> CHOCO_BOX = ITEMS.register("choco_box", chocobox::new);
    public static final RegistryObject<Item> RED_LOLLYPOP = ITEMS.register("red_lollypop", red_lollypop::new);
    public static final RegistryObject<Item> BLUE_LOLLYPOP = ITEMS.register("blue_lollypop", blue_lollypop::new);
    public static final RegistryObject<Item> BLUE_CARD = ITEMS.register("blue_card", blue_card::new);
    public static final RegistryObject<Item> RED_CARD = ITEMS.register("red_card", red_card::new);

    // Blocks
    public static final RegistryObject<Block> EMPTY_VASE = BLOCKS.register("empty_vase", empty_vase::new);
    public static final RegistryObject<Block> BALLOON =  BLOCKS.register("balloon", balloon::new);
    public static final RegistryObject<Block> BALLOON_STRING = BLOCKS.register("balloon_string", balloon_string::new);

    // Block Items
    public static final RegistryObject<Item> EMPTY_VASE_ITEM = ITEMS.register("empty_vase_item", () -> new BlockItemBase(EMPTY_VASE.get()));
    public static final RegistryObject<Item> BALLOON_ITEM = ITEMS.register("balloon_item", () -> new BlockItemBase(BALLOON.get()));
    public static final RegistryObject<Item> BALLOON_STRING_ITEM = ITEMS.register("balloon_string_item", () -> new BlockItemBase(BALLOON_STRING.get()));

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

}
