package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @throws IllegalStateException if the directory already exists
     * @throws IllegalArgumentException if the path is invalid
     */
    public void newDirectory(String path) {
        if (dirOps.checkDirectoryExists(path)) {
            throw new IllegalStateException("Directory already exists: " + path);
        } else if (!dirOps.checkPathValid(path)) {
            throw new IllegalArgumentException("Invalid path: " + path);
        } else {
            dirOps.createDirectory(path);
        }
    }
}
