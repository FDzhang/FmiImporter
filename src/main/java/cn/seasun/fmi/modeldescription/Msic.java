package cn.seasun.fmi.modeldescription;

import java.util.List;

public class Msic {
    public static class DefaultExperiment {
        public Double startTime;
        public Double stopTime;
        public Double tolerance;
        public Double stepSize;
    }

    public static class Unit {
        public String name;
        public BaseUnit baseUnit;
        public List<DisplayUnit> displayUnits;
    }

    public static class BaseUnit {
        public Integer kg = 0;
        public Integer m = 0;
        public Integer s = 0;
        public Integer A = 0;
        public Integer K = 0;
        public Integer mol = 0;
        public Integer cd = 0;
        public Integer rad = 0;
        public Double factor = 1.0;
        public Double offset = 0.0;
    }

    public static class DisplayUnit {
        public String name;
        public Double factor = 1.0;
        public Double offset = 0.0;
    }

    public static class SimpleType {
        public String name;
        public String description;
    }

    public static class LogCategory {
        public String name;
        public String description;
    }
}
