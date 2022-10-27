package cn.seasun.fmi.modeldescription.variables;

import cn.seasun.fmi.modeldescription.variables.enums.Causality;
import cn.seasun.fmi.modeldescription.variables.enums.Initial;
import cn.seasun.fmi.modeldescription.variables.enums.Variability;

import java.util.Locale;

public class ScalarVariable {
    public String name;
    public Long valueReference;
    public String description;

    public Causality causality;
    public Variability variability;
    public Initial initial;
    public VariableType type;

}

enum VariableType {
    INTEGER, REAL, BOOLEAN, STRING, ENUMERATION;

    public String getTypeName() {
        String name = this.name();
        String first = name.substring(0, 1);
        String other = name.substring(1).toLowerCase(Locale.ROOT);
        return first + other;
    }
}
