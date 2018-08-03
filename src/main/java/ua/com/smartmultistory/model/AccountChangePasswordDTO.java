package ua.com.smartmultistory.model;

import lombok.Data;

/**
 * get this entity when password changing
 * given passwords not encoded (user typed)
 */

@Data
public class AccountChangePasswordDTO {
    private String oldPassword;
    private String newPassword;
}
