package ru.netology.manager;

import java.util.*;

public class FileOpenManager {
    Map<String, String> extApp = new HashMap<>();

    public void add(String ext, String app) {
        extApp.put(ext.toLowerCase(), app);
    }

    public String getApp(String ext) {
        return extApp.get(ext.toLowerCase());
    }

    public void delExt(String ext) {
        extApp.remove(ext.toLowerCase());
    }

    public Set<String> getAllExts() {
        return extApp.keySet();
    }

    public Set<String> getAllApps() {
        List<String> list = new ArrayList<>(extApp.values());
        return Set.copyOf(list);
    }
}
