/**
 * 
 */
package com.surya.kubernetes.admission.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "admission-controller")
@Data
public class AdmissionControllerProperties {

    private boolean disabled;
    private String annotation = "com.surya/wait-for-it";
    private String waitForItImage = "willwill/wait-for-it";

}
