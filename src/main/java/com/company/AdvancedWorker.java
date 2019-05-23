package com.company;

import com.company.interfaces.Worker;
import org.apache.commons.lang3.Range;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This class using external lib Range
public class AdvancedWorker implements Worker {

    List<Integer> cancelAvailable;
    Map<Integer, Boolean> cancelList = new HashMap<>();

    public List<Integer> getCancelAvailable() {
        return cancelAvailable;
    }

    public void setCancelAvailable(List<Integer> cancelAvailable) {
        this.cancelAvailable = cancelAvailable;
    }

    public boolean checkService(DataType service){

        for (Integer id : cancelAvailable)
            cancelList.put(id, isAvailable(id, service.getConnectedIdRange()));
        toStringMap(cancelList);
        return false;
    }

    public boolean isAvailable(Integer id,List<Range<Integer>> list){

        for (Range<Integer> range : list){
            if (range.contains(id))
                return true;
        }
        return false;
    }

    private void toStringMap(Map<?,?> map){

        for (Map.Entry<?,?> entry : map.entrySet()){
            System.out.println("key " + entry.getKey() + " val " + entry.getValue());
        }
    }
}
