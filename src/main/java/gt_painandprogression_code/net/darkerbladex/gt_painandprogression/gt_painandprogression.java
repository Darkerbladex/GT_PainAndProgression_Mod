package gt_painandprogression_code.net.darkerbladex.gt_painandprogression;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = gt_painandprogression.MOD_ID, name = gt_painandprogression.NAME, version = gt_painandprogression.VERSION)
public class gt_painandprogression
{
    public static final String MOD_ID = "gt_painandprogression";
    public static final String NAME = "GT:Pain&ProgressionMod";
    public static final String VERSION = "1.0";

    private static Logger logger;
    //New Variables
    public static Item.ToolMaterial ancient_suspicious_relic_material;
    public static Item ancient_suspicious_relic;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        logger = event.getModLog();

        ancient_suspicious_relic_material = EnumHelper.addToolMaterial(ancient_suspicious_relic_material.name(), 4,10000, 20.0F, 100.0F, 30);
        ancient_suspicious_relic = new CustomRelic();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
