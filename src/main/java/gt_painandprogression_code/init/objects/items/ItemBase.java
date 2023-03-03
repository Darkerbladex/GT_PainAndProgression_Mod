package gt_painandprogression_code.init.objects.items;


import gt_painandprogression_code.init.Items;
import gt_painandprogression_code.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        Items.ITEMS.add(this);
    }
    @Override
    public void registerModels() {



    }
}
