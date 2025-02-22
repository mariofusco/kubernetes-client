
package io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "apiGroups",
    "apiVersions",
    "operations",
    "resourceNames",
    "resources",
    "scope"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
public class NamedRuleWithOperations implements KubernetesResource
{

    @JsonProperty("apiGroups")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> apiGroups = new ArrayList<String>();
    @JsonProperty("apiVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> apiVersions = new ArrayList<String>();
    @JsonProperty("operations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> operations = new ArrayList<String>();
    @JsonProperty("resourceNames")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> resourceNames = new ArrayList<String>();
    @JsonProperty("resources")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> resources = new ArrayList<String>();
    @JsonProperty("scope")
    private String scope;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NamedRuleWithOperations() {
    }

    /**
     * 
     * @param resourceNames
     * @param operations
     * @param apiVersions
     * @param scope
     * @param resources
     * @param apiGroups
     */
    public NamedRuleWithOperations(List<String> apiGroups, List<String> apiVersions, List<String> operations, List<String> resourceNames, List<String> resources, String scope) {
        super();
        this.apiGroups = apiGroups;
        this.apiVersions = apiVersions;
        this.operations = operations;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.scope = scope;
    }

    @JsonProperty("apiGroups")
    public List<String> getApiGroups() {
        return apiGroups;
    }

    @JsonProperty("apiGroups")
    public void setApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
    }

    @JsonProperty("apiVersions")
    public List<String> getApiVersions() {
        return apiVersions;
    }

    @JsonProperty("apiVersions")
    public void setApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
    }

    @JsonProperty("operations")
    public List<String> getOperations() {
        return operations;
    }

    @JsonProperty("operations")
    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    @JsonProperty("resourceNames")
    public List<String> getResourceNames() {
        return resourceNames;
    }

    @JsonProperty("resourceNames")
    public void setResourceNames(List<String> resourceNames) {
        this.resourceNames = resourceNames;
    }

    @JsonProperty("resources")
    public List<String> getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
