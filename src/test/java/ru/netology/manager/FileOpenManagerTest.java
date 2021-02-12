package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {

    FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    public void setup() {
        manager.add("doc", "Microsoft Word");
        manager.add("docx", "Microsoft Word");
        manager.add("jpg", "Gimp");
        manager.add("png", "Gimp");
        manager.add("txt", "Notepad");
    }

    @Test
    public void shouldGetApp() {
        assertEquals("Microsoft Word", manager.getApp("doc"));
    }

    @Test
    public void shouldDelExt() {
        manager.delExt("jpg");
        assertNull(manager.getApp("jpg"));
    }

    @Test
    public void shouldGetAllExt() {
        assertEquals(Set.of("doc", "docx", "jpg", "png", "txt"), manager.getAllExts());
    }

    @Test
    public void shouldGetAllApps() {
        assertEquals(Set.of("Microsoft Word", "Gimp", "Notepad"), manager.getAllApps());
    }

}