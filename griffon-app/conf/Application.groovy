application {
    title='ScalaSample'
    startupGroups = ['scalaSample']

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "scalaSample"
    'scalaSample' {
        model = 'ScalaSampleModel'
        view = 'ScalaSampleView'
        controller = 'ScalaSampleController'
    }

}
