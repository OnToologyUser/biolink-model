# Class: molecular entity


A gene, gene product, small molecule or macromolecule (including protein complex)

URI: [http://bioentity.io/vocab/MolecularEntity](http://bioentity.io/vocab/MolecularEntity)

![img](http://yuml.me/diagram/nofunky;dir:TB/class/\[MolecularEntity|full_name(i):label_type%20%3F;systematic_synonym(i):label_type%20%3F;isa_partof_closure_label(i):string%20*;regulates_closure_label(i):string%20*;id(i):identifier_type%20%3F;name(i):label_type%20%3F;category(i):label_type%20%3F;node_property(i):string%20%3F;iri(i):iri_type%20%3F;description(i):narrative_text%20%3F;has_phenotype(i):phenotype%20%3F]-%20related%20to(i)%20%3F>\[NamedThing],%20\[MolecularEntity]-%20regulates%20closure(i)%20*>\[RelationshipType],%20\[MolecularEntity]-%20isa%20partof%20closure(i)%20*>\[OntologyClass],%20\[MolecularEntity]-%20in%20taxon(i)%20%3F>\[OrganismTaxon],%20\[MolecularEntity]-%20biomarker%20for%20%3F>\[DiseaseOrPhenotypicFeature],%20\[MolecularEntity]-%20regulates,%20entity%20to%20entity%20%3F>\[MolecularEntity],%20\[MolecularEntity]-%20molecularly%20interacts%20with%20%3F>\[MolecularEntity],%20\[DiseaseOrPhenotypicFeature]-%20correlated%20with(i)%20%3F>\[MolecularEntity],%20\[GeneToGoTermAssociation]-%20subject(i)>\[MolecularEntity],%20\[DiseaseOrPhenotypicFeature]-%20has%20biomarker(i)%20%3F>\[MolecularEntity],%20\[MolecularEntity]-%20molecularly%20interacts%20with%20%3F>\[MolecularEntity],%20\[PairwiseInteractionAssociation]-%20object(i)>\[MolecularEntity],%20\[PairwiseInteractionAssociation]-%20subject(i)>\[MolecularEntity],%20\[MolecularEntity]-%20regulates,%20entity%20to%20entity%20%3F>\[MolecularEntity],%20\[MolecularEntity]uses%20-.->\[ThingWithTaxon],%20\[MolecularEntity]uses%20-.->\[GoTermBioentityMixin],%20\[MolecularEntity]<%20-.-%20inject\[GoTermBioentityMixin],%20\[MolecularEntity]^-\[GenomicEntity],%20\[MolecularEntity]^-\[GeneFamily],%20\[MolecularEntity]^-\[ChemicalSubstance],%20\[BiologicalEntity]^-\[MolecularEntity])
## Mappings

 * [SIO:010004](http://semanticscience.org/resource/SIO_010004)
 * [WD:Q43460564](http://purl.obolibrary.org/obo/WD_Q43460564)
## Inheritance

 *  is_a: [BiologicalEntity](BiologicalEntity.md)
 *  mixin: [ThingWithTaxon](ThingWithTaxon.md) - A mixin that can be used on any entity with a taxon
 *  mixin: [GoTermBioentityMixin](GoTermBioentityMixin.md) - mixes in GO properties to bio-entities
## Children

 * [ChemicalSubstance](ChemicalSubstance.md) - May be a chemical entity or a formulation with a chemical entity as active ingredient, or a complex material with multiple chemical entities as part
 * [GeneFamily](GeneFamily.md) - any grouping of multiple genes or gene products related by common descent
 * [GenomicEntity](GenomicEntity.md) - an entity that can either be directly located on a genome (gene, transcript, exon, regulatory region) or is encoded in a genome (protein)
## Used in

 *  class: **[DiseaseOrPhenotypicFeature](DiseaseOrPhenotypicFeature.md)** *[correlated with](correlated_with.md)* **[MolecularEntity](MolecularEntity.md)**
 *  class: **[GeneToGoTermAssociation](GeneToGoTermAssociation.md)** *[gene to go term association.subject](gene_to_go_term_association_subject.md)* **[MolecularEntity](MolecularEntity.md)**
 *  class: **[DiseaseOrPhenotypicFeature](DiseaseOrPhenotypicFeature.md)** *[has biomarker](has_biomarker.md)* **[MolecularEntity](MolecularEntity.md)**
 *  class: **[MolecularEntity](MolecularEntity.md)** *[molecularly interacts with](molecularly_interacts_with.md)* **[MolecularEntity](MolecularEntity.md)**
 *  class: **[PairwiseInteractionAssociation](PairwiseInteractionAssociation.md)** *[pairwise interaction association.object](pairwise_interaction_association_object.md)* **[MolecularEntity](MolecularEntity.md)**
 *  class: **[PairwiseInteractionAssociation](PairwiseInteractionAssociation.md)** *[pairwise interaction association.subject](pairwise_interaction_association_subject.md)* **[MolecularEntity](MolecularEntity.md)**
 *  class: **[MolecularEntity](MolecularEntity.md)** *[regulates, entity to entity](regulates_entity_to_entity.md)* **[MolecularEntity](MolecularEntity.md)**
## Fields

 * [biomarker for](biomarker_for.md) *subsets*: (translator_minimal)
    * Description: holds between a measurable molecular entity and a disease or phenotypic feature, where the entity is used as an indicator of the presence or state of the disease or feature.
    * range: [DiseaseOrPhenotypicFeature](DiseaseOrPhenotypicFeature.md)
    * __Local__
 * [molecularly interacts with](molecularly_interacts_with.md) *subsets*: (translator_minimal)
    * Description: holds between two entities that make physical contact as part of some interaction
    * range: [MolecularEntity](MolecularEntity.md)
    * __Local__
 * [regulates, entity to entity](regulates_entity_to_entity.md) *subsets*: (translator_minimal)
    * Description: describes an entity that has a direct affect on the state or quality of another existing entity. Use of the 'affects' predicate implies that the affected entity already exists, unlike predicates such as 'affects risk for' and 'prevents, where the outcome is something that may or may not come to be.
    * range: [MolecularEntity](MolecularEntity.md)
    * __Local__
 * [category](category.md) *subsets*: (translator_minimal)
    * Description: Name of the high level ontology class in which this entity is categorized. Corresponds to the label for the biolink entity type class. In a neo4j database this MAY correspond to the neo4j label tag
    * range: [LabelType](LabelType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [description](description.md) *subsets*: (translator_minimal)
    * Description: a human-readable description of a thing
    * range: [NarrativeText](NarrativeText.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [full name](full_name.md)
    * Description: a long-form human readable name for a thing
    * range: [LabelType](LabelType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [has phenotype](has_phenotype.md) *subsets*: (translator_minimal)
    * Description: holds between a biological entity and a phenotype, where a phenotype is construed broadly as any kind of quality of an organism part, a collection of these qualities, or a change in quality or qualities (e.g. abnormally increased temperature). 
    * range: [Phenotype](Phenotype.md)
    * inherited from: [BiologicalEntity](BiologicalEntity.md)
 * [id](id.md) *subsets*: (translator_minimal)
    * Description: A unique identifier for a thing. Must be either a CURIE shorthand for a URI or a complete URI
    * range: [IdentifierType](IdentifierType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [in taxon](in_taxon.md) *subsets*: (translator_minimal)
    * Description: connects a thing to a class representing a taxon
    * range: [OrganismTaxon](OrganismTaxon.md)
    * inherited from: [ThingWithTaxon](ThingWithTaxon.md)
 * [iri](iri.md) *subsets*: (translator_minimal)
    * Description: An IRI for the node. This is determined by the id using expansion rules.
    * range: [IriType](IriType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [isa partof closure](isa_partof_closure.md)
    * Description: Ancestors (reflexive) of the object field following is_a (subClassOf) and part-of links. This is typically used as a query constraint and for faceting. The combination of is_a and part of is a common pattern, and can be used in gene expression queries (finding genes that are expressed in a structure, a subtype, or a part of that structure) or in GO queries (in any of the three branches of GO)
    * range: [OntologyClass](OntologyClass.md)*
    * inherited from: [GoTermBioentityMixin](GoTermBioentityMixin.md)
 * [isa partof closure label](isa_partof_closure_label.md)
    * Description: parent field for fields used for storing the label of the closure concept. See also: closure concept field
    * range: **string***
    * inherited from: [GoTermBioentityMixin](GoTermBioentityMixin.md)
 * [name](name.md) *subsets*: (translator_minimal)
    * Description: A human-readable name for a thing
    * range: [LabelType](LabelType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [node property](node_property.md)
    * Description: A grouping for any property that holds between a node and a value
    * range: **string**
    * inherited from: [NamedThing](NamedThing.md)
 * [regulates closure](regulates_closure.md)
    * Description: Ancestors (reflexive) of the object field following is_a (subClassOf), part-of and regulates (including positive and negative) relationships. This is typically used as a query constraint and for faceting where the range is a biological process
    * range: [RelationshipType](RelationshipType.md)*
    * inherited from: [GoTermBioentityMixin](GoTermBioentityMixin.md)
 * [regulates closure label](regulates_closure_label.md)
    * Description: parent field for fields used for storing the label of the closure concept. See also: closure concept field
    * range: **string***
    * inherited from: [GoTermBioentityMixin](GoTermBioentityMixin.md)
 * [related to](related_to.md)
    * Description: A grouping for any relationship type that holds between any two things
    * range: [NamedThing](NamedThing.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [systematic synonym](systematic_synonym.md)
    * Description: more commonly used for gene symbols in yeast
    * range: [LabelType](LabelType.md)
    * inherited from: [NamedThing](NamedThing.md)
