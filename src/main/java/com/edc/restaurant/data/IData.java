package com.edc.restaurant.data;

import com.edc.restaurant.models.ConfigFile;
import java.util.ArrayList;

public interface IData {
    public ArrayList readData(String fileName);
    public ConfigFile readConfigFile(String path);
}
