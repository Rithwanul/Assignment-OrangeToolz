package com.orange.toolz.service;

import java.util.ArrayList;

public class ValidatorService {

    private static ValidatorService INSTANCE = null;
    private static boolean isSystemInitialize = false;
    private ArrayList<MyValidatorService> validators = new ArrayList<>();

    public ValidatorService() {
    }

    public static ValidatorService getInstance() {
        if (INSTANCE == null)
            return new ValidatorService();
        return INSTANCE;
    }

    public void initialize(int availableProcessors) {
        if (!isSystemInitialize) {
            validators = new ArrayList<MyValidatorService>();
            for (int i = 0; i < availableProcessors; i++) {
                validators.add(new MyValidatorService());
            }
            isSystemInitialize = true;
        }
    }

    public MyValidatorService getValidator(int number) {
        if (isSystemInitialize) {
            return validators.get(number);
        }
        return null;
    }
}
