# Tools for ISO 20022 standard

Public website: https://tools20022.com (Currently not working)

### Artifacts

#### tools20022-core
- Common classes used by generated code.
- Depends on: - 

#### tools20022-generators
- Common classes used by generators.
- Depends on: tools20022-core 

#### tools20022-mmgenerator
- Generates Java code from an *.ecore file.
- Depends on: tools20022-generators (,tools20022-core) 

#### tools20022-metamodel
- Generated standard metamodel code. Generated from standard ISO ecore with the DefaultMetamodelGenerator.  
- Depends on: tools20022-core 

#### tools20022-repogenerator
- Generates Java code from an *.iso20022 file.
- Depends on: tools20022-generators, tools20022-metamodel (,tools20022-core) 

#### tools20022-repository
- Generated standard repository code. Generated from standard ISO eRepository with the DefaultRepositoryGenerator.  
- Depends on: tools20022-core, tools20022-metamodel (,tools20022-core)

#### Planed: tools20022-website
- Source of the https://tools20022.com site.

#### Planed: tools20022-awslambda
- Online generation functions for AWS Lambda.

### Source access types



[List of TODOs](TODO.md)

