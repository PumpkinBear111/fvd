package me.pumpkinbear111.valentinesday;

import me.pumpkinbear111.valentinesday.util.RegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("fvd")
public class ValentinesDay {

    public static final String MOD_ID = "fvd";
    private static final Logger LOGGER = LogManager.getLogger();

    public ValentinesDay() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);

        RegistryHandler.init();
    }

    public static final ItemGroup TAB = new ItemGroup("valentines") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BOUQUET.get());
        }

    };

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(RegistryHandler.EMPTY_VASE.get(), RenderType.getCutout());
    }

}
