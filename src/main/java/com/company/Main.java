package com.company;

import org.apache.commons.lang3.Range;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        WorkerImpl worker = new WorkerImpl();
        AdvancedWorker worker = new AdvancedWorker();
        worker.setCancelAvailable( Arrays.asList(1, 3, 12, 44, 46, 57));

        DataType service = new DataType(1);
        service.setConnectedIdRange(Arrays.asList(Range.between(1,5), Range.between(12, 12), Range.between(45, 55)));
        service.setConnectedId(Arrays.asList(new Integer[]{1, 5},  new Integer[]{12, -1}, new Integer[]{45, 55}));

        worker.checkService(service);
    }
}
