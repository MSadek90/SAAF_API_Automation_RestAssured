
package com.api.Service;

import com.api.Client.RestClient;
import com.api.Endpoints.AllEndPoints;

import io.restassured.response.Response;

public class GetTokenService {

    public static Response getTokenForAdmin(int id) {
        return RestClient.show(AllEndPoints.GET_TOKEN_FOR_ADMIN, "id", id);
    }
}