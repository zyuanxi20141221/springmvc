package com.yidian.service;

import com.yidian.domain.Role;

import java.util.List;

public interface RoleService {

    List<Role> list();

    void save(Role role);

}
