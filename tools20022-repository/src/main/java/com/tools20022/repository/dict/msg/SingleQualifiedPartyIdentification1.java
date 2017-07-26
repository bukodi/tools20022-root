package com.tools20022.repository.dict.msg;
/**
 * Defines an identifier for a party relative to another party using an
 * identifier of another party followed by a local identifier issued by the
 * other party. It is assumed that customers of an identifiable party can be
 * referenced by an identifier relative to that party. The identification of the
 * party together with the relative identifier identifies the customer. Such
 * references can occur in sequence. The last occurrence of RelativeIdentifier
 * is the local identifier at the party recursively defined by the PrefixParty
 * and all preceding occurrences of RelativeIdentifier. Technical note: The
 * sequence of relative identifiers is used to avoid a recursive definition in
 * the catalogue.
 */
public class SingleQualifiedPartyIdentification1 {
}