package com.surya.drools.service;

import com.surya.drools.config.DroolsBeanFactory;
import com.surya.drools.model.Applicant;
import com.surya.drools.model.SuggestedRole;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.io.IOException;

public class ApplicantService {

    KieSession kieSession=new DroolsBeanFactory().getKieSession();

    public SuggestedRole suggestARoleForApplicant(Applicant applicant,SuggestedRole suggestedRole) throws IOException {
        kieSession.insert(applicant);
        kieSession.setGlobal("suggestedRole",suggestedRole);
        kieSession.fireAllRules();
        System.out.println(suggestedRole.getRole());
        return  suggestedRole;

    }
}
