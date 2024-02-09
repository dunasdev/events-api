package com.romm.events.DTOs;

import com.romm.events.enums.UserRole;

public record UserRegisterDTO(String username, String password, UserRole role) {
    
}
