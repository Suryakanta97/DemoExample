package com.surya.filepath;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JavaFilePathUnitTest {

    private static String userDir;

    @BeforeClass
    public static void createFilesAndFolders() throws IOException {
        userDir = System.getProperty("user.dir");

        new File(userDir + "/surya/foo").mkdirs();
        new File(userDir + "/surya/bar/baz").mkdirs();
        new File(userDir + "/surya/foo/foo-one.txt").createNewFile();
        new File(userDir + "/surya/foo/foo-two.txt").createNewFile();
        new File(userDir + "/surya/bar/bar-one.txt").createNewFile();
        new File(userDir + "/surya/bar/bar-two.txt").createNewFile();
        new File(userDir + "/surya/bar/baz/baz-one.txt").createNewFile();
        new File(userDir + "/surya/bar/baz/baz-two.txt").createNewFile();

    }

    @Test
    public void whenPathResolved_thenSuccess() {
        File file = new File("surya/foo/foo-one.txt");
        String expectedPath = isWindows() ? "surya\\foo\\foo-one.txt" : "surya/foo/foo-one.txt";
        String actualPath = file.getPath();
        assertEquals(expectedPath, actualPath);
    }

    @Test
    public void whenAbsolutePathResolved_thenSuccess() {
        File file = new File("surya/foo/foo-one.txt");
        String expectedPath = isWindows() ? userDir + "\\surya\\foo\\foo-one.txt" : userDir + "/surya/foo/foo-one.txt";
        String actualPath = file.getAbsolutePath();
        assertEquals(expectedPath, actualPath);
    }

    @Test
    public void whenAbsolutePathWithShorthandResolved_thenSuccess() {
        File file = new File("surya/bar/baz/../bar-one.txt");
        String expectedPath = isWindows() ? userDir + "\\surya\\bar\\baz\\..\\bar-one.txt" : userDir + "/surya/bar/baz/../bar-one.txt";
        String actualPath = file.getAbsolutePath();
        assertEquals(expectedPath, actualPath);
    }

    @Test
    public void whenCanonicalPathWithShorthandResolved_thenSuccess() throws IOException {
        File file = new File("surya/bar/baz/../bar-one.txt");
        String expectedPath = isWindows() ? userDir + "\\surya\\bar\\bar-one.txt" : userDir + "/surya/bar/bar-one.txt";
        String actualPath = file.getCanonicalPath();
        assertEquals(expectedPath, actualPath);
    }

    @Test
    public void whenCanonicalPathWithDotShorthandResolved_thenSuccess() throws IOException {
        File file = new File("surya/bar/baz/./baz-one.txt");
        String expectedPath = isWindows() ? userDir + "\\surya\\bar\\baz\\baz-one.txt" : userDir + "/surya/bar/baz/baz-one.txt";
        String actualPath = file.getCanonicalPath();
        assertEquals(expectedPath, actualPath);
    }

    @Test(expected = IOException.class)
    public void givenWindowsOs_whenCanonicalPathWithWildcard_thenIOException() throws IOException {
        Assume.assumeTrue(isWindows());
        new File("*").getCanonicalPath();
    }

    @AfterClass
    public static void deleteFilesAndFolders() {
        File suryaDir = new File(userDir + "/surya");
        deleteRecursively(suryaDir);
    }

    private static void deleteRecursively(File dir) {
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                deleteRecursively(f);
            }
            f.delete();
        }
        dir.delete();
    }

    private static boolean isWindows() {
        String osName = System.getProperty("os.name");
        return osName.contains("Windows");
    }

}
