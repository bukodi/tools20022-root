/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
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
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.EMFName;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * addressable node on the MessageTransportSystem which is capable of sending
 * and receiving TransportMessages
 */
public class MMMessagingEndpoint implements MMModelEntity {

	/**
	 * the MessageTransportSystem that owns and uses this MessagingEndpoint
	 */
	public final static MetamodelAttribute<MMMessagingEndpoint, MMMessageTransportSystem> transportSystemAttribute = newAttribute();
	/**
	 * the TransportMessage that is received by the receiving MessagingEndpoint
	 */
	public final static MetamodelAttribute<MMMessagingEndpoint, List<MMTransportMessage>> receivedMessagesAttribute = newAttribute();
	/**
	 * the TransportMessage that is sent by the sending MessagingEndpoint
	 */
	public final static MetamodelAttribute<MMMessagingEndpoint, List<MMTransportMessage>> sentMessagesAttribute = newAttribute();
	/**
	 * an Address used to identify the MessagingEndpoint
	 */
	public final static MetamodelAttribute<MMMessagingEndpoint, List<MMAddress>> locationsAttribute = newAttribute();
	protected Supplier<MMMessageTransportSystem> transportSystem_lazy;
	protected Supplier<List<MMTransportMessage>> receivedMessages_lazy;
	protected Supplier<List<MMTransportMessage>> sentMessages_lazy;
	protected Supplier<List<MMAddress>> locations_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMMessageTransportSystem getContainer() {
		return getTransportSystem();
	}

	@Override
	public MetamodelType<? extends MMMessagingEndpoint> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessagingEndpoint> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessagingEndpoint.class);
	}

	/**
	 * the MessageTransportSystem that owns and uses this MessagingEndpoint
	 * 
	 * @see MMMessageTransportSystem#getEndpoints()
	 */
	@Opposite(bean = MMMessageTransportSystem.class, attribute = "endpoints")
	@Container
	public MMMessageTransportSystem getTransportSystem() {
		return transportSystem_lazy.get();
	}

	/**
	 * the TransportMessage that is received by the receiving MessagingEndpoint
	 * 
	 * @see MMTransportMessage#getReceivers()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "receivers")
	@EMFName("receivedMessage")
	public List<MMTransportMessage> getReceivedMessages() {
		return receivedMessages_lazy == null ? Collections.emptyList() : receivedMessages_lazy.get();
	}

	/**
	 * the TransportMessage that is sent by the sending MessagingEndpoint
	 * 
	 * @see MMTransportMessage#getSender()
	 */
	@Opposite(bean = MMTransportMessage.class, attribute = "sender")
	@EMFName("sentMessage")
	public List<MMTransportMessage> getSentMessages() {
		return sentMessages_lazy == null ? Collections.emptyList() : sentMessages_lazy.get();
	}

	/**
	 * an Address used to identify the MessagingEndpoint
	 * 
	 * @see MMAddress#getEndpoint()
	 */
	@Opposite(bean = MMAddress.class, attribute = "endpoint")
	@EMFName("location")
	public List<MMAddress> getLocations() {
		return locations_lazy == null ? Collections.emptyList() : locations_lazy.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}