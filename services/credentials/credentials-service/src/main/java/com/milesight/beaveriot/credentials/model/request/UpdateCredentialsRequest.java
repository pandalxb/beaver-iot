package com.milesight.beaveriot.credentials.model.request;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCredentialsRequest {

    private String description;

    private String accessKey;

    private String accessSecret;

    private JsonNode additionalData;

}
