package com.demotivirus.Day_059;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class UpdateUserRoleRequestType {
    private Long systemId;
    private Long messageId;
    private Long sessionId;
    private String roleCode;
}
