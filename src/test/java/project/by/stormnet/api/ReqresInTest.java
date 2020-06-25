package project.by.stormnet.api;

import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.by.stormnet.api.entities.UserService;

public class ReqresInTest {
    private UserService userService = new UserService();
    

    @Test
    public void createUser(){
        Response response = userService.createUser();
        int code = response.getCode();
        boolean containsId = response.getBody().contains("id");
        Assert.assertTrue(code == 201 && containsId, "User was created");
    }

    @Test
    public void updateUser(){
        Response response = userService.updateUser();
        int code = response.getCode();
        boolean containsUpdatedAt = response.getBody().contains("updatedAt");
        Assert.assertTrue(code == 200 && containsUpdatedAt, "User was updated");
    }

    @Test
    public void DeleteUser(){
        Response response = userService.deleteUser();
        int code = response.getCode();
        Assert.assertTrue(code == 204, "User was deleted");
    }
}
