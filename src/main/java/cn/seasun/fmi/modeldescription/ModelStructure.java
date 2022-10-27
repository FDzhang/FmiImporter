package cn.seasun.fmi.modeldescription;

import java.util.ArrayList;
import java.util.List;

public class ModelStructure {

    public List<Unknown> outputs = new ArrayList<>();
    public List<Unknown> derivatives = new ArrayList<>();
    public List<Unknown> initialUnknowns = new ArrayList<>();

    public static class Unknown {
        public Integer index;
        public List<Integer> dependencies;
        public List<String> dependenciesKind;
    }
}
