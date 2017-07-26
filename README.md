# Tools for ISO 20022 standard

Public website: https://tools20022.com

### Artifacts

#### tools20022-core (public)
- Common classes used by generated code.
- Depends on: - 

#### tools20022-generators (licensed)
- Common classes used by generators.
- Depends on: tools20022-core 

#### tools20022-mmgenerator (licensed)
- Generates Java code from an *.ecore file.
- Depends on: tools20022-generators (,tools20022-core) 

#### tools20022-metamodel (public)
- Generated standard metamodel code. Generated from standard ISO ecore with the DefaultMetamodelGenerator.  
- Depends on: tools20022-core 

#### tools20022-repogenerator (licensed)
- Generates Java code from an *.iso20022 file.
- Depends on: tools20022-generators, tools20022-metamodel (,tools20022-core) 

#### tools20022-repository (public)
- Generated standard repository code. Generated from standard ISO eRepository with the DefaultRepositoryGenerator.  
- Depends on: tools20022-core, tools20022-metamodel (,tools20022-core)

#### Planed: tools20022-website (private)
- Source of the https://tools20022.com site.

#### Planed: tools20022-awslambda (private)
- Online generation functions for AWS Lambda.

### Source access types
* public: intended to publish on github and maven-central under Apache licence.
* licensed: intended to use in an online service, or in a licensed version.
* private: internal use only.



[List of TODOs](TODO.md)