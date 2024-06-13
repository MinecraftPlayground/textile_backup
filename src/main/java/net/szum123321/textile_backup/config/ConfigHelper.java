/*
 * A simple backup mod for Fabric
 * Copyright (C)  2022   Szum123321
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.szum123321.textile_backup.config;

import me.shedaniel.autoconfig.ConfigHolder;

public class ConfigHelper {
    public static final ConfigHelper INSTANCE = new ConfigHelper();
    private ConfigHolder<ConfigPOJO> configHolder;

    public static void updateInstance(ConfigHolder<ConfigPOJO> ch) { INSTANCE.configHolder = ch; }

    public ConfigPOJO get() { return configHolder.get(); }

    public void save() { configHolder.save(); }
}
