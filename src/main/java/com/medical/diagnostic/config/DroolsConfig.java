package com.medical.diagnostic.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    // Create and configure a KieContainer from the classpath
    @Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }

    // Create a new KieSession using the KieContainer
    @Bean
    public KieSession kieSession(KieContainer kieContainer) {
        return kieContainer.newKieSession("ksession-rules");
    }
}