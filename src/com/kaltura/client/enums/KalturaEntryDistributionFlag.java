// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2015  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.enums;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 10 Jul 15 00:26:07 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaEntryDistributionFlag implements KalturaEnumAsInt {
    NONE (0),
    SUBMIT_REQUIRED (1),
    DELETE_REQUIRED (2),
    UPDATE_REQUIRED (3),
    ENABLE_REQUIRED (4),
    DISABLE_REQUIRED (5);

    public int hashCode;

    KalturaEntryDistributionFlag(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaEntryDistributionFlag get(int hashCode) {
        switch(hashCode) {
            case 0: return NONE;
            case 1: return SUBMIT_REQUIRED;
            case 2: return DELETE_REQUIRED;
            case 3: return UPDATE_REQUIRED;
            case 4: return ENABLE_REQUIRED;
            case 5: return DISABLE_REQUIRED;
            default: return NONE;
        }
    }
}
