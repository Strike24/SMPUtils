package ml.itsstrike.smputils;

import me.kodysimpson.simpapi.menu.MenuManager;
import ml.itsstrike.smputils.commands.SMPCommand;
import org.bukkit.plugin.java.JavaPlugin;
import revxrsal.commands.bukkit.BukkitCommandHandler;

public final class SMPUtils extends JavaPlugin {
    private BukkitCommandHandler handler;

    @Override
    public void onEnable() {
        // Plugin startup logic


        messages(true);
        LoadManagers();
        loadListeners();
        loadCommands();
    }


    @Override
    public void onDisable() {
        messages(false);
    }

    private void LoadManagers() {
        handler = BukkitCommandHandler.create(this);
        MenuManager.setup(getServer(), this);
    }
    private void loadListeners() {
    }

    private void loadCommands() {
        new SMPCommand(this);
    }


    private void messages(boolean enable) {
        if (enable) {
            getLogger().info("---------------------------------------");
            getLogger().info("SMPUtils has been enabled.");
            getLogger().info("Version: " + getDescription().getVersion());
            getLogger().info("§bAuthor: " + getDescription().getAuthors());
            getLogger().info("---------------------------------------");
        } else {
            getLogger().severe("SMPUtils has been disabled.");
        }
    }
    public BukkitCommandHandler getHandler() {
        return handler;
    }
}
