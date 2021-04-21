package com.cahill.groovy;

import java.io.FileReader;
import java.io.IOException;

public class MyFile {
    public static FileReader getFile(String path) throws IOException {

        FileReader in = null;

        try {
            in = new FileReader(path);

        } finally {
            if (in != null){
                in.close();
            }
        }
        return in;
    }
}
