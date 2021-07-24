package org.ananya.utils;

import org.ananya.service.AddDoctorMenuProcessor;
import org.ananya.service.ListDoctorsMenuProcessor;
import org.ananya.service.MenuProcessor;

import java.util.HashMap;
import java.util.Map;

public class MenuProcessorFactory {

    private Map<Integer, MenuProcessor> menuProcessors;

    public MenuProcessorFactory(){
        this.menuProcessors = new HashMap<Integer, MenuProcessor>();
        this.menuProcessors.put(1, new AddDoctorMenuProcessor());
        this.menuProcessors.put(2, new ListDoctorsMenuProcessor());
    }

    public MenuProcessor fetchMenuProcessors(int menuOption){
        return this.menuProcessors.get(menuOption);
    }

}

