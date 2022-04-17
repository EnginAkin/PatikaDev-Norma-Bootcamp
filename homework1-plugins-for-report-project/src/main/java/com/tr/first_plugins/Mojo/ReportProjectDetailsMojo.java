package com.tr.first_plugins.Mojo;

import com.tr.first_plugins.Utils.ReportProjectDetails;
import com.tr.first_plugins.Utils.Utils;
import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

import java.io.File;
import java.util.List;

@Mojo(name = "run", defaultPhase = LifecyclePhase.INSTALL)
public class ReportProjectDetailsMojo extends AbstractMojo {

    // first  : mvn clean install
    // second : mvn groupId:artifactId:goal  =>

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    String path=System.getProperty("user.dir")+"\\src\\main\\java";

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        // create report class while compile time in execute function
        // utils.getAllFileInProject return all file in project
        // ReportProjectDetails class count of the service class , controller class , data class , all class and get all endpoint


        ReportProjectDetails report=new ReportProjectDetails(path);

        // write project detail
        getLog().info("********************  REPORT **************************");
        getLog().info("* Number of class: "+report.getNumOfClass());
        getLog().info("* Number of Service class: "+report.getNumOfServiceClass());
        getLog().info("* Number of Controller class: "+report.getNumOfControllerClass());
        getLog().info("* Number of Data class: "+report.getNumOfModelClass());
        getLog().info("* Name of group id : "+project.getGroupId());
        getLog().info("* Name of artifact id : "+project.getArtifactId());
        getLog().info("* Description of project: "+project.getDescription());
        getLog().info("********************  ENDPOİNTS  **************************");

        getLog().info("********************  POSTMAPPING ENDPOİNTS  **************************");
        for (String s:report.getEndPoints().getPostMappingEndPoints()){
            getLog().info("* "+s);
        }
        getLog().info("********************  GETMAPPING ENDPOİNTS  **************************");
        for (String s:report.getEndPoints().getPostMappingEndPoints()){
            getLog().info("* "+s);
        }
        getLog().info("********************  END  **************************");
        List<Dependency> dependencies = project.getDependencies();
        long numDependencies = dependencies.stream().count();
        getLog().info("Number of dependencies: " + numDependencies);


    }



}
