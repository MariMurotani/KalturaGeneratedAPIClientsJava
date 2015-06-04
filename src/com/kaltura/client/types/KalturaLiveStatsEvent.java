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
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.enums.KalturaLiveStatsEventType;
import com.kaltura.client.enums.KalturaPlaybackProtocol;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Thu, 04 Jun 15 06:48:37 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Will hold data from the Kaltura Player components to be passed on to the live
  analytics system    */
@SuppressWarnings("serial")
public class KalturaLiveStatsEvent extends KalturaObjectBase {
    public int partnerId = Integer.MIN_VALUE;
    public String entryId;
	/**  an integer representing the type of event being sent from the player     */
    public KalturaLiveStatsEventType eventType;
	/**  a unique string generated by the client that will represent the client-side
	  session: the primary component will pass it on to other components that sprout
	  from it     */
    public String sessionId;
	/**  incremental sequence of the event     */
    public int eventIndex = Integer.MIN_VALUE;
	/**  buffer time in seconds from the last 10 seconds     */
    public int bufferTime = Integer.MIN_VALUE;
	/**  bitrate used in the last 10 seconds     */
    public int bitrate = Integer.MIN_VALUE;
	/**  the referrer of the client     */
    public String referrer;
    public boolean isLive;
	/**  the event start time as string     */
    public String startTime;
	/**  delivery type used for this stream     */
    public KalturaPlaybackProtocol deliveryType;

    public KalturaLiveStatsEvent() {
    }

    public KalturaLiveStatsEvent(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("eventType")) {
                this.eventType = KalturaLiveStatsEventType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("sessionId")) {
                this.sessionId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("eventIndex")) {
                this.eventIndex = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("bufferTime")) {
                this.bufferTime = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("bitrate")) {
                this.bitrate = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("referrer")) {
                this.referrer = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("isLive")) {
                this.isLive = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("startTime")) {
                this.startTime = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("deliveryType")) {
                this.deliveryType = KalturaPlaybackProtocol.get(ParseUtils.parseString(txt));
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaLiveStatsEvent");
        kparams.add("partnerId", this.partnerId);
        kparams.add("entryId", this.entryId);
        kparams.add("eventType", this.eventType);
        kparams.add("sessionId", this.sessionId);
        kparams.add("eventIndex", this.eventIndex);
        kparams.add("bufferTime", this.bufferTime);
        kparams.add("bitrate", this.bitrate);
        kparams.add("referrer", this.referrer);
        kparams.add("isLive", this.isLive);
        kparams.add("startTime", this.startTime);
        kparams.add("deliveryType", this.deliveryType);
        return kparams;
    }

}

