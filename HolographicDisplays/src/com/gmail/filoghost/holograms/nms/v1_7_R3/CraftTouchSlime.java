package com.gmail.filoghost.holograms.nms.v1_7_R3;

import java.util.Collection;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R3.CraftServer;
import org.bukkit.craftbukkit.v1_7_R3.entity.CraftSlime;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

public class CraftTouchSlime extends CraftSlime {

	public CraftTouchSlime(CraftServer server, EntityTouchSlime entity) {
		super(server, entity);
	}
	
	// Disallow all the bukkit methods.
	
	@Override
	public void remove() {
		// Cannot be removed, this is the most important to override.
	}
	
	// Methods from LivingEntity class
	@Override public boolean addPotionEffect(PotionEffect effect) { return false; }
	@Override public boolean addPotionEffect(PotionEffect effect, boolean param) { return false; }
	@Override public boolean addPotionEffects(Collection<PotionEffect> effects) { return false; }
	@Override public void setRemoveWhenFarAway(boolean remove) { }
	
	// Methods from Entity
	@Override public void setVelocity(Vector vel) { }
	@Override public boolean teleport(Location loc) { return false; }
	@Override public boolean teleport(Entity entity) { return false; }
	@Override public boolean teleport(Location loc, TeleportCause cause) { return false; }
	@Override public boolean teleport(Entity entity, TeleportCause cause) { return false; }
	@Override public void setFireTicks(int ticks) { }
	@Override public boolean setPassenger(Entity entity) { return false; }
	@Override public boolean eject() { return false; }
	@Override public boolean leaveVehicle() { return false; }
	@Override public void playEffect(EntityEffect effect) { }
	
	
	// Methods from Slime
	@Override public void setSize(int size) { }
}
