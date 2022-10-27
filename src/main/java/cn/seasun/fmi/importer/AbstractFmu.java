package cn.seasun.fmi.importer;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AbstractFmu implements Closeable {
    private String name;
    private File extractedFmu;

    private String guid;
    private String modelName;

    private AtomicBoolean isClosed = new AtomicBoolean(false);

    @Override
    public void close() throws IOException {

    }
}
