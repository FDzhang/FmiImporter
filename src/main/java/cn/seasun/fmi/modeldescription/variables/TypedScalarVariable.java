package cn.seasun.fmi.modeldescription.variables;

import cn.seasun.fmi.modeldescription.variables.enums.Causality;
import cn.seasun.fmi.modeldescription.variables.enums.Initial;
import cn.seasun.fmi.modeldescription.variables.enums.Variability;

public class TypedScalarVariable<E> {
    public ScalarVariable scalarVariable;
    public TypedAttribute<E> typedAttribute;

}

class BoundedScalarVariable<E> extends TypedScalarVariable<E> {
    public BoundedTypedAttribute<E> typedAttribute;
}

class IntegerVariable extends BoundedScalarVariable<Integer> {
    public IntegerVariable(ScalarVariable v, IntegerAttribute a) {
        scalarVariable = v;
        typedAttribute = a;
    }

    public VariableType getType() {
        return VariableType.INTEGER;
    }

    @Override
    public String toString() {
        String name = scalarVariable.name;
        Long valueReference = scalarVariable.valueReference;
        Integer start = typedAttribute.start;
        Integer min = typedAttribute.min;
        Integer max = typedAttribute.max;
        Causality causality = scalarVariable.causality;
        Variability variability = scalarVariable.variability;
        Initial initial = scalarVariable.initial;
        String description = scalarVariable.description;
        String declaredType = typedAttribute.declaredType;

        String clazzName = IntegerVariable.class.getName();


        return clazzName + "{" +
                name + ", " +
                valueReference + ", " +
                start + ", " +
                min + ", " +
                max + ", " +
                causality + ", " +
                variability + ", " +
                initial + ", " +
                description + ", " +
                declaredType +
                "}";
    }

}

class RealVariable extends BoundedScalarVariable<Double> {
    public RealVariable(ScalarVariable v, RealAttribute a) {
        scalarVariable = v;
        typedAttribute = a;
    }

    public VariableType getType() {
        return VariableType.REAL;
    }

    @Override
    public String toString() {
        String name = scalarVariable.name;
        Long valueReference = scalarVariable.valueReference;
        Double start = typedAttribute.start;
        Double min = typedAttribute.min;
        Double max = typedAttribute.max;
        Causality causality = scalarVariable.causality;
        Variability variability = scalarVariable.variability;
        Initial initial = scalarVariable.initial;
        String description = scalarVariable.description;
        String declaredType = typedAttribute.declaredType;

        String clazzName = IntegerVariable.class.getName();


        return clazzName + "{" +
                name + ", " +
                valueReference + ", " +
                start + ", " +
                min + ", " +
                max + ", " +
                causality + ", " +
                variability + ", " +
                initial + ", " +
                description + ", " +
                declaredType +
                "}";
    }

}

class BooleanVariable extends BoundedScalarVariable<Boolean> {
    public BooleanVariable(ScalarVariable v, BooleanAttribute a) {
        scalarVariable = v;
        typedAttribute = a;
    }

    public VariableType getType() {
        return VariableType.BOOLEAN;
    }

    @Override
    public String toString() {
        String name = scalarVariable.name;
        Long valueReference = scalarVariable.valueReference;
        Boolean start = typedAttribute.start;
        Causality causality = scalarVariable.causality;
        Variability variability = scalarVariable.variability;
        Initial initial = scalarVariable.initial;
        String description = scalarVariable.description;
        String declaredType = typedAttribute.declaredType;

        String clazzName = IntegerVariable.class.getName();


        return clazzName + "{" +
                name + ", " +
                valueReference + ", " +
                start + ", " +
                causality + ", " +
                variability + ", " +
                initial + ", " +
                description + ", " +
                declaredType +
                "}";
    }

}

class StringVariable extends BoundedScalarVariable<String> {
    public StringVariable(ScalarVariable v, StringAttribute a) {
        scalarVariable = v;
        typedAttribute = a;
    }

    public VariableType getType() {
        return VariableType.STRING;
    }

    @Override
    public String toString() {
        String name = scalarVariable.name;
        Long valueReference = scalarVariable.valueReference;
        String start = typedAttribute.start;
        Causality causality = scalarVariable.causality;
        Variability variability = scalarVariable.variability;
        Initial initial = scalarVariable.initial;
        String description = scalarVariable.description;
        String declaredType = typedAttribute.declaredType;

        String clazzName = IntegerVariable.class.getName();


        return clazzName + "{" +
                name + ", " +
                valueReference + ", " +
                start + ", " +
                causality + ", " +
                variability + ", " +
                initial + ", " +
                description + ", " +
                declaredType +
                "}";
    }

}

class EnumerationVariable extends BoundedScalarVariable<Integer> {
    public EnumerationVariable(ScalarVariable v, EnumerationAttribute a) {
        scalarVariable = v;
        typedAttribute = a;
    }

    public VariableType getType() {
        return VariableType.ENUMERATION;
    }

    @Override
    public String toString() {
        String name = scalarVariable.name;
        Long valueReference = scalarVariable.valueReference;
        Integer start = typedAttribute.start;
        Causality causality = scalarVariable.causality;
        Variability variability = scalarVariable.variability;
        Initial initial = scalarVariable.initial;
        String description = scalarVariable.description;
        String declaredType = typedAttribute.declaredType;

        String clazzName = IntegerVariable.class.getName();


        return clazzName + "{" +
                name + ", " +
                valueReference + ", " +
                start + ", " +
                causality + ", " +
                variability + ", " +
                initial + ", " +
                description + ", " +
                declaredType +
                "}";
    }

}