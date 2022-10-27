package cn.seasun.fmi.modeldescription;

import cn.seasun.fmi.modeldescription.variables.ModelVariables;

import java.util.List;

public class ModelDescription {
    private String fmiVersion;
    private String modelName;
    private String guid;
    private String license;
    private String copyright;
    private String author;
    private String version;
    private String description;
    private String generationTool;
    private String variableNamingConvention;
    private String generationDateAndTime;

    private Msic.DefaultExperiment defaultExperiment;
    private ModelVariables modelVariables;
    private ModelStructure modelStructure;

    private List<Msic.Unit> unitDefinitions;
    private List<Msic.SimpleType> typeDefinitions;
    private List<Msic.LogCategory> logCategories;

    public Integer numberOfContinuousStates() {
        return modelStructure.derivatives.size();
    }


}
