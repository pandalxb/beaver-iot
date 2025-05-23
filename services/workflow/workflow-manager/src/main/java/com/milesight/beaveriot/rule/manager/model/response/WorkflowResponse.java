package com.milesight.beaveriot.rule.manager.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkflowResponse {
    private String id;

    private String name;

    private String remark;

    private Boolean enabled;

    private String userNickname;

    private Long createdAt;

    private Long updatedAt;
}
