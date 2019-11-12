package me.bryceschultz.damagetweaks;

import org.bukkit.ChatColor;

public class Commands
{
    public static boolean setModifierCommand(MinecraftCommand cmd)
    {
        if (cmd.length() != 2)
        {
            try
            {
                DamageTweaks.modifier = Double.parseDouble(cmd.getSubCommand());
                cmd.getPlugin().getConfig().set("Damage Modifier", DamageTweaks.modifier);
                cmd.getPlugin().saveConfig();
            }
            catch (Exception e)
            {
                cmd.sendReturnMessage(ChatColor.RED + "Invalid Argument, the value must be a number or decimal!");
            }

        }
        else
        {
            cmd.sendReturnMessage(ChatColor.RED + "Invalid Usage! /setdamagemodifier <value>");
        }
        return true;
    }
}
