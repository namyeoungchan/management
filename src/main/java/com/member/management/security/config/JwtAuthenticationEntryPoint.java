package com.member.management.security.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(.HttpServletRequest request,
                                        HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {

    }
}
