package com.insertign.pineapple;

import com.insertign.pineapple.http.RequestFactory;
import com.insertign.pineapple.util.Endpoints;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Testing {
    private static final String key = "0e6c4ef5-6253-417b-a1f8-aac9462f206d";
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        RequestFactory.start();
        JSONObject obj = new JSONObject(RequestFactory.send(Endpoints.getPlayerByUUIDEndpoint(key, "e5e47224f8274628b39db4c87f582272")));
        System.out.println(obj.getJSONObject("player").getString("displayname"));
        RequestFactory.close();
        HypixelAPI.shutdown();
    }
}
