# The Maps are broken.
======================

Using neo4j-ogm 1.1.3 or earlier, we could map a @QueryResult to an entity that contained a Map<String,String> property. This is no longer the case, I think in the current state, we could use a converter but I don't see why the default converter at least cannot try to convert to this simple structure. The change happened in the newer versions of neo4j-ogm, the MethodWriter was changed to use converters and at the same time the value was coerced without checking if its setter was scalar or not.

To see it working run this command:

 mvn clean test -Dneo4j-ogm.version=1.1.3

To see it break, run this command:

mvn clean test -Dneo4j-ogm.version=1.1.5-SNAPSHOT



