package cn.seasun.fmi.modeldescription.variables;

public class Attributes {

}

class TypedAttribute<E> {
    public String declaredType;
    public E start;
}

class BoundedTypedAttribute<E> extends TypedAttribute<E> {
    public E min;
    public E max;
    public String quantity;
}

class IntegerAttribute extends BoundedTypedAttribute<Integer> {

}

class StringAttribute extends BoundedTypedAttribute<String> {

}

class BooleanAttribute extends BoundedTypedAttribute<Boolean> {

}

class EnumerationAttribute extends BoundedTypedAttribute<Integer> {

}

class RealAttribute extends BoundedTypedAttribute<Double> {
    public Double nominal;
    public Integer derivative;
    public Boolean unbounded;
    public Boolean reinit;
    public String unit;
    public String displayUnit;
    public Boolean relativeQuantity;
}
