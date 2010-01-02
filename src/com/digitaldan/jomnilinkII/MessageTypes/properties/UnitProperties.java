package com.digitaldan.jomnilinkII.MessageTypes.properties;

/**
*  Copyright (C) 2009  Dan Cunningham                                         
*                                                                             
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation, version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/

import com.digitaldan.jomnilinkII.MessageTypes.ObjectProperties;

public class UnitProperties extends ObjectProperties {
	private int state;
	private int time;
	private int unitType;
	public UnitProperties(int number, int state, int time,
			int unitType, String name) {
		super(OBJ_TYPE_UNIT, number, name);
		this.state = state;
		this.time = time;
		this.unitType = unitType;
	}
	public int getState() {
		return state;
	}
	public int getTime() {
		return time;
	}
	public int getUnitType() {
		return unitType;
	}
	public String toString() {
	    final String TAB = "    ";
	    String retValue = "";
	    
	    retValue = "UnitProperties ( "
	    	+ "number = " + this.number + TAB
	        + "state = " + this.state + TAB
	        + "time = " + this.time + TAB
	        + "unitType = " + this.unitType + TAB
	        + "name = " + this.name + TAB
	        + " )";
	
	    return retValue;
	}
}
