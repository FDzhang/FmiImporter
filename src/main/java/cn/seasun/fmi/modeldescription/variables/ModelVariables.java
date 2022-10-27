package cn.seasun.fmi.modeldescription.variables;

import cn.seasun.fmi.modeldescription.variables.enums.Causality;

import java.util.*;
import java.util.stream.Collectors;

public abstract class ModelVariables {
    public List<TypedScalarVariable<?>> variables;

    public int getSize() {
        return variables.size();
    }

    public TypedScalarVariable<?> get(int idx) {
        return variables.get(idx);
    }

    public Iterator<TypedScalarVariable<?>> iterator() {
        return variables.iterator();
    }

    public List<IntegerVariable> getIntegers() {
        List<IntegerVariable> vars = new ArrayList<>();

        if (variables == null) {
            return vars;
        }

        for (TypedScalarVariable<?> variable : variables) {
            if (variable instanceof IntegerVariable) {
                vars.add((IntegerVariable) variable);
            }
        }
        return vars;
    }

    public List<RealVariable> getReals() {
        List<RealVariable> vars = new ArrayList<>();

        if (variables == null) {
            return vars;
        }

        for (TypedScalarVariable<?> variable : variables) {
            if (variable instanceof RealVariable) {
                vars.add((RealVariable) variable);
            }
        }
        return vars;
    }

    public List<StringVariable> getStrings() {
        List<StringVariable> vars = new ArrayList<>();

        if (variables == null) {
            return vars;
        }

        for (TypedScalarVariable<?> variable : variables) {
            if (variable instanceof StringVariable) {
                vars.add((StringVariable) variable);
            }
        }
        return vars;
    }

    public List<BooleanVariable> getBooleans() {
        List<BooleanVariable> vars = new ArrayList<>();

        if (variables == null) {
            return vars;
        }

        for (TypedScalarVariable<?> variable : variables) {
            if (variable instanceof BooleanVariable) {
                vars.add((BooleanVariable) variable);
            }
        }
        return vars;
    }

    public List<EnumerationVariable> getEnumerations() {
        List<EnumerationVariable> vars = new ArrayList<>();

        if (variables == null) {
            return vars;
        }

        for (TypedScalarVariable<?> variable : variables) {
            if (variable instanceof EnumerationVariable) {
                vars.add((EnumerationVariable) variable);
            }
        }
        return vars;
    }

    public boolean isValidValueReference(Long valueReference) {
        for (TypedScalarVariable<?> variable : variables) {
            if (variable.scalarVariable.valueReference.equals(valueReference)) {
                return true;
            }
        }
        return false;
    }

    public Long getValueReference(String name) {
        Long valueReference = getValueReferenceOrNull(name);
        if (valueReference == null) {
            throw new IllegalArgumentException("No variable with name '" + name + "'");
        }
        return valueReference;
    }

    public Long getValueReferenceOrNull(String name) {
        for (TypedScalarVariable<?> variable : variables) {
            if (variable.scalarVariable.name.equals(name)) {
                return variable.scalarVariable.valueReference;
            }
        }
        return null;
    }

    public Long[] getValueReferences(String[] names) {
        List<Long> valueReferences = new ArrayList<>();
        for (String name : names) {
            valueReferences.add(getValueReference(name));
        }
        return valueReferences.toArray(new Long[0]);
    }

    public List<TypedScalarVariable<?>> getByValueReference(
            Long valueReference,
            VariableType variableType) {
        return variables.stream()
                .filter(var ->
                        var.scalarVariable.type == variableType
                                && valueReference.equals(var.scalarVariable.valueReference))
                .collect(Collectors.toList());
    }

    public TypedScalarVariable<?> getByName(String name) {
        TypedScalarVariable<?> scalarVariable = getByNameOrNull(name);
        if (scalarVariable == null) {
            throw new IllegalArgumentException("No variable with name '" + name + "'");
        }
        return scalarVariable;
    }

    public TypedScalarVariable<?> getByNameOrNull(String name) {
        for (TypedScalarVariable<?> variable : variables) {
            if (variable.scalarVariable.name.equals(name)) {
                return variable;
            }
        }
        return null;
    }

    public List<TypedScalarVariable<?>> getByCausality(Causality causality) {
        return variables.stream()
                .filter(var ->
                        var.scalarVariable.causality == causality)
                .collect(Collectors.toList());
    }

}
