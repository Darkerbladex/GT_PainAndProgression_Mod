package init.objects.items;


import init.Items;
import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import proxy.ClientProxy;
import util.IHasModel;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        Items.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
