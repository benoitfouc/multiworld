/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.ferrybig.bukkit.plugins.multiworld.rev2.natives.events;

import me.ferrybig.bukkit.plugins.multiworld.rev2.natives.entities.NativePlayer;

/**
 *
 * @author Fernando
 */
public interface PlayerEvent extends EntityEvent {
    public NativePlayer getPlayer();
}