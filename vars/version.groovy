def call() {
	def pkg= readJSON file: 'package.json'
	return "${pkg.version}-${env.BUILD_NUMBER}"

}