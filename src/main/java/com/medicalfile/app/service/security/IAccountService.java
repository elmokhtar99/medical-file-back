package com.medicalfile.app.service.security;


import com.medicalfile.app.domain.security.AppRole;
import com.medicalfile.app.domain.security.AppUser;
import com.medicalfile.app.dto.BaseResponse;
import com.medicalfile.app.dto.ChangePasswordDto;

import java.util.List;

public interface IAccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> findAllUsers();
    boolean isExistByUsername(String username);
    BaseResponse changePassword(ChangePasswordDto changePasswordDto);
    BaseResponse newPassword(ChangePasswordDto changePasswordDto);

    BaseResponse deleteUserByUsername(String username);

}
