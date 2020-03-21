# DataFileParserLibrary

This library allows you to loade data files like name.data. You can call DataParser.parseData(GetDataFile.getData("C:\name")); to generate a ArrayList of Key objects. Note the loader auto adds .data to the end of the name.

Going to what A data file looks like.

@keyname "keyvalue1" "keyvalue2" ;
@key2 "keyvalue1" ;
@startsomething "what" ;

the space is import between the last value of the key and the semicolon.
