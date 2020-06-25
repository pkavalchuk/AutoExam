package project.by.stormnet.api.entities;

import by.stormnet.core.FrameworkHttpClient;
import by.stormnet.core.Response;

public class UserService extends AbstractService {
    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String createUrl = baseUrl2 + "users";
    private String createBody = "{\"name\": \"morpheus\", \"job\": \"leader\"}";

    private String updateUrl = baseUrl2 + "users/2";
    private String updateBody = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";

    private String deleteUrl = baseUrl2 + "users/2";

    public Response createUser() {
        System.out.println("Let's create user...");
        return client.doPost(createUrl, createBody);
    }

    public Response updateUser(){
        System.out.println("Let's update user...");
        return client.doPut(updateUrl, updateBody);
    }

    public Response deleteUser(){
        System.out.println("Let's delete user...");
        return client.doDelete(deleteUrl);
    }
}
