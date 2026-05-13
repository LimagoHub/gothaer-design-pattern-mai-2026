package de.fi;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

public class Table implements Closeable {

    public Table(String sqlString) {
    }


    // Anzahl der Spalten in der Tabelle
    public int getColumnCount() throws Exception{
        return 0;
    }

    // Columnname 0 basiert
    public String getColumnName(int i) throws Exception{
        return null;
    }

    // o basiert
    public String getString(int i) throws Exception{
        return null;
    }

    public String getString(String name) throws Exception{
        return null;
    }

    public boolean next() throws Exception{
        return false;
    }

    @Override
    public void close() throws IOException {

    }
}
