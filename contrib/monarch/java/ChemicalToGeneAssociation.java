import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ChemicalToGeneAssociation
 * <p>
 * An interaction between a chemical entity and a gene or gene product
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "object"
})
public class ChemicalToGeneAssociation {

    /**
     * the gene or gene product that is affected by the chemical
     * 
     */
    @JsonProperty("object")
    @JsonPropertyDescription("the gene or gene product that is affected by the chemical")
    private String object;

    /**
     * the gene or gene product that is affected by the chemical
     * 
     */
    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    /**
     * the gene or gene product that is affected by the chemical
     * 
     */
    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("object", object).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(object).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChemicalToGeneAssociation) == false) {
            return false;
        }
        ChemicalToGeneAssociation rhs = ((ChemicalToGeneAssociation) other);
        return new EqualsBuilder().append(object, rhs.object).isEquals();
    }

}
