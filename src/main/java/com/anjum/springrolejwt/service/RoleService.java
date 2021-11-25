package com.anjum.springrolejwt.service;

import com.anjum.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
