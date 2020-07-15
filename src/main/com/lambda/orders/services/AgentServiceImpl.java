package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentServices {
    @Autowired
    private AgentRepository agentrepos;

    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }
}