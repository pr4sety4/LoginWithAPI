package id.co.asyst.prasetya.logintest.Model;

import com.google.gson.annotations.SerializedName;

public class UserRequest {
    String method;
    @SerializedName("param")
    User userAndPass;

    public User getUserAndPass() {
        return userAndPass;
    }

    public void setUserAndPass(User userAndPass) {
        this.userAndPass = userAndPass;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}
