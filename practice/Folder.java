package practice;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
    private List<Node> nodes;

    public Folder(String name) {
        super(name);
        nodes = new ArrayList<>();
    }

    public void add(File file) {
        nodes.add(file);
    }

    public void add(Folder folder) {
        nodes.add(folder);
    }

    @Override
    public long getSize() {
        long total = 0;
        for (int i = 0; i < nodes.size(); i++) {
            total += nodes.get(i).getSize();
        }
        return total;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
