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
import com.kaltura.client.enums.KalturaThumbCuePointSubType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 17 Aug 15 01:47:13 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class KalturaThumbCuePointBaseFilter extends KalturaCuePointFilter {
    public String descriptionLike;
    public String descriptionMultiLikeOr;
    public String descriptionMultiLikeAnd;
    public String titleLike;
    public String titleMultiLikeOr;
    public String titleMultiLikeAnd;
    public KalturaThumbCuePointSubType subTypeEqual;
    public String subTypeIn;

    public KalturaThumbCuePointBaseFilter() {
    }

    public KalturaThumbCuePointBaseFilter(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("descriptionLike")) {
                this.descriptionLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("descriptionMultiLikeOr")) {
                this.descriptionMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("descriptionMultiLikeAnd")) {
                this.descriptionMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("titleLike")) {
                this.titleLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("titleMultiLikeOr")) {
                this.titleMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("titleMultiLikeAnd")) {
                this.titleMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("subTypeEqual")) {
                this.subTypeEqual = KalturaThumbCuePointSubType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("subTypeIn")) {
                this.subTypeIn = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaThumbCuePointBaseFilter");
        kparams.add("descriptionLike", this.descriptionLike);
        kparams.add("descriptionMultiLikeOr", this.descriptionMultiLikeOr);
        kparams.add("descriptionMultiLikeAnd", this.descriptionMultiLikeAnd);
        kparams.add("titleLike", this.titleLike);
        kparams.add("titleMultiLikeOr", this.titleMultiLikeOr);
        kparams.add("titleMultiLikeAnd", this.titleMultiLikeAnd);
        kparams.add("subTypeEqual", this.subTypeEqual);
        kparams.add("subTypeIn", this.subTypeIn);
        return kparams;
    }

}
