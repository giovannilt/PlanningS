package it.agilis.mens.plannings.server;

import it.agilis.mens.plannings.client.HustonService;
import it.agilis.mens.plannings.core.register.impl.PlanningSRegister;
import net.sf.gilead.gwt.PersistentRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 2/27/12
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */

@Service("hustonService")
public class HustonServicesImpl extends PersistentRemoteService implements HustonService {
    @Autowired
    @Qualifier("gitRepositoryInformation")
    private GitRepositoryState gitRepoState;

    @Autowired
    @Qualifier("PlanningSRegister")
    private PlanningSRegister register;


    public GitRepositoryState getGitRepoState() {
        return gitRepoState;
    }
    @Autowired
    public void setGitRepoState(GitRepositoryState gitRepoState) {
        this.gitRepoState = gitRepoState;
    }


    public PlanningSRegister getRegister() {
        return register;
    }
    @Autowired
    public void setRegister(PlanningSRegister register) {
        this.register = register;
    }


}
