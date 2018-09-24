package com.instanect.aks_mvp.mvp.interactors.file;

import com.instanect.aks_mvp.mvp.interactors.file.interfaces.AbstractFileInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.file.interfaces.FileHelperInterface;

import java.io.FileNotFoundException;

public abstract class AbstractFileInteractor implements AbstractFileInteractorInterface {

    private FileHelperInterface fileHelperInterface;

    public AbstractFileInteractor(FileHelperInterface fileHelperInterface) {

        this.fileHelperInterface = fileHelperInterface;
    }


    public void saveFileWithOverwrite(String fileName, String fileContent) {

        String fileLocation = fileHelperInterface.createFile(fileName);

        fileHelperInterface.saveFileWithOverwrite(fileLocation, fileContent);
    }

    public void saveFile(String fileName, String fileContent) {
        fileHelperInterface.saveFile(fileName, fileContent);
    }

    public boolean checkFileExists(String fileName) throws FileNotFoundException {
        return fileHelperInterface.checkFileExists(fileName);
    }

    public String saveFileContentToCache(String fileContent) {

        String fileName = fileHelperInterface.createCacheFile();

        fileHelperInterface.saveFile(fileName, fileContent);

        return fileName;
    }


    public String saveFileToCache(String fileName, String fileContent) {
        String completeFileName = fileHelperInterface.getCompleteCacheFileLocation(fileName);

        fileHelperInterface.saveFile(fileName, fileContent);

        return completeFileName;
    }


    public String getFileContent(String fileName) throws FileNotFoundException {

        return fileHelperInterface.getFileContent(fileName);
    }

    public String getCacheFileContent(String fileName) throws FileNotFoundException {

        String completeFileName = fileHelperInterface.getCompleteCacheFileLocation(fileName);

        return fileHelperInterface.getFileContent(completeFileName);
    }
}
