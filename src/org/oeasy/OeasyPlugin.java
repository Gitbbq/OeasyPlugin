package org.oeasy;


import org.bukkit.plugin.java.JavaPlugin;

public class OeasyPlugin extends JavaPlugin{
	@Override
    public void onEnable() {
		getLogger().info("�ҵĲ����������");
        getServer().getPluginManager().registerEvents(new OeasyEventListener(), this);
    }
    
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }
    
}
