def call() {
	echo "hello from the version library"
	 def pkg= readJSON file: 'package.json'
     return "${pkg.version}-${env.BUILD_NUMBER}"

}