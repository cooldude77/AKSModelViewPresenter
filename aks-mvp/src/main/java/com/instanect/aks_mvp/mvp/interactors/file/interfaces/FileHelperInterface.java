package com.instanect.aks_mvp.mvp.interactors.file.interfaces;

import java.io.FileNotFoundException;

public interface FileHelperInterface {
    void saveFileWithOverwrite(String fileName, String fileContent);

    void saveFile(String fileName, String fileContent);

    boolean checkFileExists(String fileName) throws FileNotFoundException;

    String createCacheFile();

    String getCompleteCacheFileLocation(String fileName);

    String getFileContent(String fileName) throws FileNotFoundException;

    String createFile(String fileName);
}
