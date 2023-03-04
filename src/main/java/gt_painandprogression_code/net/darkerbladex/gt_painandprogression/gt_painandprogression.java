package gt_painandprogression_code.net.darkerbladex.gt_painandprogression;

import gt_painandprogression_code.proxy.ClientProxy;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod(modid = gt_painandprogression.MOD_ID, name = gt_painandprogression.NAME, version = gt_painandprogression.VERSION)
public class gt_painandprogression
{
    public static final String MOD_ID = "gt_painandprogression";
    public static final String NAME = "GT:Pain&ProgressionMod";
    public static final String VERSION = "1.0";

    public static Logger logger;
    //New Variables
    public static Item.ToolMaterial ancient_suspicious_relic_material;
    public static Item ancient_suspicious_relic;
    public static ClientProxy proxy;

    @EventHandler
    public void preInit(@NotNull FMLPreInitializationEvent event)
    {

        logger = event.getModLog();

        ancient_suspicious_relic_material = EnumHelper.addToolMaterial(ancient_suspicious_relic_material.name(), 4,10000, 20.0F, 100.0F, 30);
        ancient_suspicious_relic = new CustomRelic();
    }

    @EventHandler
    public void  Init(@NotNull FMLInitializationEvent event){

    }
}
