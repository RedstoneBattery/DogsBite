package online.Street9.DogsBite;

import org.bukkit.plugin.java.JavaPlugin;

import online.Street9.DogsBite.Listeners.DogKill;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		saveDefaultConfig();
		new DogKill(this);
	}
}
