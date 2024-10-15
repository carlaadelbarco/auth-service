package com.auth.authservice.domain.models.ports.inputs;

import com.auth.authservice.domain.models.User;

public interface LoginUseCase {

    User loginUser(String email, String password);

}
