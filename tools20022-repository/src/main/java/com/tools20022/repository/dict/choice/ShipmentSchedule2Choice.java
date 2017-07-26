package com.tools20022.repository.dict.choice;

import com.tools20022.repository.dict.choice.ShipmentSchedule1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PaymentSchedule1Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between earliest/latest shipment date and a shipment schedule per sub
 * quantity of line item quantity.
 */
@PreviousVersion(ShipmentSchedule1Choice.class)
@NextVersion(PaymentSchedule1Choice.class)
public class ShipmentSchedule2Choice {
}