package com.orange.toolz.tasks;

import com.orange.toolz.models.Data;
import com.orange.toolz.utility.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class FileProcessingTask implements Callable<ArrayList<DataProcessingTask>> {

    private Data data;
    private int tokenNumber = 0;

    public FileProcessingTask() {
    }

    public FileProcessingTask(Data data) {
        this.data = data;
    }

    @Override
    public ArrayList<DataProcessingTask> call() throws Exception {
        ArrayList<DataProcessingTask> results = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(Utils.FILE_PATH));
            String sr;
            while ((sr = reader.readLine()) != null) {
                tokenNumber++;
                DataProcessingTask aTask = new DataProcessingTask(data, sr, tokenNumber);
                results.add(aTask);
                System.out.println("Token : " + tokenNumber);
                System.out.println("Worker : " + sr);
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return results;
    }
}
