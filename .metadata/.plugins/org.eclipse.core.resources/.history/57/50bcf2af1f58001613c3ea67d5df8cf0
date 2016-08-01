package org.lightningarc.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class SqlHandler extends BukkitRunnable {

	private String db;
	private String usr;
	private String pass;
	private Connection conn;
	private PluginMain plugin;

	public SqlHandler(String database, String username, String password){
		this.db = database;
		this.usr = username;
		this.pass = password;
	}
	
	public void makeConnetion(){
		Bukkit.getScheduler().runTaskAsynchronously(plugin, this){
			
		}
		
		try
		    {
		      this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.db, this.usr, this.pass);
		    }
		    catch (SQLException e)
		    {
		    }
	}
	
}
