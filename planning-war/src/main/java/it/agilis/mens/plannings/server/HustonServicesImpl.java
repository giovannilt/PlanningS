package it.agilis.mens.plannings.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import it.agilis.mens.plannings.client.HustonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
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
public class HustonServicesImpl extends RemoteServiceServlet implements
        HustonService {
    @Autowired
    GitRepositoryState gitRepoState;

    public GitRepositoryState getGitRepoState() {
        return gitRepoState;
    }

    public void setGitRepoState(GitRepositoryState gitRepoState) {
        this.gitRepoState = gitRepoState;
    }

    @Autowired
    @Qualifier("propertiesManager")
    private PropertiesManager propertiesManager;

    public PropertiesManager getPropertiesManager() {
        return propertiesManager;
    }

    public void setPropertiesManager(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        WebApplicationContext ctx = WebApplicationContextUtils
                .getRequiredWebApplicationContext(config.getServletContext());
        AutowireCapableBeanFactory beanFactory = ctx
                .getAutowireCapableBeanFactory();
        beanFactory.autowireBean(this);
    }


}
