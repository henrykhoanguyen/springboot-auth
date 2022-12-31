package com.my.fin.model;

import com.plaid.client.ApiClient;
import com.plaid.client.request.PlaidApi;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PlaidConnection {
    private final PlaidApi plaidClient;
    private final ApiClient apiClient;
    private final String plaidEnv;
    private final String plaidProducts;
    private final String plaidCountryCodes;

    public PlaidConnection(PlaidApi plaidClient, ApiClient apiClient, String plaidEnv, String plaidProducts, String plaidCountryCodes) {
        this.plaidClient = plaidClient;
        this.apiClient = apiClient;
        this.plaidEnv = plaidEnv;
        this.plaidProducts = plaidProducts;
        this.plaidCountryCodes = plaidCountryCodes;
    }
}
