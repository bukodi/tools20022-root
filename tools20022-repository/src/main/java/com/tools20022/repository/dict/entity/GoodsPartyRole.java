package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Goods;

/**
 * Role played by a party in the context of handling goods.
 */
public class GoodsPartyRole extends Role {

	private Goods Item;

	public Goods getItem() {
		return Item;
	}

	public void setItem(Goods Item) {
		this.Item = Item;
	}
}