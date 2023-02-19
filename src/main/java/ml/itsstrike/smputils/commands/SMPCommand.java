package ml.itsstrike.smputils.commands;

import ml.itsstrike.smputils.SMPUtils;
import ml.itsstrike.smputils.menus.MainMenu;
import org.bukkit.entity.Player;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Default;
import revxrsal.commands.annotation.Subcommand;

@Command("smp")
public class SMPCommand {
    private final SMPUtils plugin;
    public SMPCommand(SMPUtils plugin) {
        this.plugin = plugin;
        plugin.getHandler().register(this);
    }


    @Default
    public void mainCommand(Player p) {
        p.sendMessage("§8§m---------------------------------------");
        p.sendMessage("§bSMPUtils§7- §eCreated by Strike#1800");
        p.sendMessage("§a/smp help §e- §7Shows the help menu.");
        p.sendMessage("§8§m---------------------------------------");
        p.sendMessage("\n§5§lHebrew Explanation:");
        p.sendMessage("§7הפלאגין נוצר בשביל לעזור לכם ליצור את השרת שלכם, עם כל הפיצרים שתצטרכו בשרת!");
        p.sendMessage("§7יש להם הצעה לפלאגין? או שמצאתם באג? אשמח שתכנסו לשרת הדיסקורד ותדווחו!\n§9https://strke.ml/dsc");
        p.sendMessage("\n§5§lEnglish Explanation:");
        p.sendMessage("§7SMPUtils was created to help you create your own SMP, with all the features you need in your server!");
        p.sendMessage("§cPlease send / report any bugs or feature requests to §9Strike#1800 on Discord.");
        p.sendMessage("§8§m---------------------------------------");
    }

    @Subcommand("help")
    public void helpCommand(Player p) {
        p.sendMessage("§8§m---------------------------------------");
        p.sendMessage("§bSMPUtils §eHelp");
        p.sendMessage("§8§m---------------------------------------");
        p.sendMessage("§b/smp help §e- §7Shows this help menu.");
        p.sendMessage("§b/smp menu §e- §7All the things you can do with this plugin, §6but in a Menu!");
        p.sendMessage("§b/smp reload §e- §7Reloads the config.");
        p.sendMessage("§b/smp nokill §e- §7Allows players to hit others but not kill them.");
        p.sendMessage("§b/smp discordwhitelist §e- §7Allows players with specific roles to join the server. §7(§c§LSOON§7)");
        p.sendMessage("§cPlease report any bugs to §9Strike#1800 on Discord.");
        p.sendMessage("§8§m---------------------------------------");
    }

    @Subcommand("menu")
    public void menuCommand(Player p) {
        MainMenu menu = new MainMenu(p);
        menu.open();
    }
}
