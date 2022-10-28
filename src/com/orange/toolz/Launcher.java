package com.orange.toolz;

import com.orange.toolz.models.Data;
import com.orange.toolz.service.ValidatorService;
import com.orange.toolz.tasks.DataProcessingTask;
import com.orange.toolz.tasks.FileProcessingTask;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Launcher {
    public static void main(String[] args) {
        ArrayList<DataProcessingTask> dataProcessingTasks = new ArrayList<>();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ValidatorService service = ValidatorService.getInstance();
        service.initialize(availableProcessors);
        Data data = new Data();
        data.setAvailableProcessors(availableProcessors);
        data.setService(service);


        ArrayList<FileProcessingTask> tasks = new ArrayList<>();
        tasks.add(new FileProcessingTask(data));
        ExecutorService fileProcessingWorker = Executors.newSingleThreadExecutor();
        try{
            List<Future<ArrayList<DataProcessingTask>>> futures = fileProcessingWorker.invokeAll(tasks);
            for (Future future: futures) {
                dataProcessingTasks = (ArrayList<DataProcessingTask>) future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error : " + e.getMessage());
        }

        ExecutorService dataProcessorWorker = Executors.newFixedThreadPool(availableProcessors);

        try {
            List<Future<ArrayList<String>>> futures = dataProcessorWorker.invokeAll(dataProcessingTasks);
            for (Future future: futures) {
                String userdata = (String) future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
