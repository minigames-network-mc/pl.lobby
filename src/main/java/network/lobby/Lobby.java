package network.lobby;

import network.lobby.listeners.PlayerListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Lobby extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getLogger().info("Lobby Enabled.");

        this.getServer().getPluginManager().registerEvents(new PlayerListener(this), this);

    }

    @Override
    public void onDisable() {
        this.getServer().getLogger().info("Lobby Disabled.");
    }
}
