$CurrentPath = Get-Location
$TargetFolder = "target"
$TargetPath = Join-Path -Path $CurrentPath -ChildPath $TargetFolder
$LibFolder = "lib"
$LibPath = Join-Path -Path $CurrentPath -ChildPath $LibFolder
$JunitJar = "junit-platform-console-standalone-1.9.1.jar"
$JarPath = Join-Path -Path $LibPath -ChildPath $JunitJar

javac -d $TargetFolder -cp "$TargetPath;$JarPath" src/*.java
java -jar $LibFolder/$JunitJar --class-path $TargetFolder --scan-class-path --disable-banner