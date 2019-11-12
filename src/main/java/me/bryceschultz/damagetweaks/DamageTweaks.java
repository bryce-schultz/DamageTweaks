package me.bryceschultz.damagetweaks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class DamageTweaks extends JavaPlugin implements Listener {

    public static double modifier = 1;

    @Override
    public void onEnable()
    {
        loadConfig();
        this.modifier = this.getConfig().getDouble("Damage Modifier");
        this.getServer().getPluginManager().registerEvents(new Events(), this);
    }

    private void loadConfig()
    {
        this.getConfig().options().copyDefaults(true);
        if (!this.getConfig().contains("Damage Modifier"))
        {
            this.getConfig().set("Damage Modifier", -.25);
        }
        this.saveConfig();
    }

    @Override
    public void onDisable()
    { }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        MinecraftCommand cmd = new MinecraftCommand(this, command, sender, label, args);

        if (cmd.equalsIgnoreCase("setdamagemodifier"))
        {
            return Commands.setModifierCommand(cmd);
        }
        return false;
    }
}
