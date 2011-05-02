application {
	title='ScalaSample'
	startupGroups=['scalaSample']
	autoShutdown = true
}
mvcGroups {
	'scalaSample' {
		model='app.scala.ScalaSampleModel'
		controller='app.scala.ScalaSampleController'
		view='app.scala.ScalaSampleView'
	}
}
