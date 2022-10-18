package study.security.basic.core.controller;

import lombok.*;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class SecurityMessage {

    private UserDetails user;
    private String message;
}
