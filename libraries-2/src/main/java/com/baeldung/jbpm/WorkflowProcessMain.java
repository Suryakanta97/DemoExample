package com.surya.jbpm;

import org.kie.api.runtime.manager.Context;
import org.kie.internal.runtime.manager.context.EmptyContext;

import com.surya.jbpm.engine.WorkflowEngine;
import com.surya.jbpm.engine.WorkflowEngineImpl;

public class WorkflowProcessMain {

    public static void main(String[] args) {
        WorkflowEngine workflowEngine = new WorkflowEngineImpl();
        String processId = "com.surya.bpmn.helloworld";
        String kbaseId = "kbase";
        String persistenceUnit = "org.jbpm.persistence.jpa";
        Context<String> initialContext = EmptyContext.get();
        workflowEngine.runjBPMEngineForProcess(processId, initialContext, kbaseId, persistenceUnit);
    }
}