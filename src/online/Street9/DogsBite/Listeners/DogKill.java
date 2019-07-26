package online.Street9.DogsBite.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import online.Street9.DogsBite.Main;
import online.Street9.DogsBite.Utils.Utils;

public class DogKill implements Listener{
	
	private Main plugin;
	
	public DogKill(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getKiller() instanceof Wolf) {
			Player p = e.getEntity();
		 e.setDeathMessage(Utils.chat(plugin.getConfig().getString("dog_murder").replace("<player>", p.getDisplayName())));
		}
	}
}