package models;

/**
 * Created by casab on 11/2/2017.
 */
public class LoginModel {
    private String emailAddress;
    private String password;
    private String errorMessage;
    private boolean validCredentials;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isValidCredentials() {
        return validCredentials;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
