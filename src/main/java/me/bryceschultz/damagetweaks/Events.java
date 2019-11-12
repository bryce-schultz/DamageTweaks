package me.bryceschultz.damagetweaks;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Events implements Listener
{
    @EventHandler
    public void onMobDamage(EntityDamageByEntityEvent e)
    {
        if ((!(e.getDamager() instanceof Player)) && e.getEntity() instanceof Player)
        {
            if (e.getDamager().getType() == EntityType.ARROW)
            {
                Projectile p = (Projectile) e.getDamager();
                if (!(p.getShooter() instanceof Player))
                {
                    e.setDamage(e.getDamage() + (e.getDamage() * DamageTweaks.modifier));
                }
            }
            else if (e.getDamager().getType() == EntityType.FIREBALL)
            {
                Projectile p = (Projectile) e.getDamager();
                if (!(p.getShooter() instanceof Player))
                {
                    e.setDamage(e.getDamage() + (e.getDamage() * DamageTweaks.modifier));
                }
            }
            else
            {
                e.setDamage(e.getDamage() + (e.getDamage() * DamageTweaks.modifier));
            }
        }
    }
}
