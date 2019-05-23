package com.company;

import com.company.interfaces.Worker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerImpl implements Worker {

    List<Integer> cancelAvailable;
    Map<Integer, Boolean> cancelList = new HashMap<>();

    public List<Integer> getCancelAvailable() {
        return cancelAvailable;
    }

    public void setCancelAvailable(List<Integer> cancelAvailable) {
        this.cancelAvailable = cancelAvailable;
    }

    public boolean checkService(DataType service){

        for (Integer[] arrayRange : service.getConnectedId()){
            if (arrayRange[1] == -1){
                checkId(arrayRange[0]);
            }
            else checkIdSequence(arrayRange);
        }

        toStringMap(cancelList);
        return false;
    }

    private void toStringMap(Map<?,?> map){

        for (Map.Entry<?,?> entry : map.entrySet()){
            System.out.println("key " + entry.getKey() + " val " + entry.getValue());
        }
    }

    public void checkIdSequence(Integer[] arrayRange){

        int start = arrayRange[0], end = arrayRange[1];
        while (start <= end){
            checkId(start);
            ++start;
        }

    }

    void checkId(int id){
        System.out.println("id " + id);
        System.out.println(cancelAvailable);
        if (cancelAvailable.contains(id))
            cancelList.put(id, true);
        else cancelList.put(id, false);

    }
}
