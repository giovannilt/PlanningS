package it.agilis.mens.plannings.server;

import it.agilis.mens.plannings.client.HustonService;
import it.agilis.mens.plannings.core.register.impl.PlanningSRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 2/27/12
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */

@Service("hustonService")
public class HustonServicesImpl implements HustonService {
    @Autowired
    private GitRepositoryState gitRepoState;

    @Autowired
    private PlanningSRegister register;

    @Autowired
    @Qualifier("propertiesManager")
    private PropertiesManager propertiesManager;


    public GitRepositoryState getGitRepoState() {
        return gitRepoState;
    }

    public void setGitRepoState(GitRepositoryState gitRepoState) {
        this.gitRepoState = gitRepoState;
    }

    public PropertiesManager getPropertiesManager() {
        return propertiesManager;
    }

    public void setPropertiesManager(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
    }

    public PlanningSRegister getRegister() {
        return register;
    }

    public void setRegister(PlanningSRegister register) {
        this.register = register;
    }




}
