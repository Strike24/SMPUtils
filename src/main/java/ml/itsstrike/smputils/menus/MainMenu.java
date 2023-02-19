package ml.itsstrike.smputils.menus;

import me.kodysimpson.simpapi.exceptions.MenuManagerException;
import me.kodysimpson.simpapi.exceptions.MenuManagerNotSetupException;
import me.kodysimpson.simpapi.menu.Menu;
import me.kodysimpson.simpapi.menu.PlayerMenuUtility;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class MainMenu extends Menu {

    public MainMenu(Player player) {
        super(new PlayerMenuUtility(player));
    }

    @Override
    public String getMenuName() {
        return "§b§lSMPUtils §7- §bMain Menu";
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public boolean cancelAllClicks() {
        return true;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }

    @Override
    public void setMenuItems() {
        ItemStack nokill = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta nokillMeta = nokill.getItemMeta();
        nokillMeta.setUnbreakable(true);
        nokill.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 0);
        nokillMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        nokillMeta.setDisplayName("§4No Kill");
        nokillMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_PLACED_ON, ItemFlag.HIDE_DYE);
        nokillMeta.setLore(List.of("§7Prevents players from killing each other,","§7but still §aallows §7hitting."
        , "", "§7Status: §cDisabled"));
        nokill.setItemMeta(nokillMeta);
        inventory.setItem(14, nokill);
    }
}
