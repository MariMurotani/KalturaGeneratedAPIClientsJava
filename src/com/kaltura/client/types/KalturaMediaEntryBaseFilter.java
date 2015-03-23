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
package com.kaltura.client.types;

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.enums.KalturaMediaType;
import com.kaltura.client.enums.KalturaSourceType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 23 Mar 15 00:18:12 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class KalturaMediaEntryBaseFilter extends KalturaPlayableEntryFilter {
    public KalturaMediaType mediaTypeEqual;
    public String mediaTypeIn;
    public KalturaSourceType sourceTypeEqual;
    public KalturaSourceType sourceTypeNotEqual;
    public String sourceTypeIn;
    public String sourceTypeNotIn;
    public int mediaDateGreaterThanOrEqual = Integer.MIN_VALUE;
    public int mediaDateLessThanOrEqual = Integer.MIN_VALUE;
    public String flavorParamsIdsMatchOr;
    public String flavorParamsIdsMatchAnd;

    public KalturaMediaEntryBaseFilter() {
    }

    public KalturaMediaEntryBaseFilter(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("mediaTypeEqual")) {
                this.mediaTypeEqual = KalturaMediaType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("mediaTypeIn")) {
                this.mediaTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sourceTypeEqual")) {
                this.sourceTypeEqual = KalturaSourceType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("sourceTypeNotEqual")) {
                this.sourceTypeNotEqual = KalturaSourceType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("sourceTypeIn")) {
                this.sourceTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sourceTypeNotIn")) {
                this.sourceTypeNotIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("mediaDateGreaterThanOrEqual")) {
                this.mediaDateGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("mediaDateLessThanOrEqual")) {
                this.mediaDateLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("flavorParamsIdsMatchOr")) {
                this.flavorParamsIdsMatchOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("flavorParamsIdsMatchAnd")) {
                this.flavorParamsIdsMatchAnd = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaMediaEntryBaseFilter");
        kparams.add("mediaTypeEqual", this.mediaTypeEqual);
        kparams.add("mediaTypeIn", this.mediaTypeIn);
        kparams.add("sourceTypeEqual", this.sourceTypeEqual);
        kparams.add("sourceTypeNotEqual", this.sourceTypeNotEqual);
        kparams.add("sourceTypeIn", this.sourceTypeIn);
        kparams.add("sourceTypeNotIn", this.sourceTypeNotIn);
        kparams.add("mediaDateGreaterThanOrEqual", this.mediaDateGreaterThanOrEqual);
        kparams.add("mediaDateLessThanOrEqual", this.mediaDateLessThanOrEqual);
        kparams.add("flavorParamsIdsMatchOr", this.flavorParamsIdsMatchOr);
        kparams.add("flavorParamsIdsMatchAnd", this.flavorParamsIdsMatchAnd);
        return kparams;
    }

}
