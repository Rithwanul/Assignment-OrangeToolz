package com.orange.toolz.tasks;

import com.orange.toolz.models.Data;
import com.orange.toolz.service.MyValidatorService;
import com.orange.toolz.service.ValidatorService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class DataProcessingTask implements Callable<ArrayList<String>> {

    private int tokenNumber;
    private Data data;
    private String userData;

    public DataProcessingTask() {
    }

    public DataProcessingTask(Data data, String userData, int tokenNumber) {
        this.data = data;
        this.userData = userData;
        this.tokenNumber = tokenNumber;
    }

    @Override
    public ArrayList<String> call() throws Exception {
        int availableProcessors = data.getAvailableProcessors();
        ValidatorService service = data.getService();
        MyValidatorService validator = service.getValidator(tokenNumber % availableProcessors);
        List<String> userDetails = Arrays.asList(userData.split(","));
        boolean isPhoneNumberValid = validator.isPhoneNumberValid(userDetails.get(5));



        return null;
    }
}
