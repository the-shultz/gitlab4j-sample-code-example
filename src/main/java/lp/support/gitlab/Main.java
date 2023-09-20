package lp.support.gitlab;

import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.RepositoryApi;
import org.gitlab4j.api.models.TreeItem;

import java.util.List;

public class Main {
    public static void main(String[] args) throws GitLabApiException {

        GitLabApi gitLabApi = new GitLabApi("https://gitlab.com", "<some token here>");
        RepositoryApi repositoryApi = gitLabApi.getRepositoryApi();

        List<TreeItem> master = repositoryApi.getTree("<some project id here>", "deployments/projects", "master");
        System.out.println("total of :" + master.size() + " items !");

    }
}