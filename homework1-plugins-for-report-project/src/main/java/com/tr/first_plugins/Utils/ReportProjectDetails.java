package com.tr.first_plugins.Utils;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



@RequiredArgsConstructor
@Data
public class ReportProjectDetails {

    private List<File> files=new ArrayList<>();
    private int numOfClass;
    private int numOfServiceClass;
    private int numOfControllerClass;
    private int numOfModelClass;
    private EndPointReport endPoints=new EndPointReport();


    public ReportProjectDetails(String path){

        this.files=Utils.listf(path,files);
        numOfClass=files.size();
        reportClassDetails();

    }


    private void reportClassDetails(){
        try {
            for(File file:files){
                Scanner myReader = new Scanner(file);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if(checkIfDataService(data)){
                        this.numOfServiceClass++;
                    }
                   if(checkIfDataController(data) || checkIfDataRestController(data)){

                       endPoints.endPointReport(file);
                        this.numOfControllerClass++;
                    }
                    if(checkIfDataEntity(data)){
                        this.numOfModelClass++;
                    }
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    private boolean checkIfDataService(String data) {
        return data.equals("@Service");
    }
    private boolean checkIfDataController(String data) {
        return data.equals("@Controller");
    }
    private boolean checkIfDataRestController(String data) {
        return data.equals("@RestController");
    }
    private boolean checkIfDataEntity(String data) {
        return data.equals("@Entity");
    }


}
