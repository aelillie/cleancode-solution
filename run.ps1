$SrcFolder = "src"
$MainClass = "Main"

javac -d target -cp $SrcFolder $SrcFolder/$MainClass.java
java -cp target $MainClass