pipeline
{
agent any
stages{
stage('clone')
steps{
git https://github.com/lukus999/jenk.git
}
}
stages('build')
{
steps{
sh 'javac hello.java'
}
}
stage('run')
{
steps
{
sh'java hello'
}
}
}

