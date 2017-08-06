package com.niit.pocono.dao;

public interface BillingAddressDAO {
		void saveOrUpdate(BillingAddressDAO billingAddress);
	 void deleteBillingAddress(String billingAddressId);
	BillingAddressDAO getBillingAddress(String billingAddressId);

}
