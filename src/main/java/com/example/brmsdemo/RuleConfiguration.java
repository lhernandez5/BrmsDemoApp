package com.example.brmsdemo;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RuleConfiguration {
	@Bean
	public KieServices kieServices() {
		return KieServices.Factory.get();
	}
	
	@Bean
	public KieFileSystem kieFileSystem() {
		 KieFileSystem kieFileSystem = kieServices().newKieFileSystem();
		 kieFileSystem.write(ResourceFactory.newClassPathResource("../rules/banking_rules.drl"));
		 return kieFileSystem;
	}
	
	@Bean
	public KieContainer kieContainer() {
		KieServices kieServices = kieServices();
        KieRepository kieRepository = kieServices.getRepository();
        kieRepository.addKieModule(kieRepository::getDefaultReleaseId);
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem());
        kieBuilder.buildAll();
        KieContainer kieContainer = kieServices.newKieContainer(kieRepository.getDefaultReleaseId());
        return kieContainer;
	}
}
